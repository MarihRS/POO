public class CadastroArranjo {
private Arranjo[] arranjo;
    private int qtde;

    public CadastroArranjo(int qtde) {
        this.qtde = 0;
        this.arranjo = new Arranjo[qtde];
    }

    public boolean adicionarArranjo(Arranjo ar) {
        if (qtde == this.arranjo.length) return false;
        arranjo[qtde++] = ar;
        return true;
    }

    public void listarArranjo(){
        for(int i = 0; i < qtde; i++) {
            arranjo[i].exibirInfo();
        }
    }

    public Arranjo buscarPorID(int idArranjo) {
        for (int i = 0; i < qtde; i++) {
            if (arranjo[i].getIdArranjo() == idArranjo) {
                return arranjo[i];
            }
        }
        return null;
    }

    public void excluirArranjo(int idArranjo) {
        for (int i = 0; i < qtde; i++) {
            if(arranjo[i].getIdArranjo() == idArranjo) {
                arranjo[i] = null;
            }
        }
    }
}

