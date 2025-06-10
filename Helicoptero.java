
//CLASSE
public class Helicoptero {

//ATRIBUTOS
    private boolean ligado;
    private double altitude;
    private int capacidade;
    private int qntd_pessoas;

//CONSTRUTOR - apenas a capacidade
    public Helicoptero(int capacidade) {
        this.capacidade = capacidade;
    }

//MÉTODO 1 - if e else

    public void adicionaPessoa() {
        if (qntd_pessoas < capacidade) {
            qntd_pessoas++;
            System.out.println("Pessoa adicionada.");
        } else {
            System.out.println("Capacidade máxima atingida. Não é possível adicionar mais pessoas.");
        }
    }

    public void removePessoa() {
        if (qntd_pessoas > 0) {
            qntd_pessoas--;
            System.out.println("Pessoa removida.");
        } else {
            System.out.println("O helicóptero já está vazio.");
        }
    }

    public void ligaHelicoptero() {
        if (!ligado) {
            ligado = true;
            System.out.println("Helicóptero ligado.");
        } else {
            System.out.println("O helicóptero já está ligado.");
        }
    }

    public void helicopteroDecola(double altura) {
        if (ligado && altitude == 0) {
            altitude = altura;
            System.out.println("Decolagem realizada.");
        } else {
            System.out.println("Não é possível decolar.");
        }
    }

    public void helicopteroAterrissar(double altura) {
        if (ligado && altitude >= altura) {
            altitude -= altura;
            System.out.println("Aterrissagem realizada.");
        } else {
            System.out.println("Não é possível aterrissar.");
        }
    }

    public void helicopteroDesliga() {
        if (ligado && altitude == 0) {
            ligado = false;
            System.out.println("Helicóptero desligado.");
        } else {
            System.out.println("Não é possível desligar o helicóptero.");
        }
    }

//MÉTODO 2 - get e set

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQntd_pessoas() {
        return qntd_pessoas;
    }

    public void setQntd_pessoas(int qntd_pessoas) {
        this.qntd_pessoas = qntd_pessoas;
    }

    //MÉTODO - toString
    public String toString() {
        return "Ligado: " + ligado +
               "\nAltitude: " + altitude +
               "\nCapacidade: " + capacidade +
               "\nQuantidade de pessoas: " + qntd_pessoas;
    }

//MÉTODO 3 - imprimir
    public void imprimir() {
        System.out.printf("Capacidade: %d\n", capacidade);
    }
}