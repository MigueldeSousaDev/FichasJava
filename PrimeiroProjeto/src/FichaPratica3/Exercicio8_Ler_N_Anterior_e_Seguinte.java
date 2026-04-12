package FichaPratica3;

import java.util.Scanner;

public class Exercicio8_Ler_N_Anterior_e_Seguinte {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 0;

        System.out.println("Introduza um número: ");
        num = input.nextInt();

        int cont1 = num - 5;

        while (num > cont1) {

            System.out.println(cont1);
            cont1 = cont1 + 1;
        }

        System.out.println("\n");

        int cont2 = num + 5;

        while (num < cont2) {
            num = num + 1;
            System.out.println(num);


        }
    }
}
