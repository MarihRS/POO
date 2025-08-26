import java.util.Scanner;

public class PrincipalAlunoTurma {
    public static void main(String[]  args) {
        Scanner teclado = new Scanner(System.in);

//Criando uma turma
        Turma t = new Turma(3);
        String nome;
        int matricula;
        double nota1;
        double nota2;

        for(int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do aluno: ");
            nome = teclado.nextLine();

            System.out.println("Digite a matrícula: ");
            matricula = teclado.nextInt(); teclado.nextLine();

            System.out.println("Digite a primeira nota: ");
            nota1 = teclado.nextDouble(); teclado.nextLine();

            System.out.println("Digite a segundo nota: ");
            nota2 = teclado.nextDouble(); teclado.nextLine();

            t.adicionar(new Aluno(nome, matricula, nota1, nota2));
        }
        //listar alunos
        System.out.println("=== Lista de alunos ===");
            t.listarAlunos();

        //Busca de alunos por matrícula
        System.out.println("=== Busca de alunos por matrícula ===")
        System.out.println("Digite a matrícula do aluno que você procura: ");
        int buscarPorMatricula = teclado.nextInt();
        
        Aluno encontrado = t.buscarPorMatricula(buscarPorMatricula);
        if (encontrado != null) {
            encontrado.exibirInfo();
        }
        else {
            System.out.println("Aluno não encontrado.");
        }

        teclado.close();

    }
}
