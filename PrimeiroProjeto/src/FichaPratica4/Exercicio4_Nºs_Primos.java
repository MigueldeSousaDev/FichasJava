package FichaPratica4;

import java.util.Scanner;

public class Exercicio4_Nºs_Primos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        boolean primo = true;

        System.out.println("Insira um número e vamos confirmar se é Número Primo: ");
        numero = input.nextInt();

        for (int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0 ) {
                primo = false;
            }
        }
        if (primo) {
            System.out.println("Primo");
        } else {
            System.out.println("Não Primo");
        }



    }
}
