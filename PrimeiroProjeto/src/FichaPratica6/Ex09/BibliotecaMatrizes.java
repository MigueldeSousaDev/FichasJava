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

// --------------------------------------------------------------------------------------

public static int maiorElemento(int[][] matriz) {

    int maior = matriz[0][0];

    // Encontrar o Maior valor do ciclo
    for (int linha = 0 ; linha < matriz.length ; linha++) {
        for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
            if (matriz[linha][coluna] > maior) {
            maior = matriz[linha][coluna];
            }
          }
        }
    return maior;
    }

// -------------------------------------------------------------------------------------

    public static int menorElemento(int[][] matriz) {

        int menor = matriz[0][0];

        // Encontrar o Menor valor do ciclo
        for (int linha = 0 ; linha < matriz.length ; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] < menor) {
                    menor = matriz[linha][coluna];
                }
            }
        }
        return menor;
    }

// -------------------------------------------------------------------------------------

    public static int somatorio(int[][]matriz) {

    int somatorio = 0;

        // Fazer o somatório dos valores na Matriz
        for (int linha = 0 ; linha < matriz.length ; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                somatorio = somatorio + matriz[linha][coluna];
                }
            }
        return somatorio;
        }

    // ----------------------------------------------------------------------------------

    public static int media(int[][]matriz) {


        // Calcula a média, mas assume que a Matriz tem o mesmo nº de linhas e colunas. Código seria diferente para matrizes irregulares

        int somatorio = somatorio(matriz);

        int media = somatorio / (matriz.length * matriz[0].length);

        return media;

    }


}



