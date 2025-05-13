package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList2 {

    public static ArrayList<Integer> invertiLista(ArrayList<Integer> lista) {
        ArrayList<Integer> listaInvertita = new ArrayList<>();

        for (int i = lista.size() - 1; i >= 0; i--) {
            listaInvertita.add(lista.get(i));
        }

        lista.addAll(listaInvertita);
        return lista;
    }
}
