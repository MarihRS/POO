public class PrincipalFloricultura {
    public static void main(String[] args) {

        Floricultura f = new Floricultura();

    CadastrarCliente cliente = new CadastrarCliente(5);
    CadastroProduto produto = new CadastroProduto(10);
    CadastroFlor flor = new CadastroFlor(10);
    CadastroArranjo arranjo = new CadastroArranjo(10);
    CadastroPedido pedido = new CadastroPedido(10);
    

//cliente
    cliente.cadastrarCliente();
    cliente.adicionarCliente();
    cliente.listarClientes();

//produto
    produto.adicionarProduto();
    produto.listarProdutos();
    produto.buscarPorID();
    produto.excluirProduto();

//pedido
    pedido.adicionarPedido();
    pedido.listarPedidos();
    pedido.buscarPorIDPe();
    pedido.excluirPedido();

//flor
    flor.adicionarFlor();
    flor.listarFlores();
    flor.buscarPorIDFl();
    flor.excluirFlor();

//arranjo
    arranjo.adicionarArranjo();
    arranjo.listarArranjo();
    arranjo.buscarPorIDAr();
    arranjo.excluirArranjo();
    }
}