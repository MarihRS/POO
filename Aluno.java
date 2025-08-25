//CLASSE
public class Aluno {

    //ATRIBUTOS
        private String nome;
        private int matricula;
        private double nota1;
        private double nota2;
    
    //CONSTRUTOR
        public Aluno(String nome, int matricula, double nota1, double nota2){
            this.nome = nome;
            this.matricula = matricula;
            this.nota1 = nota1;
            this.nota2 = nota2;
        }
    
    //MÉTODOS
    //Método 1- calcular média
        public double calcularMedia() {
            return (nota1 + nota2)/2;
        }
    
    //Método 2 -retorna "Aprovado" se média ≥ 7.0, caso contrário "Reprovado".
        public String situacao(){
            if (calcularMedia() >= 7.0){
                return "Aprovado";
            }
            else {
                return "Reprovado";
            }
        }

    //get matricula p/ usar no método buscarPorMatricula
    public int getMatricula() {
        return matricula;
    }
    
    //Método 3 - imprime na tela nome, matrícula, notas, média e situação.
        public void exibirInfo() {
            System.out.println(
                "Nome: " + nome +
                "Matrícula: " + matricula +
                "Nota1: " + nota1 +
                "Nota2: " + nota2 +
                "Média: " + calcularMedia() +
                "Situação" + situacao());
        }
    }