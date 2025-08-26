//CLASSE
public class Aluno {

    //ATRIBUTOS
        private String nome;
        private int matricula;
        private double nota1;
        private double nota2;
    
    //CONSTRUTOR - adiciona novos objetos a classe
        public Aluno(String nome, int matricula, double nota1, double nota2){
            this.nome = nome;
            this.matricula = matricula;
            this.nota1 = nota1;
            this.nota2 = nota2;
        }
    
    //MÉTODOS
    //Método 1- calcular média
        public double calcularMedia() {
            return (nota1 + nota2)/2; //retorna as 2 notas  do aluno e divide p/ 2 pra dar a média
        }
    
    //Método 2 -retorna "Aprovado" se média ≥ 7.0, caso contrário "Reprovado".
        public String situacao(){
            if (calcularMedia() >= 7.0){ //se a média for maior ou igual a 7.0, retorna aprovado
                return "Aprovado!";
            }
            else {
                return "Reprovado!"; //se n, retorna reprovado
            }
        }

    //get matricula p/ usar no método buscarPorMatricula e nome (retorna a matricula e o nome)
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    //Método 3 - imprime na tela nome, matrícula, notas, média e situação.
        public String toString() { //representa o obj como uma String, mostrando todas as infos do aluno
            return "Nome: " + nome + 
                " | Matrícula: " + matricula +
                " | Nota1: " + nota1 +
                " | Nota2: " + nota2 +
                " | Média: " + calcularMedia() +
                " | Situação: " + situacao();
        }

        public void exibirInfo(){ //imprime na tela as info do aluno
            System.out.println(toString()); //chama o toString() internamente para pegar a representção completa do obj
        }
    }

