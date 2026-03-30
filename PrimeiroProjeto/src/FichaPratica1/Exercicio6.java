package FichaPratica1;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Escreva um programa que leia dois valores inteiros e os armazene na variáveis valor1 e valor2. Permute
        //o valor das variáveis e apresente o resultado. De seguida, verifique se consegue efetuar esta troca sem
        //criar variáveis adicionais


































        int valor1, valor2, aux;

        // Ler valores
        System.out.println("Insira o valor 1:");
        valor1= input.nextInt();

        System.out.println("Insira o valor 2:");
        valor2= input.nextInt();

        // trocar os valores
        aux = valor1;
        valor1 = valor2;
        valor2 = aux;

        // Apresentamos os valores trocados
        System.out.println("\nValor1: " + valor1);
        System.out.println("Valor 2: " + valor2);



        // exercicio 6 sem variavel auxiliar

        //  int valor1, valor2;

        //  System.out.println("Insira o valor 1:");
        // valor1= input.nextInt();

        // System.out.println("Insira o valor 2:");
        //  valor2= input.nextInt();

        // valor1 = valor1 + valor2;
        //  valor2= valor1 - valor2;
        // valor1 = valor1 - valor2;




    }
}
