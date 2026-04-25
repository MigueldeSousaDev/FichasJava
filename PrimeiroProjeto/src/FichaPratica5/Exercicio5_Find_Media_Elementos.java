package FichaPratica5;

import java.util.Scanner;

public class Exercicio5_Find_Media_Elementos {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // Criar variáveis
            int[] armario = new int[10];

            // Leitura do Vetor
            System.out.println("----Leitura do Armário----");

            for (int i = 0; i < armario.length; i++) {
                System.out.println("Insira um número no armário[ " + i + "]: ");
                armario[i] = input.nextInt();
            }

            // Encontrar o media dos elementos
            int media =  armario[0];

            for (int i = 0; i < armario.length; i++) {
                if(armario[i] > media) {
                    media = armario[i];
                }
            }

            System.out.println("Media: " + media);
    }
}

//package FichaPratica5;
//
//import java.util.Scanner;
//
//public class Ex_5_Media {
//    public static void main(String[] args) {
//
//        // Import do Scanner
//        Scanner input_= new Scanner(System.in);
//
//        System.out.println("_____FP05 | EX05_____");
//
//        // Criar variáveis
//
//        int[] vetor = new int[10]; // criamos um vetor com 10 lugares
//
//        int soma=0, media ;
//
//        // Leitura do vetor
//
//        System.out.println("\n  ----- Leitura do Vetor ----- ");
//
//        for( int i = 0 ; i < vetor.length; i++ ) {
//            System.out.println("Insira um número no vetor [" + i + "]:");
//            vetor[i] = input_.nextInt();}
//
//
//        // Cálculo da média
//
//        for( int i = 0; i < vetor.length; i++){
//            soma = vetor[i] + soma;
//
//        }
//        System.out.println("Soma:" + soma);
//
//
//        media = soma / vetor.length;
//        System.out.println("Média=" + media);
//    }
//}