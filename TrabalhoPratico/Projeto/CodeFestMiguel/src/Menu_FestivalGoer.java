public class Menu_Cliente {

import java.io.FileNotFoundException;
import static Functions_Library.*;

public static int festivalgoerAuthorization(String caminhoFicheiro) throws FileNotFoundException {




    public static void festivalGoerSelect() {

        Scanner input = new Scanner(System.in);

        int option;

        do {
            System.out.println("\n--- MENU --- \n----- FESTIVALGOER MENU -----\n");
            System.out.println("1. New Registry (new festivalgoer | \n2. Search Available Camping Site spots | \n3. Print Festival Board | \n4. Print Stages' Graphics | \n5. Print Longest Concert | \n6. Print Festival Board per day | \n7. Print Board organized by Musical Gender | \n8. Musical Quiz | \n0. EXIT | \nChoose an Option:\n");
            option = input.nextInt();
            input.nextLine(); // Clean Buffer


            switch (option) {
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

}

    }
