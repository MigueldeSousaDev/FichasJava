package FichaPratica1;

import java.util.Scanner;

public class Exercicio1 {

        public static void main(String[] args) {

            // Import do Scanner

            Scanner input = new Scanner(System.in);

            // Criar Variáveis
            int valor1, valor2, soma;

            System.out.println("________Ficha Pratica 01 | Exercicio _________01");

            // Perguntar valor1 ao utilizador
            System.out.print("Insira um número: ");
            valor1 = input.nextInt();

            // Perguntar valor2 ao utilizador
            System.out.print("Insira um número: ");
            valor2 = input.nextInt();

            // Calcular a soma
            soma = valor1 + valor2;

            // Apresentar a soma
            System.out.println("Soma: " + soma);

    }

}
