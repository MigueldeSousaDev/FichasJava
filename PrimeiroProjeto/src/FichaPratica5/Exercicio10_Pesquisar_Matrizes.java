package FichaPratica5;

import java.util.Scanner;

public class Exercicio10_Pesquisar_Matrizes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matriz[][] = new int[3][5];

        // Adicionar Valores por ordem ao ciclo
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.println("Insira o valor: [" + linha + "][" + coluna + "]");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Ler valores através do ciclo
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }


        int contador = 0;
        int num;

            System.out.print("Indique o número que quer pesquisar: ");
            num = input.nextInt();
        // Indicar contagem do número na posição
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {

                if (num == matriz[linha][coluna]) {
                    contador += 1;
                }
            }
        }
        System.out.println("A contagem é: " + contador);


    }
}
