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
    public double calcularPrecoVenda(){
        double precoVenda = getPrecoBase();
        precoVenda += capacidadeCarga * 1000;
        precoVenda += numeroEixos * 15000;
        return precoVenda;
    }

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
    public String toString(){
        return "Caminhão - %s" +
                "Capacidade de Carga: %.1f toneladas" + capacidadeCarga +
                "Número de Eixos: %d" + numeroEixos +
                "Tipo de Carroceria: %s" + tipoCarroceria +
                "Preço de venda: R$ %.2f" + calcularPrecoVenda() +
                "Seguro: R$ %.2f" + calcularSeguro() +
                super.toString();
    }
}