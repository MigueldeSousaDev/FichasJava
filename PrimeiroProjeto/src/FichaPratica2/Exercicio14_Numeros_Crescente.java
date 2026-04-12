package FichaPratica2;

import java.util.Scanner;

public class Exercicio14_Numeros_Crescente {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    // 14. Escreva um programa que leia 3 números, seguidamente deve colocar os números no ecrã por ordem crescente.

    int a, b, c, menor, temp;

        System.out.println("Insira o valor A:");
        a = input.nextInt();

        System.out.println("Insira o valor B:");
        b = input.nextInt();

        System.out.println("Insira o valor C:");
        c = input.nextInt();


        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

         if (a > c) {
            temp = a;
            a =c;
            c = temp;
        }

         if (b>c) {
             temp = b;
             b = c;
             c = temp;
        }

        System.out.println("A ordem de valores por ordem crescente é:" + a + "<" + b + "<" + c);

//a = 20 b = 10
//
//se 20 > 10
//0 = 20
//20 passa a 10
//10 passa a 20
//
//a= 30 ; c = 10
//se 30 > 10
//0 = 30
//30 passa 10
//10 passa a 30
//
//se
//
//b= 40 c = 20
//se b > c
//0 temp = b
//b = c
//c= temp
//
//O algoritmo confirma a ordem de A para B para C garantindo a ordenação.
//É importante dar print por ordem



    }
}
