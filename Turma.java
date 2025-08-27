//CLASSE
public class Turma {

//ATRIBUTOS
    private Aluno[] alunos; //vetor de obj do tipo Aluno, q armazenará todos os alunos da turma
    private int qtde; //núm. de alunos cadastrados na turma

//CONSTRUTOR - cria uma turma com capacidade máx. igual ao valor passado no parâmetro
    public Turma(int qtde) {
        this.qtde = 0; //começa com 0 pq n adicionamos alunos
        this.alunos = new Aluno[qtde]; //cria o vetor de alunos com o tamanho definido pelo parâmetro, mas ainda vazio
    }

//MÉTODOS
//MET 1 - ADD ALUNO
    public boolean adicionar(Aluno a){ //Aluno a - add um aluno
        if (qtde == this.alunos.length) return false; //se a turma tiver cheia, retorna false
        alunos[qtde++] = a; 
        return true; //caso contrário, retorna true e add o aluno na primeira posição livre do vetor
    }

//MET 2 - listar alunos
    public void listarAlunos() {
        for (int i = 0; i < qtde; i++) { //percorre todos os alunos cadastrados
            alunos[i].exibirInfo(); //p/ cada aluno, imprime todas as infos chamando exibirInfo()
        }
    }

//MET 3 - retorna o aluno com a matrícula correspondente (ou null se não encontrado).
    public Aluno buscarPorMatricula(int matricula) {
       for (int i = 0; i < qtde; i++) { //percorre todos os alunos cadastrados
        if (alunos[i].getMatricula() == matricula) { //p/ cada aluno, compara a matrícula do aluno com a q foi passada como parâmetro
            return alunos[i]; //se encontrar, retorna o obj Aluno correspondente
        }
       }
       return null; // se n encontrar, retorna null
    }
}


