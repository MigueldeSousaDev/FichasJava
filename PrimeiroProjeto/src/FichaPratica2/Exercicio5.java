package FichaPratica2;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //5. Escreva um programa que leia dois valores numéricos e apresente o menor e depois o maior.
        //Exemplos de execução:
        // - Introduza um número: 10
        // Introduza um número: 40
        // - 10 40
        // - Introduza um número: 111
        // - Introduza um número: 40
        // - 40 111


        int num1, num2;

        System.out.println("Introduza um número: ");
        num1 = input.nextInt();

        System.out.println("Introduza um número: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("O maior valor é: " + num1);
            System.out.println(" O valor menor é: " + num2);
        }
        if (num2 > num1 ) {
            System.out.println("O maior valor é: " + num2);
            System.out.println(" O valor menor é: " + num1);

        }



    }
}
