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

    public void stampaRubrica(){
        for (HashMap.Entry<String, String> entry : rubrica.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Numero: " + entry.getValue());
        }
    }
    public String cercaNumeroPerNome(String nome) {
        return rubrica.get(nome);
    }

    public String cercaNomePerNumero(String numero){

        for (HashMap.Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(numero)) {
                return entry.getKey();  // Restituisce il nome associato al numero
            }
        }
        return null;  // Se non trovato
    }




}
