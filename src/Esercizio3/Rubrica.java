package Esercizio3;

import java.util.HashMap;
import java.util.Set;

public class Rubrica {

    HashMap<String,String> rubrica;

    public Rubrica() {
        rubrica = new HashMap<>();
    }

    public void inserisciPersona(String nome,String numero){

        rubrica.put(nome, numero);

    }

    public void rimuoviPersona(String nome){
        rubrica.remove(nome);
    }

    public void stampaRubrica() {
        for (String nome : rubrica.keySet()) {
            String numero = rubrica.get(nome);
            System.out.println("Nome: " + nome + ", Numero: " + numero);
        }
    }

    public String cercaNumeroPerNome(String nome) {
        return rubrica.get(nome);
    }

    public String cercaNomePerNumero(String numero) {
        for (String nome : rubrica.keySet()) {
            if (rubrica.get(nome).equals(numero)) {
                return nome;
            }
        }
        return null;  // Non trovato
    }




}
