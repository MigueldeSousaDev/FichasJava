package FichaPratica5;

import java.util.Scanner;

public class Exercicio7 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Criar variáveis

        int array[] = new int[10];
        int maior = array[0];

        // Leitura do Vetor
        System.out.println("----Leitura do Armário----");

        boolean encontrouPar = false;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Insira um o elemento: [ " + i + " ]\n");
            array[i] = input.nextInt();
            if (array[i] % 2 == 0 && array[i] > maior) {
                maior = array[i];
                encontrouPar = true;
            }
        }


        if (encontrouPar == true) {
            System.out.println(" O maior número par é: " + maior);
        } else {
            System.out.println("Não há números pares.");
        }

// testar se o incremento de 2 / 4 / 6 etc
        // 1º impar muito grande
        // etc funcionar deve estar ok

    }
}
