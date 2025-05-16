import java.util.List;
import java.util.Scanner;

public class MenuDottore {

    public static void menu(SistemaINPS sistema){
        boolean exit = true;

//        SistemaINPS sistema = new SistemaINPS();

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("---Menu Dottore---");
            System.out.println("1. Aggiungi Dottore");
            System.out.println("2. Modifica Dottore");
            System.out.println("3. Rimuovi Dottore");
            System.out.println("4. Cerca Dottore");
            System.out.println("0. Ritorna al menu precedente");

            String sceltaInput = scanner.nextLine();
            int scelta;
            try {
                scelta = Integer.parseInt(sceltaInput);
            } catch (NumberFormatException e) {
                System.out.println("Input non valido. Inserire un numero.");
                continue;
            }

            switch (scelta){
                case 1:{
                    System.out.println("Nome Dottore: ");
                    String nome = scanner.nextLine();
                    System.out.println("Cognome Dottore: ");
                    String cognome = scanner.nextLine();
                    System.out.println("Specializzazione Dottore: ");
                    String specializzazione = scanner.nextLine();
                    Dottore nuovoDottore = new Dottore(nome, cognome, specializzazione);
                    sistema.getDottori().add(nuovoDottore);
                    break;
                }
                case 2:{
                    List<Dottore> listaDottori = sistema.getDottori();
                    System.out.println("Scegli il Dottore da modificare.");
                    for (int i = 0; i < listaDottori.size(); i++) {
                        System.out.println("ID:" + listaDottori.get(i).getId() + listaDottori.get(i));
                    }
                    int dottoreScelto = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Modifica il nome, cognome o specializzazione");
                    System.out.println("Nome Dottore: ");
                    String nome = scanner.nextLine();
                    System.out.println("Cognome Dottore: ");
                    String cognome = scanner.nextLine();
                    System.out.println("Specializzazione Dottore: ");
                    String specializzazione = scanner.nextLine();

                    Dottore dottoreModifiche = listaDottori.get(dottoreScelto);
                    dottoreModifiche.setNome(nome);
                    dottoreModifiche.setNome(cognome);
                    dottoreModifiche.setNome(specializzazione);

                    System.out.println("Modifiche effettuate.");
                    break;
                }
                case 3:{
                    List<Dottore> listaDottori = sistema.getDottori();
                    System.out.println("Scegli il Dottore da eliminare");
                    for (int i = 0; i < listaDottori.size(); i++) {
                        System.out.println("ID:" + i + listaDottori.get(i));
                    }
                    int dottoreScelto = scanner.nextInt();
                    listaDottori.remove(dottoreScelto);
                    break;
                }
                case 4:{
                    List<Dottore> listaDottori = sistema.getDottori();
                    System.out.println("Inserisci ID:");
                    String idScelto = scanner.nextLine();

                    boolean trovato = false;
                    for (int i = 0; i < listaDottori.size(); i++) {
                        if(listaDottori.get(i).getId().equals(idScelto)){
                            System.out.println("Dottore trovato.");
                            System.out.println(listaDottori.get(i));
                            trovato = true;
                            break;
                        }
                    }
                    if(!trovato){
                        System.out.println("Dottore non trovato.");
                    }
                    break;
                }
                case 0:{
                    exit = false;
                    break;
                }
                default:
                    System.out.println("Inserire un numero nel menu.");
            }

        } while (exit);
    }

}
