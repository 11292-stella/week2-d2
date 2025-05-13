package esercizio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Numeri {

    public static void main(String[] args) {

        HashSet<String> parole = new HashSet<>();
        ArrayList<String> duplicati = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("quante parole vuoi inserire?");
        int numeroParole = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numeroParole; i++) {

            System.out.println("dammi una parola");
            String parola = scanner.nextLine();

            if(!parole.add(parola)){
                duplicati.add(parola);
            }


        }

        System.out.println("Parole duplicate sono: " + duplicati);
        System.out.println("Numero di parole non duplicate: " + parole.size());
        System.out.println("Elenco delle parole non duplicate: " + parole);







    }
}
