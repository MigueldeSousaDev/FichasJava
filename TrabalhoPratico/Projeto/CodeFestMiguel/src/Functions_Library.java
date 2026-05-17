import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Functions_Library {


// INDEX:
    // 1. SEARCH
    // 2. LOGIN
    // 3. CALCULATIONS
    // 4. READINGS
    // 5. Reading Matrixes (Header / No Header)

// ------------------------------------------------------------------------------------------

    public static void consoleClear() {

    // ** CLEARS THE CONSOLE FROM ENTER INPUTS **

        // Import Scanner
        Scanner input_ = new Scanner(System.in);

        // Cleans the Scanner
        System.out.println("(Press Enter to Return...)");
        input_.nextLine(); // "Catches" the last "ENTER" from the last input
        input_.nextLine(); // Will await for our input.
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }

    }

// ------------------------------------------------------------------------------------------

    public static void firstPromptLogin(String[][]adminLoginValidation) throws FileNotFoundException {

    // ** THE FIRST PROMPT FROM THE PROGRAM **

        // Initiate Program > Admin
        //                  > Customer
        // ------------------------------------------------------

        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n--- MENU --- \n----- Choose the Type of User -----");
            System.out.println("1. ADMIN | \n2. FESTIVALGOER | \n 0. EXIT\nChoose an Option:\n");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    String[][] adminMatrixCSV = readFileCreateMatrixNoHeader("Festival_AdminLogin.csv",";");
                    // readFileCreateMatrixNoHeader(filePath, delimiter)

                    System.out.println("Insira o Username:");
                    String username = input.nextLine();

                    System.out.println("Insira o Password:");
                    String password = input.nextLine();

                    boolean validLogin = adminLoginValidation(username, password, adminMatrixCSV);

                    if (validLogin) { // If true, execute, else print and return to loop
                        System.out.println("\nLogged In successfully!\n Entering Admin Menu...");
                        Menu_Admin.adminMenuOptions();
                    } else {
                        System.out.println("Invalid Log In!");
                    }

                    // ADMIN USER NAME + PASSWORD READ FUNCTION
                    // Call Function
                    break;
                case 2:
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

                    // Falta imprimir o COPYRIGHT
            }
            consoleClear();

        } while (opcao != 0);


    // The Menu must contain an "IF" function for ADMIN and for FESTIVALEIRO ---> Then call the function which will be created in other 2 separate packages.
        // SWITCH ALREADY DOES THAT.

    }


// -------------------------------------------------------------------------------------------------

    // Authentication for Admin (all "Festival_AdminLogin.csv" users) are granted Admin rights

    public static boolean adminLoginValidation(String username, String password, String[][]adminLoginMatrix) {

        for (int i = 0; i < adminLoginMatrix.length; i++) {
            if (username.equals(adminLoginMatrix[i][0]) &&
                    password.equals(adminLoginMatrix[i][1])) {
                return true;
            }
        }
        return false;
    }

// --------------------------------------------------------------------------------------------------

    // Reads and Prints file both on Admin and FestivalGoer for .CSV and .TXT files.
    // It doesn't contain matrix, just scans

    public static void printAndReadFileConsole(String filePath) throws FileNotFoundException {

        File myFile = new File(filePath);
        Scanner myLineScanner = new Scanner(myFile);

        while (myLineScanner.hasNextLine()) {
            String line = myLineScanner.nextLine();
            System.out.println(line);
        }
        myLineScanner.close();
    }

