package Esercizio2;

import java.util.ArrayList;

public class AppMain {

    public static void main(String[] args) {

        ArrayList<Integer> lista = Arraylist1.generaNumeri(5);
        ArrayList<Integer> listaDoppia = ArrayList2.invertiLista(lista);

        System.out.println("Elementi in posizione pari:");
        StampaPosizioni.stampaElementi(listaDoppia,true);

        System.out.println("Elementi in posizione dispari:");
        StampaPosizioni.stampaElementi(listaDoppia,false);
    }
}
