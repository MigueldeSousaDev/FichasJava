public class Functions_Library {

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
//            input.nextLine(); // Clean Buffer - no need

            switch (opcao) {
                case 1:
                    String[][] adminMatrixCSV = readFileCreateMatrixNoHeader("/Festival_AdminLogin.csv",";");
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

    // Reads and Prints file both on Admin and FestivalGoer for .CSV and .TXT files.
    // It doesn't contain matrix, just scans

    public static void printAndReadFileConsole(String filePath) throws FileNotFoundException {

        File myFile = new File(filePath);
        Scanner myLineScanner = new Scanner(myFile);

        while (myLineScanner.hasnextLine()) {
            String line = myLineScanner.nextLine();
            System.out.println(line);
        }
        myLineScanner.close();
    }

// --------------------------------------------------------------------------------------------------

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
    }



// --------------------------------------------------------------------------------------------------

    // Creating Matrix Reads Files and Assigns Values -- (With Header) ...

    public static String[][] readFileCreateMatrixWithHeader(String filePathMatrix, String delimiter) throws FileNotFoundException {

        // Create delimiter when calling as file path (x,y)
        File myFileMatrix = new File(filePathMatrix);
        Scanner myLineScanner = new Scanner(myFileMatrix);

        int lineCounter = 0;

        // Ignore file Header
        myLineScanner.nextLine();

        // 1. Counting Lines of the File to Assign Matrix Size (IGNORING HEADER)
        while (myLineScanner.hasnextLine()) {
            myLineScanner.nextLine();
            lineCounter++;
        }
        myLineScanner.close();
        // Re-Open Scanner
        myLineScanner = new Scanner(filePathMatrix);
        // Ignore Header again
        myLineScanner.nextLine();

        //-----------------------

        // 2. Transform Lines into Vector (with delimiter) - NEEDS TO DEFINE DELIMITER AT THE BEGGINING OF THE FUNCTION
        String firstLine = myLineScanner.nextLine();
        String[] itemsLine = firstLine.split(delimiter);

        // 3. Gets Column's length (counter)
        int columnsCounter = itemsLine.length;

        // Reopens Scanner for full reading
        myLineScanner.close();
        myLineScanner = new Scanner(filePathMatrix);
        // Ignore Header Again
        myLineScanner.nextLine();

        // 4. Create Matrix with Line Size + Column (not parsing yet)
        String[][] readFileCreateMatrixWithHeader = new String[lineCounter][columnsCounter];

        // 5. Fill in the Matrix ( Assigning values that are read )

        int currentMatrixLine = 0;

        while (myLineScanner.hasnextLine()) {

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

        // 1. Counting Lines of the File to Assign Matrix Size (IGNORING HEADER)
        while (myLineScanner.hasnextLine()) {
            myLineScanner.nextLine();
            lineCounter++;
        }
        myLineScanner.close();
        // Re-Open Scanner
        myLineScanner = new Scanner(filePathMatrix);

        //-----------------------

        // 2. Transform Lines into Vector (with delimiter) - NEEDS TO DEFINE DELIMITER AT THE BEGGINING OF THE FUNCTION
        String firstLine = myLineScanner.nextLine();
        String[] itemsLine = firstLine.split(delimiter);

        // 3. Gets Column's length (counter)
        int columnsCounter = itemsLine.length;

        // Reopens Scanner for full reading
        myLineScanner.close();
        myLineScanner = new Scanner(filePathMatrix);

        // 4. Create Matrix with Line Size + Column (not parsing yet)
        String[][] readFileCreateMatrixNoHeader = new String[lineCounter][columnsCounter];

        // 5. Fill in the Matrix ( Assigning values that are read )

        int currentMatrixLine = 0;

        while (myLineScanner.hasnextLine()) {

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

// -------------------------------------------------------------------------------------------------------------------------






}

