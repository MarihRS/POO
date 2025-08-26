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
        alunos[qtde++] = a; // add o aluno na posição qtde e dps incrementa qtde p/ a próxima posição
        return true; //retorna true caso o aluno seja add
    }

//MET 2 - listar alunos
    public void listarAlunos() { //listarAlunos() - exibe todas as info de todos os alunos cadastrados na turma
        for (int i = 0; i < qtde; i++) { //percorre o vetor alunos até qtde (só percorre os alunos cadastrados)
            alunos[i].exibirInfo(); //chama o método de Aluno que imprime as infos do aluno
        }
    }

//MET 3 - retorna o aluno com a matrícula correspondente (ou null se não encontrado).
    public Aluno buscarPorMatricula(int matricula) { //procura um aluno específico usando a matrícula
       for (int i = 0; i < qtde; i++) { //percorre o vetor até qtde
        if (alunos[i].getMatricula() == matricula) { //compara a matrícula do aluno com a q foi passada como parâmetro
            return alunos[i]; //se encontrar, retorna o obj Aluno correspondente
        }
       }
       return null; // se n encontrar, retorna null
    }
}

