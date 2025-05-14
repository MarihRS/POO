//CLASSE
public class FitaVideo {

//ATRIBUTOS
    private String titulo;
    private double precoPorDia; 

//CONSTRUTOR
    public FitaVideo(String titulo, double precoPorDia){
        this.titulo = titulo;
        this.precoPorDia = precoPorDia;
    }

//MÉTODO
    public String getTitulo(){
        return titulo;
    }

    public double getPrecoPorDia(){
        return precoPorDia;
    }

    public double getValorAluguel(int numeroDeDiasAlugada){
        return precoPorDia * numeroDeDiasAlugada;
    }

    public void imprimir(int numeroDeDiasAlugada){
        System.out.printf("Título: %s \n", titulo); //%n = adiciona uma nova linha
        System.out.printf("Preço do aluguel por dia: R$ %.2f \n", precoPorDia); //%.2f = pra float ou double
        System.out.printf("Valor do aluguel para %d dias: R$ %.2f \n", numeroDeDiasAlugada, getValorAluguel(numeroDeDiasAlugada)); //%d = inteiro
    }
}