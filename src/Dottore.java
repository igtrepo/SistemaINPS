import java.time.LocalTime;
import java.util.ArrayList;

class Dottore {
    private String idDottore;
    private String nome;
    private String cognome;
    private String specializzazione;
    private String telefono;
    private String email;
    private ArrayList<LocalTime> orariDisponibili;
    private ArrayList<Paziente> pazienti;

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
}
