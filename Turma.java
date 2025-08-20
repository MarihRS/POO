import java.util.scanner;

//CLASSE
public class Turma {

//ATRIBUTOS
    private Aluno[] alunos;
    private int qtde;

//CONSTRUTOR
    public Turma(int qtde) {
        this.qtde = 0;
        this.alunos = new Aluno[qtde];
    }

//MÉTODOS
//MET 1 - ADD ALUNO
    public boolean add(Aluno a){
        if (qtde == this.alunos.length) return falso;
        this.alunos[this.qtde++] = a;
        return true;
    }

//MET 2 - listar alunos
    public void listarAlunos() {
        for (int i = 0; i < qtde; i++) {
            System.out.println(Aluno[i]);
        }
    }

//MET 3 - retorna o aluno com a matrícula correspondente (ou null se não encontrado).
    public Aluno buscarPorMatricula(int matricula) {
        if (this.qtde == 0) return null;
        for (Aluno a : this.alunos) {
            if (a.buscarPorMatricula() == matricula) { 
            return a;
        }
    }
        return null;
}
}