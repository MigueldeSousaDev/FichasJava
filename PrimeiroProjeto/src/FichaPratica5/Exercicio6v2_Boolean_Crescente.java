package FichaPratica5;

import java.util.Scanner;

public class Exercicio6v2_Boolean_Crescente {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Alterei de 10 para 4 o Vetor para testes
        int vetor[] = new int[4];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor para o vetor: [" + i + "]");
            vetor[i] = input.nextInt();
        }

        boolean crescente = true;

        for (int i = 1; i < vetor.length; i++) {
            if ( vetor[i] < vetor[i - 1] ) {
                crescente = false;
                break;
            }
        }

        if (crescente) {
            System.out.println("O array está em ordem crescente.");
        } else {
            System.out.println("O array não está em ordem crescente.");
        }

    }
}
