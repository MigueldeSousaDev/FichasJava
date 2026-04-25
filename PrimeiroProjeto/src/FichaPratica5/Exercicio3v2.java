package FichaPratica5;

import java.util.Scanner;

public class Exercicio3v2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vetor[] = new int[10];
        int maior = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Preencha o vetor: [" + i + "]");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];

            }
        }

        System.out.println("O maior valor é: " + maior);


    }
}
