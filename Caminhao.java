public class Caminhao extends Veiculo {
    private double capacidadeCarga;
    private int numeroEixos;
    private String tipoCarroceria;

    public Caminhao(String marca, String modelo, int ano, double precoBase, double capacidadeCarga, int numeroEixos, String tipoCarroceria){
        super(marca, modelo, ano, precoBase);
        this.capacidadeCarga = capacidadeCarga;
        this.numeroEixos = numeroEixos;
        this.tipoCarroceria = tipoCarroceria;
    }

//MÉT. CONCRETOS
    @Override
    public double calcularPrecoVenda(){
        double precoVenda = getPrecoBase();
        precoVenda += capacidadeCarga * 1000;
        precoVenda += numeroEixos * 15000;
        return precoVenda;
    }

    @Override
    public double calcularSeguro(){
        double seguro = getPrecoBase() * 1.5;
        seguro += capacidadeCarga * 500;
        seguro += numeroEixos * 1000;
        return seguro;
    }

//MÉT. GET
    public double getCapacidadeCarga(){
        return capacidadeCarga;
    }

    public int getNumeroEixos(){
        return numeroEixos;
    }

    public String getTipoCarroceria(){
        return tipoCarroceria;
    }

//MÉT. toString() herdado da mãe 
      @Override
    public String toString() {
        return String.format(
                "Caminhão:\n%sCapacidade de Carga: %.1f toneladas\nNúmero de Eixos: %d\nTipo de Carroceria: %s\nPreço de venda: R$ %.2f\nSeguro: R$ %.2f\n",
                super.toString(), capacidadeCarga, numeroEixos, tipoCarroceria, calcularPrecoVenda(), calcularSeguro());
    }
}
