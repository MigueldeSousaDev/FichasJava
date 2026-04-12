package FichaPratica4;

import java.util.Scanner;

public class Exercicio1_Calculadora {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

         int a=0, b=0;
         String operacao;
         String opcao;



        do {

            System.out.println("Insira um valor: ");
            a=input.nextInt();
            System.out.println("Insira um valor: ");
            b= input.nextInt();
            System.out.println("Insira uma operação aritmética: ");
            operacao = input.next();


            if (operacao.equals("+")) {
            System.out.println("O resultado é: " + (a + b));
        }
            if (operacao.equals("-")){
            System.out.println("O resultado é: " + (a - b));
        }
            if (operacao.equals("*")){
            System.out.println("O resultado é: " + (a * b));
        }
            if (operacao.equals("/")){
            System.out.println("O resultado é: " + (a / b));
        }

            if (operacao.equals("/")){
            System.out.println("Deseja continuar? (S/N)");


        }

        System.out.println("Deseja continuar? (S/N)");
        opcao =  input.next();

        } while (opcao.equals("S"));



    }
}
