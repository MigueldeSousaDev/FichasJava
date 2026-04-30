package FichaExtraArraysMatrizes;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int array[] = new int [12];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Prencha o valor da posição [" + i + "]:");
            array[i] = input.nextInt();
        }

        System.out.println("Insira o valor que quer remover do array: ");
        int valorRemovido = input.nextInt();


        // Contar nº de vezes existe o valor para subtrair ao tamanho da nova matriz
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorRemovido) {
                contador++;
            }
        }


        // Criar nova matriz com o tamanho certo < [12] aqui foi manual prompt, senão usava variável atribuida pelo userinput>

        int novoArray[] = new int[12 - contador];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != valorRemovido) {
                novoArray[j] = array[i];
                System.out.println(novoArray[j]);
                j++;
            }
        }

    }
}
