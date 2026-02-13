    import java.util.ArrayList;
    import java.util.List;

public class Arranjo extends Produto {
    private int idArranjo;
    private String tipoArranjo;
    private Produto produto;
    List<FlorArranjo> arranjos = new ArrayList<FlorArranjo>();

    public Arranjo(int idArranjo, String tipoArranjo, Produto produto, int idProduto, double preco) {
        super(idProduto, preco);
        this.idArranjo = idArranjo;
        this.tipoArranjo = tipoArranjo;
        this.produto = produto;
    }


    public int getIdArranjo() {
        return idArranjo;
    }

    public String getTipoArranjo() {
        return tipoArranjo;
    }

    public Produto getProduto() {
        return produto;
    }

    public static void main(String[] args) {
        List<Arranjo> arranjos = new ArrayList<>();

    }
}