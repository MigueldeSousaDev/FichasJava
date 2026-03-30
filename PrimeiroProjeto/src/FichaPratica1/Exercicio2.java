package FichaPratica1;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        // EXERCÍCIO 2:
        //
        // Escreva um programa que requisite dois valores. O programa deverá utilizá-los como operandos para
        //as seguintes operações aritméticas: soma, subtração, multiplicação e divisão. Apresente o resultado
        //das operações e teste os resultados obtidos com vários casos.
        //Exemplo de execução:
        // - Introduza um numero: 20
        // - Introduza um numero: 4
        // - Soma: 24
        // - Subtracao: 16
        // - Multiplicacao: 80
        // - Divisao: 5

        // INÍCIO

        Scanner input = new Scanner(System.in);


        System.out.println("________Ficha Pratica 01 | Exercicio _________02");


        // Criação de variáveis (valor1, valor2, soma, subtracao, multiplicacao, divisao)
            int valor1, valor2, soma, subtracao, multiplicacao, divisao;


        //  Ler valor1 e valor2
            System.out.print("Insira um valor:");
            valor1 = input.nextInt();
            System.out.print("Insira um valor:");
            valor2 = input.nextInt();

        // Executar operações e dar Print a Cada Resultado e Operação. (usar Print Line)
            soma = valor1+valor2;
            System.out.println("A soma é:" + soma);

            subtracao = valor1-valor2;
            System.out.println("A subtração é:" + subtracao);

            multiplicacao = valor1 * valor2;
            System.out.println("A multiplicação é:" + multiplicacao);

            divisao = valor1/valor2;
            System.out.println("A divisão é:" + divisao);

            // Poderia ser resolvido apenas com uma 3ª variável, sendo re-atribuída constantemente

            // resultado = valor1+valor2
            // resultado = valor1-valor2
            // resultado = valor1*valor2
            // resultado = valor1/valor2



    }
}
