package FichaPratica2;


import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("________Ficha Pratica 02 | Exercicio _________01");

        // 0. Declarar variáveis
        int num1, num2, maior;

        // 1.

        System.out.println("Insira  valor 1:");
        num1 = input.nextInt();

        System.out.println("Insira o valor 2:");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("Maior" + num1);
        } else {
            System.out.println("Maior" + num2);
        }

    }
}
