package FichaPratica5;

import java.util.Scanner;

public class Exercicio4v2 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tamanhoVetor;

        // Pede ao USER a quantidade de posições

        System.out.println("Quantas posições a partir de 0 quero no vetor?");
        tamanhoVetor = input.nextInt();

        // Usa variável para alocar tamanho ao vetor

        int vetor[] = new int[tamanhoVetor];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor da posição [" + i + "]:");
            vetor[i] = input.nextInt();
        }

        int menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("Menor: " + menor);

    }
}

