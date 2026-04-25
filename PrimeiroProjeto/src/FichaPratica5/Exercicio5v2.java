package FichaPratica5;

import java.util.Scanner;

public class Exercicio5v2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Alterei de 10 para 4 o Vetor para testes
        int vetor[] = new int[4];
        int soma = 0;
        int media= 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor para o vetor: [" + i + "]");
            vetor[i] = input.nextInt();
            soma = soma + vetor[i];
        }

        media = soma / vetor.length;
        System.out.println("Média dos vetores: " + media);
    }
}
