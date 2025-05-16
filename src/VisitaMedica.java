public class VisitaMedica {

    private String dataDellaVisita;
    private String orarioVisita;
    private Dottore dottore;
    private Paziente paziente;
    private StatoVisita statoVisita;

    public VisitaMedica(String dataDellaVisita, String orarioVisita, Dottore dottore, Paziente paziente, StatoVisita statoVisita) {
        this.dataDellaVisita = dataDellaVisita;
        this.orarioVisita = orarioVisita;
        this.dottore = dottore;
        this.paziente = paziente;
        this.statoVisita = statoVisita;
    }

    public VisitaMedica() {
    }

    public String getDataDellaVisita() {
        return dataDellaVisita;
    }

    public void setDataDellaVisita(String dataDellaVisita) {
        this.dataDellaVisita = dataDellaVisita;
    }

    public String getOrarioVisita() {
        return orarioVisita;
    }

    public void setOrarioVisita(String orarioVisita) {
        this.orarioVisita = orarioVisita;
    }

    public Dottore getDottore() {
        return dottore;
    }

    public void setDottore(Dottore dottore) {
        this.dottore = dottore;
    }

    public Paziente getPaziente() {
        return paziente;
    }

    public void setPaziente(Paziente paziente) {
        this.paziente = paziente;
    }

    public StatoVisita getStatoVisita() {
        return statoVisita;
    }

    public void setStatoVisita(StatoVisita statoVisita) {
        this.statoVisita = statoVisita;
    }

    public void confermaVisita(){
         statoVisita=StatoVisita.Effettuata;
    }
    public void pianificaVisita(){
         statoVisita=StatoVisita.Pianificata;
    }
    public void annullaVisita(){
         statoVisita=StatoVisita.Annullata;
    }

    @Override
    public String toString() {
        return "VisitaMedica{" +
                "dataDellaVisita='" + dataDellaVisita + '\'' +
                ", orarioVisita='" + orarioVisita + '\'' +
                ", dottore=" + dottore +
                ", paziente=" + paziente +
                ", statoVisita=" + statoVisita +
                '}';
    }
}
