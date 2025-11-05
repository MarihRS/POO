//CLASSE
public class Retangulo {

//ATRIBUTOS
    private int comprimento;
    private int largura;

//CONSTRUTOR
    public Retangulo(int comprimento, int largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

//MÉTODO
    public int calcularArea(){
        return comprimento * largura;
    }

    public int calcularPerimetro(){
        return (2 * comprimento) + (2 * largura);
    }

    public void imprimir(){
        System.out.printf("Comprimento: %d, Largura: %d, Área: %d, Perímetro: %d \n", comprimento, largura, calcularArea(), calcularPerimetro());
    }
}
