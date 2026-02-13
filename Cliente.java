public class Cliente {
    private int idCliente;
    private String nome;
    private int telefone;
    private String endereco;

    public Cliente(int idCliente, String nome, int telefone, String endereco) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String toString() {
        return "Id do Cliente: " + idCliente +
            "Nome: " + nome +
            "Telefone: " + telefone +
            "Endereço: " + endereco;
    }

    public void exibirInfo(){
        System.out.println(toString());
    }
}