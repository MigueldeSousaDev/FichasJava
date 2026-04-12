package FichaPratica1;

import java.util.Scanner;

public class Exercicio3_Calcular_area_perimetro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("________Ficha Pratica 01 | Exercicio _________03");

        // EXERCICIO 3
        // Escreva um programa que calcule e apresente a área e o perímetro de um retângulo. As dimensões
        // devem ser requisitadas ao utilizador.

        // Área = Lado x Lado >>> lado1 * lado 2
        // Perímetro = (lado1 * 2) + (lado2 * 2)

        // Declarar todas variáveis
        double lado1, lado2, area, perimetro;

        // Ler os Valores

        System.out.print("Qual a medida do lado 1?: ");
        lado1 = input.nextInt();

        System.out.print("Qual a medida do lado 2?: ");
        lado2 = input.nextInt();

        // Efetua cálculo + Apresentar resultados

        area = lado1 * lado2;
        System.out.print("A área do rectângulo é: " + area);

        perimetro = lado1*2 + lado2*2;
        System.out.print("O perímetro é: " + perimetro);



    }
}
