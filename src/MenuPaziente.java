import java.util.List;
import java.util.Scanner;

public class MenuPaziente {

    public static void menu(SistemaINPS sistema) {
        boolean exit = true;

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("---Menu Paziente---");
            System.out.println("1. Aggiungi Paziente");
            System.out.println("2. Modifica Paziente");
            System.out.println("3. Rimuovi Paziente");
            System.out.println("4. Cerca Paziente");
            System.out.println("0. Ritorna al menu precedente");

            String sceltaInput = scanner.nextLine();
            int scelta;
            try {
                scelta = Integer.parseInt(sceltaInput);
            } catch (NumberFormatException e) {
                System.out.println("Input non valido. Inserire un numero.");
                continue;
            }

            switch (scelta) {
                case 1: {
                    System.out.println("Nome Paziente: ");
                    String nome = scanner.nextLine();
                    System.out.println("Cognome Paziente: ");
                    String cognome = scanner.nextLine();
                    System.out.println("Codice Fiscale Paziente: ");
                    String codiceFiscale = scanner.nextLine();
                    Paziente nuovoPaziente = new Paziente(nome, cognome, codiceFiscale);
                    sistema.getPazienti().add(nuovoPaziente);
                    break;
                }
                case 2: {
                    List<Paziente> listaPazienti = sistema.getPazienti();
                    System.out.println("Scegli il Paziente da modificare");
                    for (int i = 0; i < listaPazienti.size(); i++) {
                        System.out.println("ID:" + i + listaPazienti.get(i));
                    }
                    int PazienteScelto = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Modifica il nome, cognome e codice fiscale");
                    System.out.println("Nome Paziente: ");
                    String nome = scanner.nextLine();
                    System.out.println("Cognome Paziente: ");
                    String cognome = scanner.nextLine();
                    System.out.println("CF Paziente: ");
                    String codiceFiscale = scanner.nextLine();

                    Paziente pazienteModifiche = listaPazienti.get(PazienteScelto);
                    pazienteModifiche.setNome(nome);
                    pazienteModifiche.setCognome(cognome);
                    pazienteModifiche.setCodiceFiscale(codiceFiscale);

                    System.out.println("Modifiche effettuate.");
                    break;
                }
                case 3: {
                    List<Paziente> listaPazienti = sistema.getPazienti();
                    System.out.println("Scegli il Paziente da eliminare");
                    for (int i = 0; i < listaPazienti.size(); i++) {
                        System.out.println("ID:" + i + listaPazienti.get(i));
                    }
                    int pazienteScelto = scanner.nextInt();
                    listaPazienti.remove(pazienteScelto);
                    break;
                }
                case 4: {
                    List<Paziente> listaPazienti = sistema.getPazienti();

                    System.out.println("Cerca Paziente per Codice Fiscale");
                    String codiceFiscale = scanner.nextLine();

                    boolean trovato = false;
                    int pazienteScelto;
                    for (int i = 0; i < listaPazienti.size(); i++) {

                        if (listaPazienti.get(i).getCodiceFiscale().equals(codiceFiscale)) {
                            System.out.println(listaPazienti.get(i));
                            trovato = true;
                        }

                    }
                    if (!trovato) {
                        System.out.println("Paziente non trovato.");
                    }
                    break;
                }
                case 0:{
                    exit = false;
                    break;
                }
                default:
                    System.out.println("Inserisci un numero corretto.");
            }

        } while (exit);
    }

}
