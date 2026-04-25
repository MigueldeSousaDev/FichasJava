package FichaPratica5;

import java.util.Scanner;

public class Exercicio7v2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Alterei de 10 para 5 o Vetor para testes
        int vetor[] = new int[5];


        // Pedir Valores para os Vetores
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor para o vetor: [" + i + "]");
            vetor[i] = input.nextInt();
        }

        int maiorValor = 0;
        boolean encountrouPar = false;

        // Ler valores e Assignar o Maior Valor
        for (int i = 0; i < vetor.length; i++ ) {
            if (vetor[i] % 2 == 0 && vetor[i] > maiorValor ) {
                    maiorValor = vetor[i];
                    encountrouPar = true;
            }
        }

        if (encountrouPar == true) {
            System.out.println("O maior valor par é:" + maiorValor);
        } else {
            System.out.println("Não há números pares.");
        }

    }
}