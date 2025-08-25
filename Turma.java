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
    public boolean adicionar(Aluno a){
        if (qtde == this.alunos.length) return false;
        this.alunos[this.qtde++] = a;
        return true;
    }

//MET 2 - listar alunos
    public void listarAlunos() {
        for (int i = 0; i < qtde; i++) {
            System.out.println(alunos[i]);
        }
    }

//MET 3 - retorna o aluno com a matrícula correspondente (ou null se não encontrado).
    public Aluno buscarPorMatricula(int matricula) {
        if (this.qtde == 0) return null;
        for (Aluno a : this.alunos) {
            if (a.getMatricula() == matricula) { 
            return a;
        }
    }
        return null;
    }
}