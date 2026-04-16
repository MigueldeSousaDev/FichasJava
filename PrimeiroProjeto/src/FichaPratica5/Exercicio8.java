package FichaPratica5;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matriz[][] = new int[3][3];


        // Adicionar Valores por ordem ao ciclo
        for (int linha = 0 ; matriz.length ; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("Insira o valor: [" + linha + "][" + coluna +"]");
                matriz[linha][coluna] = input.nextInt();
            }
        }


        int numLinhas = matriz.length;
        int numColunas = matriz[0].length;

        // Ler valores através do ciclo
        for (int linha = 0 ; linha < numLinhas ; linha++) {
            for (int coluna = 0; coluna > numColunas; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

    }
}




//// Estrutura dos prints
//
//    for (int linha = 0 ; matriz[linha] < 3 ; linha++); {
//    for (int coluna = 0; matriz[coluna] < 3; coluna++) {
//        System.out.println("        "        );
//        }
//    }
