package esercizio4;

public class AppMain {

    public static void main(String[] args) {

        Contatto c1 = new Contatto("Topo","Gigio","546372","topo54@live.it");
        Contatto c2 = new Contatto("Mickey","mouse","564647","mouse76@live.it");
        Contatto c3 = new Contatto("Berny","Be","7666998","Berny76@live.it");
        Contatto c4 = new Contatto("Ivo","Avido","7876554","IvoAvo76@live.it");
        Contatto c5 = new Contatto("Satanasso","Marik","5555333","Satanasso76@live.it");
        Contatto c6 = new Contatto("Gio","Marik","5555333","Satanasso76@live.it");



        RubricaTelefonica c = new RubricaTelefonica();
        c.aggiungiContatto(c1);
        c.aggiungiContatto(c2);
        c.aggiungiContatto(c3);
        c.aggiungiContatto(c4);
        c.aggiungiContatto(c5);
        c.aggiungiContatto(c6);


        System.out.println("rubrica");
        c.stampaRubrica();
        System.out.println("-----------------------------------");
        System.out.println("Numero di Topo Gigio: " + c.cercaContatto("Topo"));
        System.out.println("--------------------------------------------------");
        c.eliminaContatto("Gio");
        System.out.println("Rubrica dopo rimozione:");
        c.stampaRubrica();

    }
}
