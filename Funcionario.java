//CLASSE
public class Funcionario {

//ATRIBUTOS
    private int codigo;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int idade;
    private double salario;

//CONSTRUTOR
    public Funcionario(int codigo, String nome, String cpf, String endereco, String telefone, int idade, double salario){
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

//MÉTODOS
    //MÉTODO 1: get(retorna) e set(modifica)
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCPF(){
        return cpf;
    }
    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getSalario(){
        return salario;
    }
    public void setsalario(double salario){
        this.salario = salario;
    }

    //MÉTODO 2: toString
    public String toString(){
        return "Código:" + codigo + " Nome:" + nome + " CPF:" + cpf + " Endereço:" + endereco + " Telefone:" + telefone + " Idade:" + idade + " Salário:" + salario;
    }

    //MÉTODO 3: calcular salário
    public double calcularSalarioLiquido(){
        return salario * 0.89; //-11% = 0.89
    }

    //MÉTODO 4: imprimir 
    public void imprimir(){
    System.out.printf("Código: %d\n", codigo);
    System.out.printf("Nome: %s\n", nome);
    System.out.printf("CPF: %s\n", cpf);
    System.out.printf("Endereço: %s\n", endereco);
    System.out.printf("Telefone: %s\n", telefone);
    System.out.printf("Idade: %d\n", idade);
    System.out.printf("Salário: %.2f", salario);
    
    }
}