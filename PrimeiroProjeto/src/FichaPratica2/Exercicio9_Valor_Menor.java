package FichaPratica2;

import java.util.Scanner;

public class Exercicio9_Valor_Menor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    //9. Crie um programa que mostre o menor de três números inteiros lidos.

        int num1, num2, num3;

        System.out.println("Insira um número: ");
        num1 = input.nextInt();

        System.out.println("Insira um número: ");
        num2 = input.nextInt();

        System.out.println("Insira um número: ");
        num3 = input.nextInt();

        if (num1 <= num2 && num1<=num3)
            System.out.println("O valor menor é: " + num1);
        else if (num2 <= num1 && num2<=num3)
            System.out.println("O valor menor é: " + num2);
        else if (num3 <= num2 & num3<=num1)
            System.out.println("O valor menor é: " + num3);
    }
}
