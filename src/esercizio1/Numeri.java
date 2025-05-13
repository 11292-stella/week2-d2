package esercizio1;

import java.util.HashSet;
import java.util.Scanner;

public class Numeri {

    public static void main(String[] args) {

        HashSet<String> parole = new HashSet<>();
        HashSet<String> duplicati = new HashSet<>();

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

        System.out.println("Parole duplicate: " + duplicati);
        System.out.println("Numero di parole distinte: " + parole.size());
        System.out.println("Elenco delle parole distinte: " + parole);







    }
}
