//CLASSE
   public class Circulo {
    
    //ATRIBUTOS
        private int raio;
    
    //CONSTRUTOR
        public Circulo(int raio){
            this.raio = raio;
        }
    
    //MÉTODO
        public double calcularArea(){
            return 3.141516 * raio * raio;
        }
    
        public double calcularPerimetro(){
            return 2 * 3.141516 * raio;
        }
    
        public void imprimir(){
            System.out.printf("Raio: %d, Área: %d, Perímetro: %d \n", raio, calcularArea(), calcularPerimetro());
        }
}