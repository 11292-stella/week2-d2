package Esercizio2;

import java.util.ArrayList;

public class StampaPosizioni {

    public static void stampaElementi(ArrayList<Integer> lista,boolean pari){
        for (int i = 0; i < lista.size() ; i++) {
            if(pari && i % 2 ==0){
                System.out.println("indice" + ": " + lista.get(i));
            } else if (!pari && i % 2 !=0){
                System.out.println("Indice " + i + ": " + lista.get(i));
            }

        }
    }
}
