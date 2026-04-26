package FichaPratica6.Ex10;

import static FichaPratica6.Ex09.BibliotecaMatrizes.*;

import java.util.Scanner;

public class Exercicio10_Matrizes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Número de linhas: ");
        int linhas = input.nextInt();

        System.out.print("Número de colunas: ");
        int colunas = input.nextInt();

                int[][] matriz = new int[linhas][colunas];

                // Preencher matriz
                for (int i = 0; i < linhas; i++) {
                    for (int j = 0; j < colunas; j++) {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matriz[i][j] = input.nextInt();
                    }
                }

                System.out.println("---MATRIZ---");

                 // Imprimir matriz
                 for (int i = 0; i < linhas; i++) {
                     for (int j = 0; j < colunas; j++) {
                        System.out.print("Elemento [" + i + "][" + j + "] = " + matriz[i][j] + " \n");
                 }
        }


                int opcao;

                do {
                    System.out.println("\n--- MENU ---");
                    System.out.println("1. Maior Elemento");
                    System.out.println("2. Menor Elemento");
                    System.out.println("3. Somatório dos Elementos");
                    System.out.println("4. Média dos Elementos");
                    System.out.println("5. Soma da Diagonal Principal");
                    System.out.println("6. Quantidade de Pares");
                    System.out.println("7. Procurar um Valor");
                    System.out.println("0. Sair");

                    System.out.print("Escolha: ");
                    opcao = input.nextInt();

                    switch (opcao) {
                        case 1:

                            System.out.println("Maior Elemtno da Matriz: " +  maiorElemento(matriz) );

                            break;

                        case 2:
                            System.out.println("Menor Elemento da Matriz: " + menorElemento(matriz) );

                            break;

                        case 3:
                            System.out.println("Somatório das Matrizes inseridas: " + somatorio(matriz) );

                            break;

                        case 4:
                            System.out.println("Média: " + media(matriz) );

                            break;

                        case 5:
                            if (linhas == colunas) {
                                System.out.println("Soma da diagonal: " );
                            } else {
                                System.out.println("A matriz não é quadrada.");
                            }
                            break;

                        case 6:
                            System.out.println("Quantidade de pares: " );
                            break;

                        case 7:
                            System.out.print("Valor a procurar: ");


                            break;

                    }

                    limparConsola();

                } while (opcao != 0);


            }
    }

