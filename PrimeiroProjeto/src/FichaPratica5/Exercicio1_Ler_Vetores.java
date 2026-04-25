package FichaPratica5;

import java.util.Scanner;

public class Exercicio1_Ler_Vetores {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // O seguinte seria uma má prática, até errada:
        // System.out.println("Insira um número no armário: ");
        // armario[0] = input.nextInt();


        // Criar variáveis
        int[] armario = new int[10];

        // Leitura do Vetor
        System.out.println("----Leitura do Armário----");

        for (int i = 0; i < armario.length; i++) {
            System.out.println("Insira um número no armário[ " + i + "]: ");
            armario[i] = input.nextInt();
        }

        // Impressão do vetor

        System.out.println("\n----Impressão do Armário----");

        for (int i = 0; i < armario.length; i++) {
            // System.out.println(armario[i]);
            System.out.println("Armário[" + i + "]: " + armario[i]);

        }


    }
}