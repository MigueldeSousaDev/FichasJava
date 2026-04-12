package FichaPratica2;

import java.util.Scanner;

public class Exercicio6_Ler_Numeros_if_else {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //6. Escreva um programa que leia dois valores numéricos e apresente o maior e depois o menor.


        int num1, num2;

        System.out.println("Introduza um número: ");
        num1 = input.nextInt();

        System.out.println("Introduza um número: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("O maior valor é: " + num1);
            System.out.println(" O valor menor é: " + num2);
        }
        if ( num2 > num1 ) {
            System.out.println("O maior valor é: " + num2);
            System.out.println(" O valor menor é: " + num1);
        } else if
            ( num2 == num1 ) {
                System.out.println("Erro.Os números são iguais.");
            }
        }

    }

