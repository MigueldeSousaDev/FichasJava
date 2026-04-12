package FichaPratica2;

import java.util.Scanner;

public class Exercicio16_Ler_Euros_Multiplos5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    // ex 16. Escreva um programa que lê um valor em euros (múltiplo de 5) e calcula qual o menor número possível de notas de
    // 200, 100, 50, 20, 10, 5 em que o valor pode ser decomposto. Escrever o valor lido e a relação de notas necessárias.

        // Introduzir euros (multiplos de 5)
        // Calcular Menor Valor Possivel de notas

        int valor=0, rem=0, quo=0;

        System.out.println("Insira um valor, múltiplo de 5, para Euros:");
        valor = input.nextInt();

        if (valor >=500) {
            rem = valor/500;
            System.out.println(rem + " Notas de 500€.");
            valor = valor%500; }
        if (valor >=200) {
            rem = valor/200;
            System.out.println(rem + " Notas de 200€.");
            valor = valor%200; }
        if (valor >=100) {
            rem = valor/100;
            System.out.println(rem + " Notas de 100€.");
            valor = valor%100; }
        if (valor >=50) {
            rem = valor/50;
            System.out.println(rem + " Notas de 50€.");
            valor = valor%50; }
        if (valor >=20) {
            rem = valor/20;
            System.out.println(rem + " Notas de 20€.");
            valor = valor%20; }
        if (valor >=10) {
            rem = valor/10;
            System.out.println(rem + " Notas de 10€.");
            valor = valor%10; }
        if (valor >=5) {
            rem = valor/5;
            System.out.println(rem + " Notas de 5€.");
            valor = valor%5; }




    }
}
