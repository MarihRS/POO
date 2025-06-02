//CLASSE
public class Professor {

//ATRIBUTOS
    private int matricula;
    private String nome;
    private String nomeDepartamento;

//CONSTRUTOR
    public Professor(int matricula, String nome, String nomeDepartamento){
        this.matricula = matricula;
        this.nome = nome;
        this.nomeDepartamento = nomeDepartamento;
    }

//MÉTODOS
//MÉTODO 1 = get(retorna) e set(imprime e modifica)
    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){ //SET SEMPRE É VOID
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNomeDepartamento(){
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento){
        this.nomeDepartamento = nomeDepartamento;
    }

//MÉTODO 2 = imprimir
    public void imprimir(){
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Matrícula: %d\n", matricula);
        System.out.printf("Nome do departamento: %s\n", nomeDepartamento);
    }
}