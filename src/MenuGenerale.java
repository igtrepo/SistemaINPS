import java.util.Scanner;

public class MenuGenerale {

    public static void menu() {

        SistemaINPS sistema = new SistemaINPS();
        InMemoryDB.db(sistema);
        boolean exit = true;

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Menu INPS");
            System.out.println("1. Menu Dottore");
            System.out.println("2. Menu Paziente");
            System.out.println("3. Menu Diagnosi");
            System.out.println("0. Esci");

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
                    MenuDottore.menu(sistema);
                    break;
                }
                case 2: {
                    MenuPaziente.menu(sistema);
                    break;
                }
                case 3: {
                    MenuDiagnosi.menu(sistema);
                    break;
                }
                case 0: {
                    scanner.close();
                    exit = false;
                    break;
                }
                default:
                    System.out.println("Inserire un numero dal menu.");
            }

        } while (exit);
    }

}
