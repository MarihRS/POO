public class PrincipalCalendario {
    public static void main(String[] args){
        Calendario c1 = new Calendario(18, 6, 2007);
        Calendario c2 = new Calendario(7, 5, 2000);

//MOSTRAR PRIMEIRA DATA E VERIFICAR SE É ANO BISSEXTO
        c1.mostrarData();
        c1.anoBissexto();

//MOSTRAR SEGUNDA DATA E VERIFICAR SE É ANO BISSEXTO
        c2.mostrarData();
        c2.anoBissexto();
    }
}
