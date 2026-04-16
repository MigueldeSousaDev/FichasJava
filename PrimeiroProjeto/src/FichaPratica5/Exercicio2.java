package FichaPratica5;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Criar Variáveis

        double vetor[] = new double[12];
        double temp = 0;
        double soma = 0;

        // Executar código

        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Insira a comissão mensal relativa a cada mês: Mês:" + (i + 1)+ " ");
            vetor[i] = input.nextDouble();
            temp = soma;
            soma = vetor[i] + temp;
        }

        // Calcular a Soma Total

        System.out.println("O valor da soma é : " + soma);
    }
}
















//        // Criar variáveis
//        double[] comissoes = new double[12];
//        double somaComissoes = 0;
//
//        // Leitura do vetor
//        System.out.println("-Leitura de Comissões-");
//
//        for (int i = 0; i < comissoes.length; i++) {
//            System.out.println("Insira as comissões [" + i + "]: ");
//            comissoes[i] = input.nextDouble();
//        }
//
//        // Calcular a soma dos elementos
//        for (int i = 0; i < comissoes.length; i++) {
//            somaComissoes = somaComissoes + comissoes[i];
//        }
//
//        System.out.println("Total de Comissões Anuais: " + somaComissoes + "€");







//        double[] vetor = new double[12];
//        double total = 0;
//
//        for (int i = 0; i < vetor.length; i++) {
//            System.out.println("Insira o valor da comissão do mês[ " + (i + 1) + "]: ");
//            vetor[i] = input.nextDouble();
//
//            System.out.println("Impressao do valor total das comissoes ");
//
//            for (int i = 0; i < vetor.length; i++) {
//                System.out.println("Insira um número no armário[ " + i + "]: ");
//                total = vetor[i] + total;
//            }
//        }
//    }
//}












//       // // Leitura do Valor
//        System.out.println("Insira a posição (mês -1) onde deseja inserir a comissão (de 1 a 12).\n13 Para Sair: ");
//        mes = input.nextInt();
//
//
//       while (mes>0 && mes<12)
//        if (mes >= 0 && mes <= 12) {
//            System.out.println("Introduza o valor que deseja adicionar: ");
//            comissoes[mes - 1] = input.nextInt();
//        } else {
//            for (int i=0; i<12; i++) {
//                total += comissoes[i];
//            }
//            System.out.println("Total anual: " + total);
//        }
//
//            System.out.println("Mês inválido.");





