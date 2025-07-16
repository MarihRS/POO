import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String dias[] = new String[7]; //[] indica que é um vetor. Criamos o "prédio" mas n colocamos ninguém, ele tá vazio
        
        System.out.println("digite os dias da semana: "); //colocamos isso pro usuário poder digitar os dias da semana já que, como usamos o scanner, não definimos 
        for(int i = 0; i < dias.length; i++)
            dias[i] = teclado.nextLine(); //a partir daq colocamos as pessoas nos "apartamentos" (até a linha 11)

//usaremos o for que é um laço que serve para quando não queremos repitir a mesma função pra todos os itens da lista
        for(int i = 0; i < dias.length; i++){ //i recebe 0; se i for menor que 7 (minha capacidade) ele; //fizemos isso pra mostrar as "pessoas" de cada "apartamento"
            System.out.println(dias[i]);
        }
    }
}