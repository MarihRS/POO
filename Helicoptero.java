//CLASSE
public class Helicoptero {

//ATRIBUTOS
    private boolean ligado;
    private double altitude;
    private int capacidade;
    private int qntd_pessoas;

//CONSTRUTOR  só a capacidade
    public Helicoptero (int capacidade){
        this.capacidade = capacidade;
    }

//MÉTODOS if, get e set, toString

//Método 1: IF e ELSE
    public void entra(int capacidade){
        if(capacidade > qntd_pessoas) {
            capacidade = capacidade + 1;
            System.out.printf("Pode entrar");
        }

        else{
            System.out.printf("Não pode.");
        }
    }

    public void sai(int qntd_pessoas){
        if(qntd_pessoas > 0){
            qntd_pessoas = qntd_pessoas - 1;
            System.out.printf("Saia.");
        }    

        else{
            System.out.printf("O helicóptero já está vazio.");
        }
    }

    public void ligar(boolean ligado){
        if(ligado == false){
            System.out.printf("Ligar o helicóptero.");
        }
        
    else{
            System.out.printf("O helicóptero já está ligado.");
        }
    }

    public void decolar(double altitude){
        if(ligado == true && altitude == 0){
            this.altitude = altitude;
            System.out.printf("Decolar!!");
        }

        else{
            System.out.printf("Não pode decolar.");
        }
    }

    public void aterrissar(){
        if(ligado == true && altitude > 0){
            System.out.printf("Pode aterrissar.");
        }

        else{
            System.out.printf("Não é possível aterrissar.");
        }
    }

    public void desligar(){
        if(ligado == true && altitude == 0){
            System.out.printf("Pode desligar.");
        }

        else{
            System.out.printf("Não pode desligar.");
        }
    }

//Método 2 - get (retorna) e set (modifica)

    public boolean getLigado(){
        return ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public double getAltitude(){
        return altitude;
    }
    public void setAltitude(double altitude){
        this.altitude = altitude;
    }

    public int getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public int getQntd_pessoas(){
        return qntd_pessoas;
    }
    public void setQntd_pessoas(int qntd_pessoas){
        this.qntd_pessoas = qntd_pessoas;
    }

    public String toString(){
        return "Ligado:" + ligado + "Altitude: " + altitude + "Capacidade: " + capacidade + "Quantidade de pessoas: " + qntd_pessoas;
    }

//Método 3: imprimir
    public void imprimir(){
        System.out.printf("Capacidade: %d", capacidade);
    }
}