package FichaPratica3;

import java.util.Scanner;

public class Exercicio14_SequenciaCrescente_While {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int vezes, contador =1;
        int numeroAnterior, numeroAtual;
        boolean crescente = true;

        System.out.println("Quantas números deseja inserir?: ");
        vezes = input.nextInt();

        System.out.println("Introduza um número: ");
        numeroAnterior = input.nextInt();


        while (contador < vezes) {
            System.out.println("Introduza um número: ");
            numeroAtual = input.nextInt();


            if ( numeroAtual <= numeroAnterior ) {
                crescente = false;
                numeroAnterior = numeroAtual;
                contador++;
            }

            if (crescente) {
                System.out.println("Crescente.");
            } else {
                System.out.println("Não Crescente.");
            }

        }




    }
}