// ------------------------------------- 5. READ FILES AND CREATE MATRIX (Header / No Header -------------------------------------------

    // Creating Matrix Reads Files and Assigns Values -- (With Header) ...

    public static String[][] readFileCreateMatrixWithHeader(String filePathMatrix, String delimiter) throws FileNotFoundException {

        // Create delimiter when calling as file path (x,y)
        File myFileMatrix = new File(filePathMatrix);
        Scanner myLineScanner = new Scanner(myFileMatrix);

        int lineCounter = 0;

        // Ignore file Header
        myLineScanner.nextLine();

        // a. Counting Lines of the File to Assign Matrix Size (IGNORING HEADER)
        while (myLineScanner.hasNextLine()) {
            myLineScanner.nextLine();
            lineCounter++;
        }
        myLineScanner.close();
        // Re-Open Scanner
        myLineScanner = new Scanner(filePathMatrix);
        // Ignore Header again
        myLineScanner.nextLine();

        //-----------------------

        // b. Transform Lines into Vector (with delimiter) - NEEDS TO DEFINE DELIMITER AT THE BEGGINING OF THE FUNCTION
        String firstLine = myLineScanner.nextLine();
        String[] itemsLine = firstLine.split(delimiter);

        // c. Gets Column's length (counter)
        int columnsCounter = itemsLine.length;

        // Reopens Scanner for full reading
        myLineScanner.close();
        myLineScanner = new Scanner(filePathMatrix);
        // Ignore Header Again
        myLineScanner.nextLine();

        // d. Create Matrix with Line Size + Column (not parsing yet)
        String[][] readFileCreateMatrixWithHeader = new String[lineCounter][columnsCounter];

        // e. Fill in the Matrix ( Assigning values that are read )

        int currentMatrixLine = 0;

        while (myLineScanner.hasNextLine()) {

            String line = myLineScanner.nextLine();
            String[] eachLine = line.split(delimiter); // Creates an Array/Vector with 4 positions (for each line)
            //String eachLine = [0, 1, 2, 3]

            // "i" increments lines and columns. Definided as 0 above.
            for (int i = 0; i < columnsCounter; i++) {
                readFileCreateMatrixWithHeader[currentMatrixLine][i] = eachLine[i];
                //            readFileCreateMatrixWithHeader[currentMatrixLine][0] = eachLine[0];
                //            readFileCreateMatrixWithHeader[currentMatrixLine][1] = eachLine[1];
                //            readFileCreateMatrixWithHeader[currentMatrixLine][2] = eachLine[2];
                //            readFileCreateMatrixWithHeader[currentMatrixLine][3] = eachLine[3];

                //  FOR > currentMatrixLine maintains 0 in this cicle; Assigns value of the content
                //  at Array eachLine[i] to position 2 (i) of matrix [_][i]. At the same time it increments the value of "i"
                //  both on the Vector as the Matrix, passes the value to the Matrix.

            }
            currentMatrixLine++;
        }
        myLineScanner.close();
        return readFileCreateMatrixWithHeader;
    }

// ---------------------------------------------------------------------------------------------------------------------

    // Creating Matrix Reads Files and Assigns Values --- ( No Header ) ...

    public static String[][] readFileCreateMatrixNoHeader(String filePathMatrix, String delimiter) throws FileNotFoundException {

        // Create delimiter when calling as file path (x,y)
        File myFileMatrix = new File(filePathMatrix);
        Scanner myLineScanner = new Scanner(myFileMatrix);

        int lineCounter = 0;

        // a. Counting Lines of the File to Assign Matrix Size (IGNORING HEADER)
        while (myLineScanner.hasNextLine()) {
            myLineScanner.nextLine();
            lineCounter++;
        }
        myLineScanner.close();
        // Re-Open Scanner
        myLineScanner = new Scanner(filePathMatrix);

        //-----------------------

        // b. Transform Lines into Vector (with delimiter) - NEEDS TO DEFINE DELIMITER AT THE BEGGINING OF THE FUNCTION
        String firstLine = myLineScanner.nextLine();
        String[] itemsLine = firstLine.split(delimiter);

        // c. Gets Column's length (counter)
        int columnsCounter = itemsLine.length;

        // Reopens Scanner for full reading
        myLineScanner.close();
        myLineScanner = new Scanner(filePathMatrix);

        // d. Create Matrix with Line Size + Column (not parsing yet)
        String[][] readFileCreateMatrixNoHeader = new String[lineCounter][columnsCounter];

        // e. Fill in the Matrix ( Assigning values that are read )

        int currentMatrixLine = 0;

        while (myLineScanner.hasNextLine()) {

            String line = myLineScanner.nextLine();
            String[] eachLine = line.split(delimiter); // Creates an Array/Vector with 4 positions (for each line)
            //String eachLine = [0, 1, 2, 3]

            // "i" increments lines and columns. Definided as 0 above.
            for (int i = 0; i < columnsCounter; i++) {
                readFileCreateMatrixNoHeader[currentMatrixLine][i] = eachLine[i];
                //            readFileCreateMatrixNoHeader[currentMatrixLine][0] = eachLine[0];
                //            readFileCreateMatrixNoHeader[currentMatrixLine][1] = eachLine[1];
                //            readFileCreateMatrixNoHeader[currentMatrixLine][2] = eachLine[2];
                //            readFileCreateMatrixNoHeader[currentMatrixLine][3] = eachLine[3];

                //  FOR > currentMatrixLine maintains 0 in this cicle; Assigns value of the content
                //  at Array eachLine[i] to position 2 (i) of matrix [_][i]. At the same time it increments the value of "i"
                //  both on the Vector as the Matrix, passes the value to the Matrix.
            }
            currentMatrixLine++;
        }
        myLineScanner.close();
        return readFileCreateMatrixNoHeader;
    }

