public class Flor extends Produto {
    private int idFlor;
    private String tipoFlor;
    private String cor;
    private String tamanho;
    private  int estoque;

    public Flor(int idFlor, String tipoFlor, String cor, String tamanho, int estoque, int idProduto, double preco) {
        super(idProduto, preco);
        this.idFlor = idFlor;
        this.tipoFlor = tipoFlor;
        this.cor = cor;
        this.tamanho = tamanho;
        this.estoque = estoque;
    }

    public int getIdFlor() {
        return idFlor;
    }

    public String getTipoFlor() {
        return tipoFlor;
    }

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public int getEstoque() {
        return estoque;
    }
}