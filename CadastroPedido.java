public class CadastroPedido {
    private Pedido[] pedidos;
    private int qtde;

    public CadastroPedido(int qtde){
        this.qtde = 0;
        this.pedidos = new Pedido[qtde];
    }

    public boolean adicionar(Pedido p){
        if (qtde == this.pedidos.length) return false;
        pedidos[qtde++] = p;
        return true;
    }

    public void listarPedidos(){
        for(int i = 0; i < qtde; i++) {
            pedidos[i].exibirInfo();
        }
    }

    public Pedido buscarPorID(int idPedido) {
        for (int i = 0; i < qtde; i++) {
            if (pedidos[i].getIdPedido() == idPedido) {
                return pedidos[i];
            }
        }
        return null;
    }

    public void excluirPedido(int idPedido) {
        for (int i = 0; i < qtde; i++) {
            if(pedidos[i].getIdPedido() == idPedido) {
                pedidos[i] = null;
            }
        }
    }
}