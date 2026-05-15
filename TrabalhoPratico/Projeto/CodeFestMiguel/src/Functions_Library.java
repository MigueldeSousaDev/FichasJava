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

    public static void firstPromptLogin() throws FileNotFoundException {

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
            input.nextLine(); // Clean Buffer

            switch (opcao) {
                case 1:
                    System.out.println("Entering Admin Menu... ");
                    String generoPesquisar = input.nextLine();
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

        while (myLineScanner.hasNextLine()) {
            String line = myLineScanner.nextLine();
            System.out.println(line);
        }
        myLineScanner.close();
    }

// --------------------------------------------------------------------------------------------------

    // CRIAR FUNÇÃO MATRIZ







}

