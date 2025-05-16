import java.util.ArrayList;

public class SistemaINPS {

    List<Paziente> pazienti = new ArrayList<>();
    List<Dottore> dottori = new ArrayList<>();
    List<VisitaMedica> visite = new ArrayList<>();

    public List<Paziente> getPazienti() {
        return pazienti;
    }

    public void setPazienti(List<Paziente> pazienti) {
        this.pazienti = pazienti;
    }

    public List<Dottore> getDottori() {
        return dottori;
    }

    public void setDottori(List<Dottore> dottori) {
        this.dottori = dottori;
    }

    public List<VisitaMedica> getVisite() {
        return visite;
    }

    public void setVisite(List<VisitaMedica> visite) {
        this.visite = visite;
    }
}
