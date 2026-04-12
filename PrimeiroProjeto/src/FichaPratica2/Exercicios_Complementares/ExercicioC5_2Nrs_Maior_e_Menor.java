package FichaPratica2.Exercicios_Complementares;

import java.util.Scanner;

import java.util.Random;

public class ExercicioC5_2Nrs_Maior_e_Menor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Random gerador = new Random();

        int mist = gerador.nextInt(101); // 0 até 100 incluído;
        int num;

        System.out.println("Adivinhe o número: ");
        num = input.nextInt();

        if (num > mist) {
            System.out.println("O teu número é maior que o número mistério. Tenta outra vez.");
        }
        if (num < mist) {
            System.out.println("O teu número é menor que o número mistério. Tenta outra vez.");

        } else if (num == mist) {
            System.out.println("Acertaste no número mistério!");
        }


    }
}
