package FichaPratica5;

import java.util.Scanner;

public class Exercicio12v2_Diagonal_Matriz_EsqDrt_eSoma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // matriz.length lê as linhas
        // matriz[i].length lê as colunas. i é uma variável qualquer que usemos.

        int matriz[][] = new int[4][4];

        // Introduzir Valores na Matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Introduza um valor para a posição [" + linha + "] [" + coluna + "]:");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Print da leitura da Matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("O valor da posição [" + linha + "] [" + coluna + "] é:" + matriz[linha][coluna]);
            }
        }

        // Encontrar posições na diagonal principal
        // Começa na posição [0][0] e incrementa de 1 em 1 para fazer diagonal para [1][1] e [2][2]

        // 1. Guardar posição dos elementos na diagonal.
        // 2. Depois fazer a soma.

        int soma = 0;

        // matriz.length percorre as mesmas posições [4][4] > 4 posições ao aumenta o "i";
        // O "salto" é dado porque imprime matriz[i]+[i] ou seja, aumenta o "i" nos
        // dois vetores (matriz) fazendo assim a diagonal

        for (int i = 0; i< matriz.length; i++){
            System.out.println(matriz[i][i]);
            soma = soma + matriz[i][i];
        }
        System.out.println("Soma da diagonal é: " + soma);
    }
}
