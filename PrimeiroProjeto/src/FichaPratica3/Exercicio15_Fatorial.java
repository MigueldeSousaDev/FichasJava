package FichaPratica3;

import java.util.Scanner;

public class Exercicio15_Fatorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, x, resultado = 1;

        System.out.println("Insira o nº para cálculo fatorial: ");
        numero = input.nextInt();

       x = numero;

        while (x > 1 ) {
            resultado = resultado * x;
            x--;
        }

        System.out.println("Resultado: " + resultado);

    }
}
