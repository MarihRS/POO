public class CadastroProduto {
    private Produto[] produtos;
    private int qtde;

    public CadastroProduto(int qtde) {
        this.qtde = 0;
        this.produtos = new Produto[qtde];
    }

    public boolean adicionarProduto(Produto pr) {
        if (qtde == this.produtos.length) return false;
        produtos[qtde++] = pr;
        return true;
    }

    public void listarProdutos(){
        for(int i = 0; i < qtde; i++) {
            produtos[i].exibirInfo();
        }
    }

    public Produto buscarPorID(int idProduto) {
        for (int i = 0; i < qtde; i++) {
            if (produtos[i].getIdProduto() == idProduto) {
                return produtos[i];
            }
        }
        return null;
    }

    public void excluirProduto(int idProduto) {
        for (int i = 0; i < qtde; i++) {
            if(produtos[i].getIdProduto() == idProduto) {
                produtos[i] = null;
            }
        }
    }
}