
public class Menu_Admin {

    import static Functions_Library.*;


    public static int adminAuthorization() throws FileNotFoundException { // Retirar isto por ser biblioteca


/ ---------------------------------------------------------------------------------------------

// (1) 1st prompt inside "ADMIN MENU"

    public static void adminSelect() {

            Scanner input = new Scanner(System.in);

            int option;

            do {
                System.out.println("\n--- MENU --- \n----- ADMIN MENU -----");
                System.out.println("1. Open Files | \n2. Total of Sold Tickets | \n3. Festivalgoar Search | \n4. Most Expensive Ticket | \n5. Best Festivalgoers | \n6.Ticket Search per Day | \n7. Revenue per type of ticket | \n8. Revenue per Day of Festival | \n0. EXIT | \nChoose an Option:\n");
                option = input.nextInt();
                input.nextLine(); // Clean Buffer


                switch (option) {
                    case 1:

                        System.out.println("Insert the file you want to access:\n1.Festival_Bilhetes.csv\n2.Festival_Cartaz.csv\nFestival_AdminLogin.csv\nFestival_Quiz.csv "");
                        int answerSwitchOne = input.nextLine();

                        // Invoke function with Switch
                        adminSwitchOne(answerSwitchOne);
                        break;
                    case 2:
                        System.out.println("2. Verifying total Revenue and Tickets sold...");
                        String artistaPesquisar = input.nextLine();
                        pesquisarMusicasPorArtista(matrizCompleta,artistaPesquisar);


                        // Prints total ammount of tickets and the total revenue invoiced by the festival (all days)
                        // ªªªº PRECISA DE MATRIZ ººº TOTAL BILHETES + SOMA
                        break;
                    case 3:
                        System.out.println("3. Accessing Festivalgoer details...");
                        String artistaPesquisar = input.nextLine();
                        pesquisarMusicasPorArtista(matrizCompleta,artistaPesquisar);
                        // ºª Given an "idClient", print all info related to that festivalgoer in the following order:
                        // name; contact; email; tickets bought; total spent money;
                        // ºª Festivalgoerfound (see sheet for details)

                        //Exemplo:

                        //> Insira o ID do festivaleiro: 1

                        //***** FESTIVALEIRO ENCONTRADO *****
                        //Nome: Vitor Santos
                        //Contacto: 910000001
                        //Email: vitor.santos@gmail.com
                        //Bilhetes: - B00-001 | Sexta | Diário | 39.99 € - B00-003 | Domingo | Diário | 44.99 €
                        //Total gasto: 84.98 €

                        // ºªªªªª PRECISA DE MATRIZ

                        break;
                    case 4:
                        System.out.println("4. Most Expensive Ticket(s)...");
                        String artistaPesquisar = input.nextLine();
                        pesquisarMusicasPorArtista(matrizCompleta,artistaPesquisar);
                        // Print the ticket(s) with biggest registered value on the file.
                        // Must show : day; type of ticket; value

                        // ººººº PRECISA MATRIZ
                        break;
                    case 5:
                        System.out.println("5. Finding the best Festivalgoers...");
                        String artistaPesquisar = input.nextLine();
                        pesquisarMusicasPorArtista(matrizCompleta,artistaPesquisar);

                        // Must print customer(s) who spent most cash at festival
                        // Print: name; contact; email; total € spent; list of tickets bought by customer

                        // ºººººº PRECISA MATRIZ
                        break;
                    case 6:
                        System.out.println("6. Checking Tickets sold by day (insert day)...");
                        String artistaPesquisar = input.nextLine();
                        pesquisarMusicasPorArtista(matrizCompleta,artistaPesquisar);

                        // Admin must insert the week day (friday, saturday) -> menu searches for file for that day
                        // Must print: ticket id; festivalgoer name; contact; email; ticket type; € value;

                        // ºººº PRECISA MATRIZ
                        break;
                    case 7:
                        System.out.println("7. Checking revenue per type of ticket (insert ticket type)...");
                        String artistaPesquisar = input.nextLine();
                        pesquisarMusicasPorArtista(matrizCompleta,artistaPesquisar);

                        // 1. Choose ticket type ºª | >>  2. Print:| no. tickets sold this type; total invoiced for this type of ticket.

                        // ºººº PRECISA MATRIZ
                        break;
                    case 8:
                        System.out.println("8. Printing Revenue separated by Day...");
                        String artistaPesquisar = input.nextLine();
                        pesquisarMusicasPorArtista(matrizCompleta,artistaPesquisar);
                        // ***** RECEITA POR DIA *****
                        //Sexta | 45 bilhetes | 1799.55 €
                        //Sábado | 52 bilhetes | 2439.48 €
                        //Domingo| 28 bilhetes | 1299.72 €

                        // ºººº PRECISA MATRIZ
                        break;
                    case 0:
                        System.out.print("Option 0 selected. Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid option. Insert a new valid option and get crazy.");
                }
                consoleClear();

            } while (option != 0); {
        }

// ----------------------------------------------------------------------------------------------------------------------------


        public static void adminSwitchOne(int answerSwitchOne)

        // Switch Case for Menu Option 1: Read CSV FILES

        switch (answerSwitchOne) {
            case 1:
                System.out.println("Printing file...\n\n");
                printAndReadFileConsole("/Festival_Bilhetes.csv");
                break;
            case 2:
                System.out.println("Printing file...\n\n");
                printAndReadFileConsole("Festival_Cartaz.csv");
                break;
            case 3:
                System.out.println("Printing file...\n\n");
                printAndReadFileConsole("Festival_AdminLogin.csv");
                break;
            case 4:
                System.out.println("Printing file...\n\n");
                printAndReadFileConsole(Festival_Quiz.csv);
                break;
            case 0:
                System.out.println("Returning to last Menu...");
                // Como volto ao MENU anterior ??
                break;
            default:
                System.out.println("Invalid option.");

        }




}

}