// --------------------------------------- 2. CALCULATIONS (sum)---------------------------------------------------------------------------------------------------

    public static void totalTicketsSold(String[][] ticketsMatrix) {

        int totalTickets = ticketsMatrix.length;

        double totalRevenue = 0;

        for (int i = 0; i < ticketsMatrix.length; i++) {
            totalRevenue += Double.parseDouble(ticketsMatrix[i][7]);
        }

    System.out.println("*** FESTIVAL REPORT ***\nTotal tickets sold: " + totalTickets + "\nTotal Revenue: " + totalRevenue + "€.");

    }

// ------------------------------------------------6. TICKET SEARCH ------------------------------------------------------------------------------------------

    public static void searchTicketsByDay(String[][] ticketsMatrix, String daySearch) {

        boolean found = false;

        for (int i = 0; i < ticketsMatrix.length; i++) {
            if (ticketsMatrix[i][5].equalsIgnoreCase(daySearch)) {
                found = true;
                System.out.println("***TICKETS FOR SELECT DAY: " + ticketsMatrix[i][5]) +"***\n" +
                ticketsMatrix[i][0] + " | " + "\n" +
                ticketsMatrix[i][2] + " | " + "\n" +
                ticketsMatrix[i][3] + " | " + "\n" +
                ticketsMatrix[i][4] + " | " + "\n" +
                ticketsMatrix[i][6] + " | " + "\n" +
                ticketsMatrix[i][7] + " €." + "\n");

            //0. id do bilhete //2. nome do festivaleiro //3. contacto //4. email //6. tipo de bilhete //7. valor
            }
        }
        else if (!found) {
        System.out.println("No tickets found for that day.");
        }
    }
// ------------------------------------------------6. Search Revenue per Type of Ticket (Menu_Admin) 7 --------------------------------------------------------------------------

    public static void revenuePerTicketType(String[][] ticketsMatrix, String ticketType) {

        // Ticket Types: Backstage | VIP | Daily = Matrix[i][6] -- > Searches by Ticket Type; 1. Number (sum) of Tickets Sold (by type) and | 2. Total (Sum) of the € those Tickets ammounted

    int ticketCounter = 0;
    double accumulatedValue=0;
    boolean found = false;

    for (int i = 0; i < ticketsMatrix.length; i++) {
        if (ticketsMatrix[i][6].equalsIgnoreCase(ticketType)) {
            found = true;
            ticketCounter +=;
            accumulatedValue += Double.parseDouble(ticketsMatrix[i][7]);
        }
    }
        if (!found) {
        System.out.println("No tickets found for this type.");
        } else {
            System.out.println("\n*** Ticket Type Report ***\nTicket Type: " + ticketType + "\nTickets Sold: " + ticketCounter + "\nTotal Revenue: " + accumulatedValue);
        }
    }

// ----------------------------------------------- 8. Total Revenue per Day of Festival (Menu Admin )-----------

    public static void revenuePerDay(String[][] ticketsMatrix) {

        int fridayTickets = 0;
        double fridayRevenue = 0;
        int saturdayTickets = 0;
        double saturdayRevenue = 0;
        int sundayTickets = 0;
        double sundayRevenue = 0;

        for (int i = 0; i < ticketsMatrix.length; i++) {
            if (ticketsMatrix[i][5].equalsIgnoreCase("Sexta")) {
                fridayTickets++;
                fridayRevenue += Double.parseDouble(ticketsMatrix[i][7]);
            }
            if (ticketsMatrix[i][5].equalsIgnoreCase("Sábado")) {
                saturdayTickets++;
                saturdayRevenue += Double.parseDouble(ticketsMatrix[i][7]);
            }
            if (ticketsMatrix[i][5].equalsIgnoreCase("Domingo")) {
                sundayTickets++;
                sundayRevenue += Double.parseDouble(ticketsMatrix[i][7]);
            }
        }

        System.out.println(
                "\n***** REVENUE PER DAY *****" +
                "\nFriday Tickets Sold: " + fridayTickets + "\nFriday Revenue: " + fridayRevenue + " €.\n" +
                "\nSaturday Tickets Sold: " + saturdayTickets + "\nSaturday Revenue: " + saturdayRevenue + " €.\n" +
                "\nSunday Tickets Sold: " + sundayTickets + "\nSunday Revenue: " + sundayRevenue + " €."
        );
    }

// --------------------------- 4. Most Expensive Ticket (Menu Admin)


    }













