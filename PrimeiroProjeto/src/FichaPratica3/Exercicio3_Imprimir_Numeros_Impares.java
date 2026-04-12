package FichaPratica3;

import java.util.Scanner;

public class Exercicio3_Imprimir_Numeros_Impares {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num =0;

        while ( num <= 750) {

            if (num % 2 != 0 && num>=531) {
                System.out.println(num);
            }
            num = num + 1;
        }


    }
}
