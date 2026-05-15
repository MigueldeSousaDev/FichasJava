
public class Menu_Admin {

    import static Functions_Library.*;


    public static int adminAuthorization() throws FileNotFoundException { // Retirar isto por ser biblioteca

// (1) 1st prompt inside "ADMIN MENU"

    public static void adminSelect() {

            Scanner input = new Scanner(System.in);

            int opcao;

            do {
                System.out.println("\n--- MENU --- \n----- Choose the Type of User -----");
                System.out.println("1. Open Files | \n2. Total of Sold Tickets | \n3. Festivalgoar Search | \n4. Most Expensive Ticket | \n5. Best Festivalgoers | \n6.Ticket Search per Day | \n7. Revenue per type of ticket | \n8. Revenue per Day of Festival | \n0. EXIT | \nChoose an Option:\n");
                opcao = input.nextInt();
                input.nextLine(); // Clean Buffer


                switch (opcao) {
                    case 1:
                        System.out.println("Opening (insert file name)... ");
                        String generoPesquisar = input.nextLine();

                        // ºª ªº Pick 1 of these files and print it on console ºª ºª \\

                        // Festival_Bilhetes.csv
                        // Festival_Cartaz.csv
                        // Festival_AdminLogin.csv
                        // Festival_Quiz.csv



                        break;
                    case 2:
                        System.out.println("2. Verifying total Revenue and Tickets sold...");
                        String artistaPesquisar = input.nextLine();
                        pesquisarMusicasPorArtista(matrizCompleta,artistaPesquisar);


                        // Prints total ammount of tickets and the total revenue invoiced by the festival (all days)
                        // Call Function
                        break;
                    case 3:
                        System.out.println("3. Accessing Festivalgoer details...");
                        String artistaPesquisar = input.nextLine();
                        pesquisarMusicasPorArtista(matrizCompleta,artistaPesquisar);
                        // ºª Given an "idClient", print all info related to that festivalgoer in the following order:
                        // name; contact; email; tickets bought; total spent money;
                        // ºª Festivalgoerfound (see sheet for details)

                        // Call Function
                        break;
                    case 4:
                        System.out.println("4. Most Expensive Ticket(s)...");
                        String artistaPesquisar = input.nextLine();
                        pesquisarMusicasPorArtista(matrizCompleta,artistaPesquisar);
                        // Print the ticket(s) with biggest registered value on the file.
                        // Must show : day; type of ticket; value

                        // Call Function
                        break;
                    case 5:
                        System.out.println("5. Finding the best Festivalgoers...");
                        String artistaPesquisar = input.nextLine();
                        pesquisarMusicasPorArtista(matrizCompleta,artistaPesquisar);

                        // Must print customer(s) who spent most cash at festival
                        // Print: name; contact; email; total € spent; list of tickets bought by customer

                        // Call Function
                        break;
                    case 6:
                        System.out.println("6. Checking Tickets sold by day (insert day)...");
                        String artistaPesquisar = input.nextLine();
                        pesquisarMusicasPorArtista(matrizCompleta,artistaPesquisar);

                        // Admin must insert the week day (friday, saturday) -> menu searches for file for that day
                        // Must print: ticket id; festivalgoer name; contact; email; ticket type; € value;

                        // Call Function
                        break;
                    case 7:
                        System.out.println("Entering Festivalgoer Menu...");
                        String artistaPesquisar = input.nextLine();
                        pesquisarMusicasPorArtista(matrizCompleta,artistaPesquisar);
                        // FESTIVALGOER  USER NAME + PASSWORD READ FUNCTION
                        // Call Function
                        break;
                    case 8:
                        System.out.println("Entering Festivalgoer Menu...");
                        String artistaPesquisar = input.nextLine();
                        pesquisarMusicasPorArtista(matrizCompleta,artistaPesquisar);
                        // FESTIVALGOER  USER NAME + PASSWORD READ FUNCTION
                        // Call Function
                        break;
                    case 0:
                        System.out.print("Option 0 selected. Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid option. Insert a new valid option.");
                }
                consoleClear();

            } while (opcao != 0);
        }




}

}
