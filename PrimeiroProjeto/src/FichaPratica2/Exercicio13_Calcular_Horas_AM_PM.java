package FichaPratica2;

import java.util.Scanner;

public class Exercicio13_Calcular_Horas_AM_PM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //Faça um programa que leia um horário no sistema de 24 horas e imprima esse horário no sistema de 12 horas.
        //Exemplo:
        //Valores Lidos: 22 32       Resultado: 10 32 PM
        //Valores Lidos: 10 44       Resultado: 10 44 AM

        //Exemplos de execução:

        // - Introduza horas: 11
        // - Introduza minutos: 40
        // - 11:40 AM

        // - Introduza horas: 22
        // - Introduza minutos: 15
        // - 10:15 PM


        int horas, minutos;

        System.out.println("Introduza Horas:");
        horas = input.nextInt();

        System.out.println("Introduza Minutos:");
        minutos = input.nextInt();


        if (horas >= 0 && horas <=11) {
            System.out.println("A hora é: " + horas + ":" + minutos + " A.M.");
        } else {
                System.out.println("A hora é: " + (horas-12) + ":" + minutos + " P.M.");
        }
    }
}
