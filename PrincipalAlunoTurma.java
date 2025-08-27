import java.util.Scanner; //importa a classe scanner (classe q permite ler dados do usuário pelo teclado)

public class PrincipalAlunoTurma {
    public static void main(String[]  args) { //método main, onde o programa começa a executar
    //criando o scanner teclado
        Scanner teclado = new Scanner(System.in); 

//Criando uma turma
        Turma t = new Turma(3); //cria um obt Turma chamado t com cap. 3 alunos
        String nome;
        int matricula;
        double nota1;
        double nota2;

        for(int i = 0; i < 3; i++) { //laço que vai repetir 3 vezes
            System.out.println("Digite o nome do aluno: ");
            nome = teclado.nextLine();

            System.out.println("Digite a matrícula: ");
            matricula = teclado.nextInt(); teclado.nextLine(); //teclado.nextInt(); teclado.nextLine() - evita q pule a próxima entrada

            System.out.println("Digite a primeira nota: ");
            nota1 = teclado.nextDouble(); teclado.nextLine();

            System.out.println("Digite a segundo nota: ");
            nota2 = teclado.nextDouble(); teclado.nextLine();

            t.adicionar(new Aluno(nome, matricula, nota1, nota2)); //cria um novo obj Aluno com as info inseridas
            //chama o met. add da Turma t p/ add o aluno no vetor da turma
        }
        //listar alunos
        System.out.println("=== Lista de alunos ===");
            t.listarAlunos(); //exibe a lista completa de alunos

        //Busca de alunos por matrícula - lê a mat. desejada e armazena na variável buscarPorMatricula 
        System.out.println("=== Busca de alunos por matrícula ===");
        System.out.println("Digite a matrícula do aluno que você procura: ");
        int buscarPorMatricula = teclado.nextInt();
        
        Aluno encontrado = t.buscarPorMatricula(buscarPorMatricula); //chama buscarPorMatricula e armazena o resultado encontrado
        if (encontrado != null) { //se encontrado for diferente de null mostra as infos do aluno com exibirInfo()
            encontrado.exibirInfo(); 
        }
        else {
            System.out.println("Aluno não encontrado."); //se n, exibe a msg
        }

        teclado.close(); //fecha o scanner

    }
}

