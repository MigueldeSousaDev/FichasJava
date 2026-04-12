package FichaPratica4;

import java.util.Scanner;

public class Exercicio2_Menu_Loop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("Insira uma opção:\n 1 - Criar\n 2 - Atualizar\n 3 - Excluir\n 4 - Sair\n");
            opcao = input.nextInt();

            if (opcao == 1) {
                System.out.println("Escolheu a opção Criar.");
            }
            if (opcao == 2) {
                System.out.println("Escolheu a opção Criar.");
            }
            if (opcao == 3) {
                System.out.println("Escolheu a opção Criar.");
            }
            if (opcao == 4) {
                System.out.println("Escolheu a opção Sair.");
            }

        } while (opcao != 4); {
            }
        }



}
