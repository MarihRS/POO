public class ClienteVip extends Cliente{
    private String numeroCartao;

    public ClienteVip(String nome, double ValorDaCompra){
        super(nome, ValorDaCompra);
    }

    public double calcularPagamento() {
        return getValorDaCompra();
    }  
}