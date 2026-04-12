package FichaPratica3;

import java.util.Scanner;

public class Exercicio12_Algoritmo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // controlo até introduzido nº negativo
        // contar quantas vezes cabe o numero introduzido dentro de cada lista
        //______________________________________________________________________

        int prompt = 0, contador = 0, negativo = 0;

        int a = 0, b = 25, c = 50, d = 75, e = 100;
        int cont_a = 0, cont_b = 0, cont_c = 0, cont_d = 0;
        int x = 0;

        while (prompt >= negativo) {

            System.out.println("Introduza um número:");

            prompt = input.nextInt();

            if (prompt >= a && prompt <= b) {
                cont_a++;
            }
            if (prompt >= b && prompt <= c) {
                cont_b++;
            }
            if (prompt >= c && prompt <= d) {
                cont_c++;
            }
            if (prompt >= d && prompt <= e) {
                cont_d++;
            }
        }
             System.out.println("[00,25]:"+cont_a);

             System.out.println("[26,50]:"+cont_b);
             System.out.println("[51,75]:"+cont_c);
             System.out.println("[76,100]:"+cont_d);
    }

}
