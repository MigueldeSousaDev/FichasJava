package FichaPratica3;

import java.util.Scanner;

public class Exercicio13_Algoritmo_fim_inicio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inicio, incremento, fim;

        System.out.println("Introduz um nº de início: ");
        inicio = input.nextInt();

        System.out.println("Introduz um nº de finalização: ");
        fim = input.nextInt();

        incremento = inicio;

        while (inicio <= fim) {

            if (incremento % 5 == 0 ) {
                System.out.println(incremento);
            }

        }
        incremento++;




    }
}
// 16   >>   38
// num = ?
// 20 - 25 - 30 - 35