public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double precoBase;

//CONSTRUTOR
    public Veiculo(String marca, String modelo, int ano, double precoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precoBase = precoBase;
    }

//MÉTODOS ABSTRATOS
    public abstract double calcularPrecoVenda();
    public abstract double calcularSeguro();

//MÉTODOS CONCRETOS
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public double getPrecoBase(){
        return precoBase;
    }

     @Override
    public String toString() {
        return String.format("Marca: %s\nModelo: %s\nAno: %d\nPreço base: R$ %.2f\n",
                marca, modelo, ano, precoBase);
    }
}
