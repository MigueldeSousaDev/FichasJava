package FichaPratica2;

import java.util.Scanner;

public class Exercicio7_Numero_par_impar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       // 7. Escreva um programa que leia um número, depois apresente se é par ou ímpar.

        float num;

        System.out.println("Insira um número:");
        num = input.nextFloat();

        if (num % 2 == 0 ) {
            System.out.println(" O número é par.");
        } else {
            System.out.println(" O número é impar.");
            }
        }
    }
