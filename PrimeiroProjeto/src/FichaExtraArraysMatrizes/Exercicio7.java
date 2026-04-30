package FichaExtraArraysMatrizes;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do array: ");
        int tamanho = input.nextInt();

        int[] array = new int[tamanho];

        // Preencher array
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Adicione o valor do elemento [" + i + "]:");
            array[i] = input.nextInt();
        }

        System.out.println("Array original: " + Arrays.toString(array));

        // Valor a remover
        System.out.println("Que valor pretende remover?");
        int valorRemovido = input.nextInt();

        // 1) Contar quantos vão ser removidos
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorRemovido) {
                contador++;
            }
        }

        // 2) Criar novo array com tamanho correto
        int[] novoArray = new int[array.length - contador];

        // 3) Copiar apenas os valores válidos
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != valorRemovido) {
                novoArray[j] = array[i];
                j++;
            }
        }

        // Resultado final
        System.out.println("Novo array (sem o valor " + valorRemovido + "): " + Arrays.toString(novoArray));
    }
}