package FichaPratica5;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int[] armario = new int[10];

        // Leitura do Vetor
        System.out.println("----Leitura do Armário----");

        for (int i = 0; i < armario.length; i++) {
            System.out.println("Insira um número no armário[ " + i + "]: ");
            armario[i] = input.nextInt();
        }

        // Encontrar o valor dos elementos
        int anterior =  armario[0];

        for (int i = 0; i < armario.length; i++) {
            if (armario[i] > anterior) {
                anterior = armario[i];
            }
        }

        System.out.println("Media: " + anterior);



    }
}
