    //CLASSE
public class Circulo {
    
    //ATRIBUTOS
        private int raio;
    
    //CONSTRUTOR
        public Circulo(int raio){
            this.raio = raio;
        }
    
    //MÉTODO
        public int calcularArea(){
            return 3.141516 * raio * raio;
        }
    
        public int calcularPerimetro(){
            return 2 * 3.141516 * raio;
        }
    
        public void imprimir(){
            System.ou.printf("Raio: %d, Área: %d, Perímetro: %d \n", raio, calcularArea(), calcularPerimetro());
        }
    }