//CLASSE
public class Calendario {

    //ATRIBUTOS
        private int dia;
        private int mes;
        private int ano;
    
    //CONSTRUTOR
        public Calendario(int dia, int mes, int ano){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    
    //MÉTODOS
        //MÉTODO 1: String nomeMes (int m) que retorne o nome do mês correspondente
        public String nomeMes(int mes){
    
    
            switch (mes){
                case 1: //"caso o mes seja 1, o sistema vai imprimir janeiro"
                        return ("Janeiro");
    
                case 2:
                        return ("Fevereiro");
    
                case 3:
                        return ("Março");
    
                case 4:
                        return ("Abril");
    
                case 5:
                        return ("Maio");
    
                case 6:
                        return ("Junho");
    
                case 7:
                        return ("Julho");
    
                case 8:
                        return ("Agosto");
    
                case 9:
                        return ("Setembro");
    
                case 10:
                        return ("Outubro");
    
                case 11:
                        return ("Novembro");
    
                case 12:
                        return ("Dezembro");
                    
                        default:
                            return ("Mês inválido");
            }
        }
        //MÉTODO 2: mostrar data
        public void mostrarData(int dia, int mes, int ano){
            System.out.println(dia + "de" + nomeMes(mes) + "de" + ano);
                }
    
        public void anoBissexto(int ano){
            if ((ano % 4 == 0 && ano % 100 !=  0) || (ano % 400 == 0)) {
                System.out.printf("O ano é bissexto.");
            } 
            
            else {
                System.out.printf("O ano não é bissexto.");
            
            }
        }
    }