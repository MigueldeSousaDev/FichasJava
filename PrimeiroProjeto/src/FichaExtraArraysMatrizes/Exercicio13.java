package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Definir tamanho matriz
        System.out.println("Insira número de linhas:");
        int linhas = input.nextInt();

        System.out.println("Insira número de colunas:");
        int colunas = input.nextInt();

        int[][] matriz = new int[linhas][colunas];

        // Preencher matriz (1, 10, 100, ...)
        for (int i = 0; i < linhas; i++) {

            int fator = (int) Math.pow(10, i);

            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = (j + 1) * fator;
            }
        }

        for (int j = 0; j < matriz[linhas-1].length; j++) {
            matriz[linhas-1][j] = (j + 1) * 11;
        }

        // Imprimir matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}