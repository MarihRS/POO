public class Quadrado {
    //Atributos
    private int lado;

    //Construtor
    public Quadrado ( int lado){
        this.lado = lado;
    }

    //Métodos
    public int calcularArea(){
        return lado * lado;
    }
    public int calcularperimetro(){
        return 4 * lado;
    }
    public void imprimir(){                  
        System.out.printf("lado: %d, Àrea: %d, perimetro: %d/n", lado, calcularArea(), calcularperimetro());
    }


}
