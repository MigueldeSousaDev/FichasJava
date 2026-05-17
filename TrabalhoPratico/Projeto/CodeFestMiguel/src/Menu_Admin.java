import java.io.FileNotFoundException;
import java.util.Scanner;
import static Functions_Library.*;

public class Menu_Admin {

// ---------------------------------------------------------------------------------------------

// (1) 1st prompt inside "ADMIN MENU"

    public static void adminMenuOptions() throws FileNotFoundException {

            Scanner input = new Scanner(System.in);

            String[][] ticketsMatrix = Functions_Library.readFileCreateMatrixWithHeader("Festival_Bilhetes.csv",";");
            String[][] boardMatrix = Functions_Library.readFileCreateMatrixWithHeader("Festival_Cartaz.csv", ";");
            String[][] quizMatrix = Functions_Library.readFileCreateMatrixWithHeader("Festival_Quiz.csv",";");
            String[][] adminsMatrix = Functions_Library.readFileCreateMatrixNoHeader("Festival_AdminLogin.csv",";");


            int optionAdmin;

            do {
                System.out.println("\n--- MENU --- \n----- ADMIN MENU -----");
                System.out.println("1. Open Files | \n2. Total of Sold Tickets | \n3. Festivalgoar Search | \n4. Most Expensive Ticket | \n5. Best Festivalgoers | \n6.Ticket Search per Day | \n7. Revenue per type of ticket | \n8. Revenue per Day of Festival | \n0. EXIT | \nChoose an Option:\n");
                optionAdmin = input.nextInt();
                input.nextLine(); // Clean Buffer


                switch (optionAdmin) {
                    case 1: // CHECK DONE!! Testar

                        System.out.println("Insert the file you want to access:\n1. Festival_Bilhetes.csv\n2. Festival_Cartaz.csv\n3. Festival_AdminLogin.csv\n4. Festival_Quiz.csv");
                        int answerSwitchOneAdmin = input.nextInt();
                        input.nextLine();

                        // Invoke function with Switch
                        adminSwitchOneFunction(answerSwitchOneAdmin);
                        break;
                    case 2: // The rest I'll work with Matrix
                        System.out.println("2. Verifying total Revenue and Tickets sold...");

                        totalTicketsSold(ticketsMatrix);
                        // Prints total ammount of tickets and the total revenue invoiced by the festival (all days)
                        // ªªªº PRECISA DE MATRIZ ººº TOTAL BILHETES + SOMA
                        break;
                    case 3:
                        System.out.println("3. Accessing Festivalgoer details...");

                        searchFestivalGoer(ticketsMatrix);
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

                        mostExpensiveTicket(ticketsMatrix);
                        // Print the ticket(s) with biggest registered value on the file.
                        // Must show : day; type of ticket; value

                        // ººººº PRECISA MATRIZ
                        break;
                    case 5:
                        System.out.println("5. Finding the best Festivalgoers...");

                        bestFestivalGoers(ticketsMatrix);

                        // Must print customer(s) who spent most cash at festival
                        // Print: name; contact; email; total € spent; list of tickets bought by customer

                        // ºººººº PRECISA MATRIZ
                        break;
                    case 6:
                        System.out.println("6. Checking Tickets sold by day... \n-Insert Week Day:\n");
                        String daySearch = input.nextLine();

                        searchTicketsByDay(ticketsMatrix, daySearch);

                        // Admin must insert the week day (friday, saturday) -> function searches for correspondence for that day
                        // Must print: ticket id; festivalgoer name; contact; email; ticket type; € value;
                        break;
                    case 7:
                        System.out.println("7. Checking revenue per type of ticket and number of tickets sold... \n-Insert Ticket Type:\nOptions: Diário | VIP | Backstage: ");
                        String ticketType = input.nextLine();

                        revenuePerTicketType(ticketsMatrix, ticketType);

                        // 1. Choose ticket type ºª | >>  2. Print:| no. tickets sold this type; total invoiced for this type of ticket.

                        break;
                    case 8:
                        System.out.println("8. Printing Revenue separated by Day...");

                        revenuePerDay(ticketsMatrix);
                        // ***** RECEITA POR DIA *****
                        //Sexta | 45 bilhetes | 1799.55 €
                        //Sábado | 52 bilhetes | 2439.48 €
                        //Domingo| 28 bilhetes | 1299.72 €
                        break;
                    case 0:
                        System.out.print("Option 0 selected. Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid option. Insert a new valid option and get crazy.");
                }
                Functions_Library.consoleClear();

            } while (optionAdmin != 0); {
        }
    }

// ----------------------------------------------------------------------------------------------------------------------------


        public static void adminSwitchOneFunction(int answerSwitchOne) throws FileNotFoundException {

        // Switch Case for Admin Menu Option 1: Read CSV FILES  ||| CHECK DONE !!

        switch (answerSwitchOne) {
            case 1:
                System.out.println("Printing file...\n\n");
                Functions_Library.printAndReadFileConsole("Ficheiros/Festival_Bilhetes.csv");

                break;
            case 2:
                System.out.println("Printing file...\n\n");
                Functions_Library.printAndReadFileConsole("Ficheiros/Festival_Cartaz.csv");
                break;
            case 3:
                System.out.println("Printing file...\n\n");
                Functions_Library.printAndReadFileConsole("Ficheiros/Festival_AdminLogin.csv");
                break;
            case 4:
                System.out.println("Printing file...\n\n");
                Functions_Library.printAndReadFileConsole("Ficheiros/Festival_Quiz.csv");
                break;
            case 0:
                System.out.println("Returning to last Menu...");
                // The other Switch in "Festivalgoer Menu" is inside a do - while and so, after executing this switch, it returns to the "2nd" main code which
                // is the switched that prompted us to this function.
                break;
            default:
                System.out.println("Invalid option.");

        }

//----------------------------------------------------------------------------------------------------------------------





}

}
