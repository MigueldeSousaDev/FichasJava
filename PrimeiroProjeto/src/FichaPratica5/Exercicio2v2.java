package FichaPratica5;

import java.util.Scanner;

public class Exercicio2v2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vetor[] = new int[12];

        int temp;
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira o salário do mês [" + (i +1) +"]:");
            vetor[i] = input.nextInt();
            soma = soma + vetor[i];
        }
        System.out.println("Soma dos meses: " + soma);

    }
}

// Corrigido e testado
