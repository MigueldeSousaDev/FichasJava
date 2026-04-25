package FichaPratica6.Ex09;

import java.util.Scanner;

public class BibliotecaMatrizes {

    Scanner input_ = new Scanner(System.in);

    public static void limparConsola() {

        // Import do Scanner
        Scanner input_ = new Scanner(System.in);

        // Limpar a consola
        System.out.println("(Prima enter p/ voltar)");
        input_.nextLine(); // Apanhar com o enter que vem do ultimo input
        input_.nextLine(); // Vai esperar pelo nosso enter
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }

    }

//public static int maiorElemento(int[][] matriz) {
//
//    int matriz[][] = new int[0][0];
//
//    // Adicionar Valores por ordem ao ciclo
//    for (int linha = 0 ; linha < matriz.length ; linha++) {
//        for (int coluna = 0; coluna < matriz.length; coluna++) {
//            System.out.println("Insira o valor: [" + linha + "][" + coluna +"]");
//            matriz[linha][coluna] = input.nextInt();
//        }
//    }
//
//    // Ler valores através do ciclo
//    for (int linha = 0 ; linha < 3 ; linha++) {
//        for (int coluna = 0; coluna < 3; coluna++) {
//            System.out.print(matriz[linha][coluna] + " ");
//        }
//        System.out.println();
//    }
//
//    System.out.println("Inserir linha da Matriz: ");
//    matriz[][] = input.nextInt;

}



