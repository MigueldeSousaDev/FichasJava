package FichaPratica5;

import java.util.Scanner;

public class Exercicio11_Find_Maior_Menor_Valor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matriz[][] = new int[3][3];


        // Adicionar Valores por ordem ao ciclo
        for (int linha = 0 ; linha < 3 ; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("Insira o valor: [" + linha + "][" + coluna +"]");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Ler valores através do ciclo
        for (int linha = 0 ; linha < 3 ; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }


        // Indicar Maior e Menor Valor na Matriz

        int menor = matriz[0][0], maior = matriz[0][0];

        for (int linha = 0 ; linha < 3 ; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (matriz[linha][coluna] >maior ){
                    maior=matriz[linha][coluna];
                    System.out.println("OO maior valor é: " + maior);
                }

                if (matriz[linha][coluna]<menor ){
                    menor=matriz[linha][coluna];
                    System.out.println("O menor valor é: " + menor);
                }
            }
        }



    }
}
