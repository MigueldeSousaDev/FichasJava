package FichaPratica3;

import java.util.Scanner;

public class Exercicio4_Imprimir_Numero_Inteiro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int num, cont = 0;

        System.out.println("Introduza um número: ");
        num = input.nextInt();

        while (num >= cont ) {
            System.out.println(cont);
            cont = cont + 1;

        }

    }
}
