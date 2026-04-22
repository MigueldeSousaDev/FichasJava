package FichaPratica6;

import java.util.Scanner;

import static FichaPratica6.BibliotecaCuriosidades.*;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("Insira uma opção:\n 1 - Verificar se uma pessoa é maior de idade\n 2 - Identificar a fase da vida \n 3 - Mostrar a capital de um país \n 4 - Indicar a estação do ano a partir do mês \n 5 - Mostrar o dia da semana\n 6 - Classificar um número \n 0 - Para encerrar o programa\n");
            opcao = input.nextInt();

            if (opcao == 1) {
                System.out.println("Verificar se uma pessoa é maior de idade ");
                int idadeUtilizador;
                System.out.println("Qual é a idade da pessoa: ?");
                idadeUtilizador = input.nextInt();

                if (maiorDeIdade(idadeUtilizador) == true) {
                    System.out.println("É maior de idade.");
                }
                if (maiorDeIdade(idadeUtilizador) == false) {
                    System.out.println("É menor de idade.");
                }
                             }

            if (opcao == 2) {
                System.out.println("Identificar a fase da vida.");
                int idade;
                System.out.println("Qual é a idade da pessoa: ?");
                idade = input.nextInt();
                System.out.println("Fase: "+faseVida(idade));
            }
            if (opcao == 3) {
                System.out.println("Mostrar a capital de um país.");
                String capital;
                System.out.println("Indique o país para descobrir a capital.");
                capital = input.next();
                System.out.println("Capital: " + capitalPais(capital));
            }
            if (opcao == 4) {
                System.out.println("Indicar a estação do ano a partir do mês.");
                String estacao;
                int mes;
                System.out.println("Indique o mês em formato númerico para descobrir a Estação do Ano.");
                mes = input.nextInt();
                System.out.println("A estação do ano é: " + estacaoAno(estacao));
            }
            if (opcao == 5) {
                System.out.println("Mostrar o dia da semana.");
                String diasemana;
                int mes;
                System.out.println("Indique o mês em formato numérico para descobrir o Dia da Semana.");
                diasemana = input.next();
                System.out.println("O dia da semana é: " + diaSemana(diasemana));
            }
            if (opcao == 6) {
                System.out.println("Classificar um número.");
            }
            if (opcao == 0 ){
                System.out.println("Encerrar o programa.");
            }
            limparConsola();
            } while (opcao != 0); {

            }




        }
}







