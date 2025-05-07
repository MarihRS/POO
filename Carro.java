//CLASSE
public class Carro {

//ATRIBUTOS
    private String fabricante;
    private String modelo;
    private int ano;
    private int velocidade;
    
//CONSTRUTOR
    public Carro(String fabricante, String modelo, int ano){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        //não teremos a velocidade pq se não a gente dá a liberdade do carro ser construído a 100km/h, por exemplo
    }

//MÉTODO GET - ACESSADOR
    public String getFabricante(){ //aí o atributo tem que ser com inicial maiúscula
        return fabricante;
    }
    public String getModelo(){ //o () é vazio pq já indicamos o método, nesse caso, String
        return modelo;
    }
    public int getAno(){
        return ano;
    }
    public int getVelocidade(){
        return velocidade;
    }

//MÉTODO SET - MODIFICADOR
    public void setFabricante(String fabricante){ //não tem retorno
        this.fabricante = fabricante; 
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    
//MÉTODO
    public void acelerar(){
        velocidade = velocidade + 10;
    }
}