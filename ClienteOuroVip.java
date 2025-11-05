public class ClienteOuroVip extends ClienteVip {
    private String endereco;
    
    public ClienteOuroVip(String nome, double ValorDaCompra){
        super(nome, ValorDaCompra);
    }

     public double calcularPagamento() {
        return getValorDaCompra();
    }  
}