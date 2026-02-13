public class FlorArranjo {
    private int idFlorArranjo;
    private int quantidade;
    private Arranjo arranjo;
    private Flor flor;

    public FlorArranjo(int idFlorArranjo, int quantidade, Arranjo arranjo, Flor flor) {
        this.idFlorArranjo = idFlorArranjo;
        this.quantidade = quantidade;
        this.arranjo = arranjo;
        this.flor = flor;
    }

    public int getIdFlorArranjo() {
        return idFlorArranjo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Arranjo getArranjo() {
        return arranjo;
    }

    public Flor getFlor() {
        return flor;
    }

}