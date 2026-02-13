public class CadastroFlor {
    private Flor[] flor;
    private int qtde;

    public CadastroFlor(int qtde) {
        this.qtde = 0;
        this.flor = new Flor[qtde];
    }

    public boolean adicionarFlor(Flor fl) {
        if (qtde == this.flor.length) return false;
        flor [qtde++] = fl;
        return true;
    }

    public void listarFlor(){
        for(int i = 0; i < qtde; i++) {
            flor[i].exibirInfo();
        }
    }

    public Flor buscarPorID(int idFlor) {
        for (int i = 0; i < qtde; i++) {
            if (flor[i].getIdFlor() == idFlor) {
                return flor[i];
            }
        }
        return null;
    }

    public void excluirFlor(int idFlor) {
        for (int i = 0; i < qtde; i++) {
            if(flor[i].getIdFlor() == idFlor) {
                flor[i] = null;
            }
        }
    }
}

