package FichaPratica2.Exercicios_Complementares;

import java.util.Scanner;

public class ExercicioC7_Par_e_Impar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;

        System.out.println("Introduza um número: ");
        a = input.nextInt();


        if (a % 2 == 0) {
            System.out.println("O numero é par.");
        } else {
            System.out.println("O numero é impar.");
        }


    }
}
