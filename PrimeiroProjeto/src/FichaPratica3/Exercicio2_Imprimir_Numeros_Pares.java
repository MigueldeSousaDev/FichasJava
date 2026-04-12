package FichaPratica3;

import java.util.Scanner;

public class Exercicio2_Imprimir_Numeros_Pares {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 1;

        while (num <= 400) {
            if (num % 2 == 0) {
                System.out.println(num);
            }

            num = num + 1;
        }


    }
}
