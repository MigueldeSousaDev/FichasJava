package FichaPratica5;

import java.util.Scanner;

public class Exercicio10v2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matriz[][] = new int[3][5];

        // Adicionar Valores por ordem ao ciclo
        for (int linha = 0 ; linha < matriz.length ; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.println("Insira o valor: [" + linha + "][" + coluna +"]");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Ler valores através do ciclo
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        // Procurar Valor

        System.out.println("Insira um número para pesquisar: ");
        int pesquisaValor = input.nextInt();

        // Contador de ocorrências
        int counter = 0;

        for (int linha = 0; linha < matriz.length ; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (matriz[linha][coluna] == pesquisaValor) {
                    counter++;
                }
            }
        }

        System.out.println("O valor inserido [" + pesquisaValor + "] foi encontrado " + counter + " vezes.");

    }
}
