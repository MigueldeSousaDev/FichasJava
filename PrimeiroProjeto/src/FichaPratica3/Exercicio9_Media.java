package FichaPratica3;

import java.util.Scanner;

public class Exercicio9_Media {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valor = 0;
        double media, soma = 0;
        double contador = -1;

        while (valor != -1) {
            System.out.println("Introduza um valor:");
            valor = input.nextDouble();
            soma = valor + soma;
            contador++;
        }

        media = soma / contador;

        if (valor == -1) {
            System.out.println("Acertou no número!. A média é: " + media);
        }

    }
}
