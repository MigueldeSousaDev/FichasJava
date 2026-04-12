package FichaPratica3;

import java.util.Scanner;

public class Exercicio7_Imprimir_numeros_somatorio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cont = 0, inicio= 0, fim = 100;
        int soma = cont;

        while ( cont >= inicio && cont <= fim) {
            System.out.println(cont);
            soma = soma + cont;
            cont = cont +1;

        }

        System.out.println(soma);


        // soma = 0 > 0 + 0 > 0 + 1 > 1 + 1 > 1 + 2 > 2 + 3(?)
        // cont = 0 > 0 + 1 > 1 + 1 >

    }
}
