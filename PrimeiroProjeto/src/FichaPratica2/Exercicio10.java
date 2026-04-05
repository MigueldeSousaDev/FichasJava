package FichaPratica2;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 10. Escreva um programa que leia dois números reais e pergunte ao utilizador qual a operação aritmética que quer
        // realizar e apresente o resultado. O utilizador deve responder usando o símbolo da operação (exemplo: para fazer
        // a soma, o utilizador deve escrever ‘+’). Se for inválido apresente erro.

        double num1, num2;
        String sinal;

        System.out.println("1. Escreva um número real (decimal): ");
        num1 = input.nextDouble();

        System.out.println("2. Escreva um número real (decimal): ");
        num2 = input.nextDouble();

        System.out.println("Indique qual a operação aritméica que quer usar, usando o respetivo símbolo: ");
        sinal = input.next();

        switch (sinal) {
            case "+": System.out.println("O resultado é " + (num1+num2));
                break;
            case "-": System.out.println("O resultado é " + (num1-num2));
                break;
            case "*": System.out.println("O resultado é " + (num1*num2));
                break;
            case "/": System.out.println("O resultado é " + (num1/num2));
                break;
            case "%": System.out.println("O resultado é " + (num1%num2));
                break;
            default:
                System.out.println(" Insira um operador válido.");

        }
    }
}
