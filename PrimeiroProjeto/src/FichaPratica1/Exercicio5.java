package FichaPratica1;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("________Ficha Pratica 01 | Exercicio _________05");

    // Exercício 5
    // Escreva um programa que determine a média aritmética de um conjunto de 3 valores introduzidos pelo
    // utilizador. Tendo em consideração os valores introduzidos, deverá também apresentar a média
    // ponderada considerando as seguintes ponderações: 20%, 30%, 50%.

         // 0. Declarar 3 valores para cálculo da média

        double numero1, numero2, numero3, media, mediaponderada;

        // 1. Ler os 3 valores do Utilizador

        System.out.print("Por favor insira o número 1:");
        numero1 = input.nextDouble();

        System.out.print("Por favor insira o número 2:");
        numero2 = input.nextDouble();

        System.out.print("Por favor insira o número 3:");
        numero3 = input.nextDouble();

        // 2. Calcular as Médias e Apresentar.

        media = (numero1 + numero2 + numero3) / 3;
        System.out.println("A média é:" + media);

        mediaponderada = (numero1 * 0.2) + (numero2 * 0.3) + (numero3 * 0.5);
        System.out.print("A média ponderada é:" + mediaponderada);






    }

}
