//CLASSE
public class Quadrado {

//ATRIBUTOS
    private int lado;

//CONSTRUTOR
    public Quadrado(int lado){
        this.lado = lado;
    }

//MÉTODO
    public int calcularArea(){ //int porque temos algo pra retornar
        return lado * lado;
    }

    public int calcularPerimetro(){
        return lado * 4;
    }

    public void imprimir(){
        System.out.printf("Lado: %d, Área: %d, Perímetro: %d \n", lado, calcularArea(), calcularPerimetro());
    }
}