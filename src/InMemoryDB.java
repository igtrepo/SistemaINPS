
public class InMemoryDB {

    public static void db(SistemaINPS sistema){

        Dottore d1 = new Dottore("Mario", "Rossi", "Ortopedico");
        Dottore d2 = new Dottore("Gianfranco", "Fracchetti", "Ginecologo");
        Dottore d3 = new Dottore("Federico", "Giallini", "Botanico");
        sistema.getDottori().add(d1);
        sistema.getDottori().add(d2);
        sistema.getDottori().add(d3);

        Paziente p1 = new Paziente("Mario", "Rossi", "1234");
        Paziente p2 = new Paziente("Prova", "Due", "4321");
        Paziente p3 = new Paziente("Giulio", "Rossini", "asdf");
        sistema.getPazienti().add(p1);
        sistema.getPazienti().add(p2);
        sistema.getPazienti().add(p3);

    }

}
