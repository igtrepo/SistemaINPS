import java.util.ArrayList;

public class Paziente {
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private int eta;
    private String indirizzo;
    private String telefono;
    private String email;
    private ArrayList<Diagnosi> diagnosiList;

    public Paziente() {
    }

    public Paziente(String nome, String cognome, String codiceFiscale, int eta, String indirizzo, String telefono, String email, ArrayList<Diagnosi> diagnosiList) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.eta = eta;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
        this.email = email;
        this.diagnosiList = diagnosiList;
    }

    public Paziente(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Paziente{" + "nome='" + nome + '\'' + ", cognome='" + cognome + '\'' + ", codiceFiscale='" + codiceFiscale + '\'' + ", eta=" + eta + ", indirizzo='" + indirizzo + '\'' + ", telefono='" + telefono + '\'' + ", email='" + email + '\'' + ", diagnosiList=" + diagnosiList + '}';
    }

    public void stampaPaziente() {
        System.out.println("Paziente: " + cognome + ", " + nome + "\nCodice Fiscale: " + codiceFiscale + "\nContatti: " + telefono + ", " + email + ", " + indirizzo);
    }

    public void aggiungiDiagnosi(Diagnosi diagnosi) {
        diagnosiList.add(diagnosi);
    }

    public void modificaDati(String nuovoIndirizzo, String nuovoTelefono, String nuovaMail) {
        this.indirizzo = nuovoIndirizzo;
        this.telefono = nuovoTelefono;
        this.email = nuovaMail;
    }

    public void stampaDiagnosi() {
        if (diagnosiList.isEmpty()) {
            System.out.println("Non esistono diagnosi su questo paziente.");
        } else {
            for (Diagnosi d : diagnosiList) {
                d.stampaDettagli();
            }
        }
    }

    public ArrayList<Diagnosi> getDiagnosiScadute() {
        ArrayList<Diagnosi> diagnosiScaduta = new ArrayList<>();
        for (Diagnosi d : diagnosiList) {
            if (d.isScaduta()) {
                diagnosiScaduta.add(d);
            }
        }
        return diagnosiScaduta;
    }
}



