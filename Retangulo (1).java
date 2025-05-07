public class Retangulo {
    //Atributos
    private int Comprimento;
    private int largura;

    //Construtor
    public Retangulo ( int Comprimento, int largura){
        this.Comprimento = Comprimento;
        this.largura = largura;
    }
    //Métodos
    public int calcularArea(){
        return Comprimento * largura;
    }
    public int calcularperimetro(){
        return 2 * Comprimento + 2 * largura; 
    }
    public void imprimir(){                  
        System.out.printf("Retangulo: %d, Àrea: %d, perimetro: %d/n", Comprimento, largura, calcularArea(), calcularperimetro());
    }


}
