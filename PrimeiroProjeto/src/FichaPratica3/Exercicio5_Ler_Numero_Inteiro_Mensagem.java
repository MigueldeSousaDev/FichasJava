package FichaPratica3;

import java.util.Scanner;

public class Exercicio5_Ler_Numero_Inteiro_Mensagem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        String mensagem;
        int cont = 0;

        System.out.println("Introduza um número: ");
        num = input.nextInt();

        System.out.println("Introduza uma mensagem: ");
        input.nextLine();
        mensagem = input.nextLine();

        while (cont < num) {
            System.out.println(mensagem);
            cont = cont + 1;
        }



    }
}
