package Esercizio2;

import java.util.ArrayList;
import java.util.Random;

public class Arraylist1 {



    public static ArrayList<Integer> generaNumeri(int n){

        ArrayList<Integer> numeri = new ArrayList<>();


        Random random = new Random();

        for (int i = 0; i < n; i++) {

            int numeriCasuali = random.nextInt(0,101);
            numeri.add(numeriCasuali);

        }

        return numeri;
    }
}
