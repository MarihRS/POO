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
        if(cilindradas > 300) seguro += 0.8; //+80%
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
    @Override
    public String toString() {
        return String.format(
                "Moto:\n%sCilindradas: %d\nTipo de Partida: %s\nPossui Baú? %s\nPreço de Venda: R$ %.2f\nSeguro: R$ %.2f\n",
                super.toString(), cilindradas, tipoPartida, (possuiBau ? "Sim" : "Não"), calcularPrecoVenda(),
                calcularSeguro());
    }
}
