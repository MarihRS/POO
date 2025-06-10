public class PrincipalHelicoptero {
    public static void main(String[] args){

//Criando 2 helicópteros
    Helicoptero h1 = new Helicoptero(4);
    Helicoptero h2 = new Helicoptero(8);

//Exibindo o estado atual dos helicópteros
    System.out.println(h1);
    System.out.println(h2);

//Adicionando pessoas no h1
    h1.adicionaPessoa();
    h1.adicionaPessoa();
    h1.adicionaPessoa();
    h1.adicionaPessoa();
    h1.adicionaPessoa();

//Adicionando pessoas no h2
    h2.adicionaPessoa();
    h2.adicionaPessoa();
    h2.adicionaPessoa();
    h2.adicionaPessoa();
    h2.adicionaPessoa();

//Ligando os helicópteros
    h1.ligaHelicoptero();
    h2.ligaHelicoptero();

//Decolando h1 e h2
    h1.helicopteroDecola(350);
    h2.helicopteroDecola(490);

//Exibindo o estado de h1 e h2
    System.out.println(h1);
    System.out.println(h2);

//Aterrissando h1 e h2
    h1.helicopteroAterrissar(350);
    h2.helicopteroAterrissar(490);

//Desligando h1 e h2
    h1.helicopteroDesliga();
    h2.helicopteroDesliga();

//Removendo pessoas do h1
    h1.removePessoa();
    h1.removePessoa();
    h1.removePessoa();
    h1.removePessoa();
    h1.removePessoa();

//Removendo pessoas do h2
    h2.removePessoa();
    h2.removePessoa();
    h2.removePessoa();
    h2.removePessoa();
    h2.removePessoa();

//Exibindo estado do h1 e h2
    Systemout.println(h1);
    System.out.println(h2);
    
    }
}