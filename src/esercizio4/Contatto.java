package esercizio4;

public class Contatto {

    private String nome;
    private String cognome;
    private String numero;
    private String email;

    public Contatto(String nome, String cognome, String numero, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.numero = numero;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contatto{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", numero=" + numero +
                ", email='" + email + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }
}
