package esercizio4;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {

    HashMap<String,Contatto> contatti = new HashMap<>();

    public void aggiungiContatto(Contatto contatto){

        contatti.put(contatto.getNome(),contatto);
    }

    public void eliminaContatto(String nome){

        contatti.remove(nome);
    }

    public Contatto cercaContatto(String nome ){
        return contatti.get(nome);
    }

    public void stampaRubrica(){
        for(Contatto c: contatti.values()){
            System.out.println(c);
        }
    }





}
