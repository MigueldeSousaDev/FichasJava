package FichaPratica5;

import java.util.Scanner;

public class Exercicio3_Find_Maior_Valor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vetor[] = new int[10];
        int maior = 1;
        int temp;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira o valor: [" + (i+1) + "] ");
            vetor[i] = input.nextInt();

            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
            System.out.println("O maior valor é: " + maior);
























//        // Criar variáveis
//        int[] armario = new int[10];
//
//        // Leitura do Vetor
//        System.out.println("----Leitura do Armário----");
//
//        for (int i = 0; i < armario.length; i++) {
//            System.out.println("Insira um número no armário[ " + i + "]: ");
//            armario[i] = input.nextInt();
//        }
//
//        // Encontrar o maior elemento
//        int maior =  armario[0];
//
//        for (int i = 0; i < armario.length; i++) {
//            if(armario[i] > maior) {
//                maior = armario[i];
//            }
//        }
//
//        System.out.println("Maior: " + maior);
    }
}
