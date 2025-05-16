import java.time.LocalTime;
import java.util.ArrayList;

class Dottore {
    static Integer idContatore = 0;
    private String id;
    private String nome;
    private String cognome;
    private String specializzazione;
    private String telefono;
    private String email;
    private ArrayList<LocalTime> orariDisponibili;
    private ArrayList<Paziente> pazienti;

    public Dottore(String nome, String cognome, String specializzazione) {
        this.id = idContatore.toString();
        this.nome = nome;
        this.cognome = cognome;
        this.specializzazione = specializzazione;
        idContatore++;
    }

    // Aggiunge un paziente alla lista
    public boolean aggiungiPaziente(Paziente p) {
        if (p == null)
            return false;

        pazienti.add(p);
        return true;
    }

    // Rimuove un paziente dalla lista
    public boolean rimuoviPaziente(String codiceFiscale) {
        for (Paziente p : pazienti) {
            if (p.getCodiceFiscale().equals(codiceFiscale)) {
                pazienti.remove(p);
                return true;
            }
        }
        return false;
    }

    public boolean modificaOrario(LocalTime nuovoOrario){
        if (nuovoOrario == null)
            return false;

        orariDisponibili.add(nuovoOrario);
        return true;
    }

    public void stampaPazienti(){
        for(Paziente p : pazienti){
            System.out.println(p);
        }
    }

    public void trovaPazientiPerSpecializzazione(String specializzazione){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
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

    public ArrayList<LocalTime> getOrariDisponibili() {
        return orariDisponibili;
    }

    public void setOrariDisponibili(ArrayList<LocalTime> orariDisponibili) {
        this.orariDisponibili = orariDisponibili;
    }

    public ArrayList<Paziente> getPazienti() {
        return pazienti;
    }

    public void setPazienti(ArrayList<Paziente> pazienti) {
        this.pazienti = pazienti;
    }

    @Override
    public String toString() {
        return "Dottore{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", specializzazione='" + specializzazione + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", orariDisponibili=" + orariDisponibili +
                ", pazienti=" + pazienti +
                '}';
    }
}
