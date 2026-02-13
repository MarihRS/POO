public class ItemPedido {
    private int idItemPedido;
    private Produto produto;
    private int quantidade;
    private Pedido pedido;

    public ItemPedido(int idItemPedido, Produto produto, int quantidade, Pedido pedido) {
        this.idItemPedido = idItemPedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.pedido = pedido;
    }

    public int getIdItemPedido() {
        return idItemPedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public String toString(){
        return "ID item do pedido: " + idItemPedido +
                "Produto: " + produto +
                "Quantidade: " + quantidade +
                "Pedido: " + pedido;
    }
}