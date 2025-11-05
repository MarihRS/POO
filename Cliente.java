public abstract class Cliente {
    private String nome;
    private double ValorDaCompra;

    public Cliente (String nome, double ValorDaCompra) {
        this.nome = nome;
        this.ValorDaCompra = ValorDaCompra;
    }

//MÉTODOS

    public abstract double calcularPagamento ();
    
    public double getValorDaCompra(){
        return ValorDaCompra;
    }

    public String getnome() {
        return nome;
}
}