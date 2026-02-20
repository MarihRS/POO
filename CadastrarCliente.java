public class CadastrarCliente {
    private Cliente[] clientes;
    private int qtde;

    public CadastrarCliente(int qtde){
        this.qtde = 0;
        this.clientes = new Cliente[qtde];
    }

    public void listarClientes(){
        for (int i = 0; i < qtde; i++){
            clientes[i].exibirInfo();
        }
    }

}
