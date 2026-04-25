package FichaPratica5;

import java.util.Scanner;

public class Exercicio11v2_Imprimir_2_Vetores_Como_Matriz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matriz[][] = new int[3][3];

        // Adicionar Valores por ordem ao ciclo
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.println("Insira o valor: [" + linha + "][" + coluna + "]");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Ler valores através do ciclo
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        // Contador de ocorrências
        int counterMenor = 0;
        int counterMaior = 0;

        int menor = matriz[0][0];
        int maior = matriz[0][0];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {

                if (matriz[linha][coluna] > maior){
                    maior = matriz[linha][coluna];
                }
                if (matriz[linha][coluna] < menor) {
                    menor = matriz[linha][coluna];
                }
            }
        }
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);

//        for (int linha = 0; linha < matriz.length; linha++) {
//            for (int coluna = 0; coluna < 3; coluna++) {
//                if (matriz[linha][coluna] == pesquisaValor) {
//                    counter++;
//                }
//            }
//        }
    }
}
