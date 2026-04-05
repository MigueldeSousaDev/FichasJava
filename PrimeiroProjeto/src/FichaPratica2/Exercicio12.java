package FichaPratica2;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 12.Implemente um programa de menu (opções do menu:

        // 1. Criar
        // 2. Atualizar
        // 3. Eliminar 4. Sair).
        //
        // Se uma das opções 1, 2 ou 3 for escolhida, imprima na tela a opção selecionada,
        // se for a 4 não deve fazer nada. Caso a opção for inválida, deve informar o utilizador.


        int opcao;
        System.out.println("\n --MENU--\nInsira uma opção: \n1. Criar \n2. Atualizar \n3. Eliminar \n4. Sair");
        opcao = input.nextInt();

        if (opcao >= 1 && opcao <=3) {
            System.out.println("Selecionaste a opção: " + opcao);
        } else if (opcao == 4) {
            System.out.println("NÃO FAZER NADA.");
        } else {
            System.out.println("A sua opção está inválida.");
        }

    }

}

//int opcao;
//System.out.println("\n --MENU--\nInsira uma opção: \n1. Criar \n2. Atualizar \n3. Eliminar \n4. Sair");
//opcao = input.nextInt();
//
/// / Utilização do switch como seletor para as alternativas [1, 3]
//switch (opcao) {
//    case 1:
//    case 2:
//    case 3:
//        // Para as opções 1, 2 ou 3, imprime a opção selecionada [4]
//        System.out.println("Selecionaste a opção: " + opcao);
//        break; // Interrompe a execução para não passar para o caso seguinte [2]
//    case 4:
//        // Opção 4: Não deve fazer nada, conforme solicitado [4]
//        break;
//    default:
//        // A cláusula default trata qualquer opção que não seja 1, 2, 3 ou 4 [2, 5]
//        System.out.println("A sua opção está inválida.");
//}