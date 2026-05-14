public class Biblioteca_Funcoes {

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public static void firstPrompt() throws FileNotFoundException {

        // Initiate Program > Admin
        //                  > Customer
        // ------------------------------------------------------

        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n--- MENU --- \n----- Escolha o Tipo de Utilizador -----");
            System.out.println("1. ADMIN | 2. FESTIVALEIRO: ");
            System.out.println("2. Pesquisar por Nome de Artista");
            System.out.println("0. Sair");

            System.out.print("Escolha: ");
            opcao = input.nextInt();

            input.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Género Musical a pesquisar: ");
                    String generoPesquisar = input.nextLine();
                    pesquisarMusicasPorGenero(matrizCompleta,generoPesquisar);
                    // Chamar Função
                    break;
                case 2:
                    System.out.println("Nome do Artista a pesquisar: ");
                    String artistaPesquisar = input.nextLine();
                    pesquisarMusicasPorArtista(matrizCompleta,artistaPesquisar);
                    // Chamar Função
                    break;
                case 0:
                    System.out.print("Opção 0 selecionada. A sair do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Insira novamente o valor.");
            }
            limparConsola();
        } while (opcao != 0);
    }



    }



}
