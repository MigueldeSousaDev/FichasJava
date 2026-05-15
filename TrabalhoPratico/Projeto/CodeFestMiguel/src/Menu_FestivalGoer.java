public class Menu_FestivalGoer {

import java.io.FileNotFoundException;
import static Functions_Library.*;

public static int festivalgoerAuthorization(String caminhoFicheiro) throws FileNotFoundException {


    public static void festivalGoerSelect() {

        Scanner input = new Scanner(System.in);

        int optionGoer;

        do {
            System.out.println("\n--- MENU --- \n----- FESTIVALGOER MENU -----\n");
            System.out.println("1. New Registry (new festivalgoer | \n2. Search Available Camping Site spots | \n3. Print Festival Board | \n4. Print Stages' Graphics | \n5. Print Longest Concert | \n6. Print Festival Board per day | \n7. Print Board organized by Musical Gender | \n8. Musical Quiz | \n0. EXIT | \nChoose an Option:\n");
            optionGoer = input.nextInt();
            input.nextLine(); // Clean Buffer


            switch (optionGoer) {
                case 1:
                    System.out.println("1. Insert the following data for a new registry:");

                    // name, contact, email
                    // ***** Registar Festivaleiro *****
                    //> Insira Nome: Cristiano Ronaldo
                    //> Insira Contacto: 910 000 111
                    //>Insira Email: cr7@gmail.com
                    //Festivaleiro Inserido com Sucesso: Cristiano Ronaldo | 910 000 111| cr7@gmail.com

                    // Usar vários Souts com vários inputs e colocar num array (?) ou tudo numa linha?

                    // GUARDAR NUMA VARIÁVEL OU STRING/ARRAY, NÃO PRECISO INSERIR NA MATRIZ, É UMA SIMULAÇÃO
                    break;
                case 2:
                    System.out.println("2. Verifying available Camping spots...");

                    // Lugares: 1 a 300 | All available places > Nºs triangulares multiplos de 5 até 300.
                    // Programa Prints all available spots. Example: 1, 3, 6, 10, 15, 21. Não ultrapassar limite.
                    // Print dos spots available

                    break;
                case 3:
                    System.out.println("3. Accessing all Festival Artists...");

                    // Print all Festival artists, no duplicates
                    // ºªªªªª PRECISA DE MATRIZ
                    break;
                case 4:
                    System.out.println("4. Pick a Stage you wish to view:\n1. Main Stage \n2. Java Stage \n3. Commit Stage \n- Insert the Number:\n");
                    int switchAnswerFourFestivalGoer = input.nextInt();

                    festivalgoerSwitchFourFunction(switchAnswerFourFestivalGoer);

                    // 1. Escolher Palco a Imprimir | 2. After choosing, imprimir STAGE.TXT (ler e imprimir)

                    // Resolvo de forma semelhante ao AdminMenu Switch one!! Leio e imprimo.
                    break;
                case 5:
                    System.out.println("5. Printing longest Concert(s)...");

                    //PRINTS:
                    //• artista
                    //• dia
                    //• hora
                    //• palco
                    //• género
                    //• duração

                    // ºººººº PRECISA MATRIZ
                    break;
                case 6:
                    System.out.println("6. Select the week day (write full name)...");
                    // Decidir se uso matriz ou switch (?) Não sei se dá switch pq tenho aceder
                    // À matriz, mas já vejo isso

                    System.out.println(" 'X' day has been selected. Showing information ...");

                    String artistaPesquisar = input.nextLine();
                    pesquisarMusicasPorArtista(matrizCompleta,artistaPesquisar);

                    //• hora
                    //• palco
                    //• artista
                    //• género
                    //• duração

                    //Exemplo:
                    //> Dia a pesquisar: Sexta
                    //***** CARTAZ DE SEXTA *****
                    //18:00 | Palco Principal | Quim Barreiros | Popular | 60 min
                    //20:00 | Palco Sunset | D.A.M.A | Pop | 75 min

                    // ºººº PRECISA MATRIZ !
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

        } while (optionGoer != 0); {
        }

}

// ---------------------------------------------------------------------------------------------------------------------

    public static void festivalgoerSwitchFourFunction(int switchAnswerFourFestivalGoer)

    // Switch Case for FestivalGoer Menu Option 4: Read TXT FILES

    switch (switchAnswerFourFestivalGoer) {
        case 1:
            System.out.println("Printing file...\n\n");
            printAndReadFileConsole("/Palco_Main.txt");
            break;
        case 2:
            System.out.println("Printing file...\n\n");
            printAndReadFileConsole("Palco_Java.txt");
            break;
        case 3:
            System.out.println("Printing file...\n\n");
            printAndReadFileConsole("Palco_Commit.txt");
            break;
        case 0:
            System.out.println("Returning to last Menu...");
            // The other Switch in "Festivalgoer Menu" is inside a do - while and so, after executing this switch, it returns to the "2nd" main code which
            // is the switch that prompted us to this function.
            break;
        default:
            System.out.println("Invalid option.");
        // printAndReadFileConsole() can be found in Functions_Library
    }


    }
