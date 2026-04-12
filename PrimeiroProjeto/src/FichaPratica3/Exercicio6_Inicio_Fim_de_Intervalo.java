package FichaPratica3;

import java.util.Scanner;

public class Exercicio6_Inicio_Fim_de_Intervalo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inicio, fim, cont = 0;

        System.out.println("Introduza um número de início: ");
        inicio = input.nextInt();
        System.out.println("Introduza um número para o final: ");
        fim = input.nextInt();
        cont = inicio;

        while (cont >= inicio && cont <= fim) {
            System.out.println(cont);
            cont = cont + 1;
        }
    }
}
