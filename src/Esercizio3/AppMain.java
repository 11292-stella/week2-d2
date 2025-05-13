package Esercizio3;

public class AppMain {

    public static void main(String[] args) {


        Rubrica miaRubrica = new Rubrica();

        miaRubrica.inserisciPersona("Mario","6353728");
        miaRubrica.inserisciPersona("Luigi","65357272");
        miaRubrica.inserisciPersona("Topo Gigio","2726161");
        miaRubrica.inserisciPersona("Sbirulino","27272727");
        miaRubrica.inserisciPersona("Rossi","77777777");

        System.out.println("Rubrica:");
        miaRubrica.stampaRubrica();
        System.out.println("----------------------------");

        System.out.println("Numero di Topo Gigio: " + miaRubrica.cercaNumeroPerNome("Topo Gigio"));
        System.out.println("------------------------------");

        miaRubrica.rimuoviPersona("Rossi");


        System.out.println("Rubrica dopo rimozione:");
        miaRubrica.stampaRubrica();




















    }
}
