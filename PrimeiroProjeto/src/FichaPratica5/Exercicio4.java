package FichaPratica5;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vetor[] = new int[10];
        int menor;
        int temp;


        // O ciclo faz percorrer todas as posições do 0 até ao 9 (10 posições)
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira o valor: [" + (i+1) + "] ");
            vetor[i] = input.nextInt();
            }

        //  int menor = vetor[i];
        // Tenho que assignar o valor fora do ciclo, para o menor, Professor resolveu criando dois ciclos distintos em vez de apenas um para evitar usar "1" como estrutura de controlo no exercício anterior. Neste caso, seria complicado e pouco escalável, assim que sigo com a resolução do Vitor.


        // A variável menor é atribuida depois do 1º ciclo para evitar repetição e perda de informação

        menor = vetor[0];

        // Condicional para assignar o menor valor dentro do ciclo (ver chavetas)
        for (int i = 0; i < vetor.length; i++)
            if (vetor[i] < menor) {
                menor = vetor[i];
            }

        System.out.println("O menor valor é: " + menor);
























//        // Criar variáveis
//        int[] armario = new int[10];
//
//        // Leitura do Vetor
//        System.out.println("----Leitura do Armário----");
//
//        for (int i = 0; i < armario.length; i++) {
//            System.out.println("Insira um número no armário[ " + i + "]: ");
//            armario[i] = input.nextInt();
//        }
//
//        // Encontrar o menor elemento
//        int menor =  armario[0];
//
//        for (int i = 0; i < armario.length; i++) {
//            if(armario[i] > menor) {
//                menor = armario[i];
//            }
//        }
//
//        System.out.println("Menor: " + menor);
    }
}

