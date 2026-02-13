public class Produto {
    private  int  idProduto;
    private double preco;

    public Produto(int idProduto, double preco) {
        this.idProduto = idProduto;
        this.preco = preco;
        }

    public int getIdProduto() {
        return idProduto;
    }

    public double getPreco() {
        return preco;
    }

    public String toString(){
        return "ID do produto: " + idProduto +
                "Preço: " + preco;
    }

    public void exibirInfo(){
        System.out.println(toString());
    }
}