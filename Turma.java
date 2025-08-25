//CLASSE
public class Turma {

//ATRIBUTOS
    private Aluno[] alunos; //vetor de alunos
    private int qtde; //núm. de alunos cadastrados

//CONSTRUTOR - cria uma turma com capacidade máx. igual ao valor passado no parâmetro
    public Turma(int qtde) {
        this.qtde = 0; //começa com 0 pq n adicionamos alunos
        this.alunos = new Aluno[qtde];
    }

//MÉTODOS
//MET 1 - ADD ALUNO
    public boolean adicionar(Aluno a){
        if (qtde == this.alunos.length) return false; //se a turma tiver cheia, retorna false
        this.alunos[this.qtde++] = a;
        return true; //caso contrário, add o aluno na posição qtde e dps incrementa qtde
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
