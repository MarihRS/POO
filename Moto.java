public class Moto extends Veiculo {
    private  int cilindradas;
    private String tipoPartida;
    private boolean possuiBau;

    public Moto(String marca, String modelo, int ano, double precoBase, int cilindradas, String tipoPartida, boolean possuiBau){
        super(marca, modelo, ano, precoBase);
        this.cilindradas = cilindradas;
        this.tipoPartida = tipoPartida;
        this.possuiBau = possuiBau;
    }

//MÉT. CONCRETOS
    @Override
    public double calcularPrecoVenda() {
        double precoVenda = getPrecoBase();
        if(cilindradas > 300) precoVenda += 2000;
        if(possuiBau) precoVenda += 800; //como a var. já é boolean, pode usar ela diretamente no if
        return precoVenda;
    }

    @Override
    public double calcularSeguro() {
        double seguro = getPrecoBase() * 0.02;
        if(cilindradas > 300) seguro += 1.8; //+80%
        return seguro;
    }

//MÉT. GET
    public int getCilindradas(){
        return cilindradas;
    }

    public String getTipoPartida(){
        return tipoPartida;
    }

    public boolean getPossuiBau(){
        return possuiBau;
    }

//MÉT. toString() herdado da mãe 
    public String toString(){
        return "Moto - %s" +
                "Cilindradas: %d" + cilindradas +
                "Tipo de Partida: %s" + tipoPartida +
                "Possui Baú? %s" + possuiBau +
                "Preço de Venda: R$ %.2f" + calcularPrecoVenda() +
                "Seguro: R$ %.2f" + calcularSeguro();
    }
}