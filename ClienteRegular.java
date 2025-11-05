public class ClienteRegular extends Cliente {
    
    public ClienteRegular(String nome, double ValorDaCompra){
        super(nome, ValorDaCompra);
    }

    public double calcularPagamento() {
        return getValorDaCompra();
    }  
}