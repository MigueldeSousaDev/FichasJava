package FichaPratica1;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("________Ficha Pratica 01 | Exercicio _________04");

        // Exercicio 4
        //Escreva um programa para calcular a área da circunferência. As dimensões devem ser requisitadas ao
        //utilizador.

        double raio;
        double pi= 3.14159265;
        double area_circulo;

        // 1. Pedir Inputs ao User e armazenar valor
        System.out.println("Insira o raio do círculo:");
        raio = input.nextDouble();

        // 2. Apresentar resultado
        area_circulo = raio * pi * raio;
                System.out.print("A área do círculo é:"+ area_circulo);





    }

}
