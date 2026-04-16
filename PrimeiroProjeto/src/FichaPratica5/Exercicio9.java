package FichaPratica5;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matriz[][] = new int[3][5];

        // Adicionar Valores por ordem ao ciclo
        for (int linha = 0 ; linha < 3 ; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.println("Insira o valor: [" + linha + "][" + coluna +"]");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Ler valores através do ciclo
        for (int linha = 0 ; linha < 3 ; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        int soma = 0;

        // Ler valores através do ciclo
        for (int linha = 0 ; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                soma = soma + matriz[linha][coluna];
            }
        }
        System.out.println("A soma é =" + soma);





    }
}
