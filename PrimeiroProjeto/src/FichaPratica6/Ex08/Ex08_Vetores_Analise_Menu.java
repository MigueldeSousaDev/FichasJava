package FichaPratica6.Ex08;

import java.util.Scanner;

import static FichaPratica6.Ex07.BibliotecaDeVetores.*;

public class Ex08_Vetores_Analise_Menu {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

// INÍCIO DA SEQUÊNCIA DO MENU > Pedir tamanho Vetores e Preencher

        System.out.println("\nComeçaremos por definir o tamanho do vetor: \n");

        int tamanho = input.nextInt();


        // Declarar vetor e variáveis
        int vetor[] = new int[tamanho];
        int opcao;


// Preencher vetor
        for (int linha = 0; linha < vetor.length; linha++) {
                System.out.println("Insira o valor [" + linha + "].");
                vetor[linha] = input.nextInt();
            }

        System.out.println("Valores inseridos:");

// Imprimir vetor
        for (int linha = 0; linha < vetor.length; linha++) {
                System.out.print(vetor[linha] + " - ");
        }

        do {
            System.out.println("\n\n\n----- Análise de Vetores -----");
            System.out.println("1. Maior Elemento");
            System.out.println("2. Menor Elemento");
            System.out.println("3. Somatório dos Elementos");
            System.out.println("4. Média dos Elementos");
            System.out.println("5. Crescente ou Não Crescente");
            System.out.println("6. Quantidade de Pares");
            System.out.println("7. Procurar um Valor");
            System.out.println("0. Sair\n");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            System.out.println("-----------------------------------------------");

            switch (opcao) {
                case 1:
                    System.out.println("Maior Elemento");

                    int maior = maiorElemento(vetor);
                    System.out.print("O Maior Elemento é: " + maior);

                    break;

                case 2:
                    System.out.println("Menor Elemento");

                    int menor = menorElemento(vetor);
                    System.out.print("O Menor Elemento é: " + menor);

                    break;

                case 3:
                    System.out.println("Somatório dos Elementos");

                    double metros;

                    System.out.print("Insira os metros: ");
                    metros = input.nextDouble();

                    System.out.println("Centímetros convertidos: " + " centímetros.");

                    break;

                case 4:
                    System.out.println("Média dos Elementos");

                    double cm;

                    System.out.print("Insira os metros: ");
                    cm = input.nextDouble();

                    System.out.println("Centímetros convertidos: " + " metros.");

                    break;

                case 5:
                    System.out.println("Crescente ou Não Crescente");

                    System.out.println("Escreva GBP, USD ou BRL para definir a moeda a ser convertida: \n");
                    String moedaDestino = input.next();

                    System.out.println("Defina a quantidade em moeda a ser convertida, separada por (,): \n");
                    double euros = input.nextDouble();

                    System.out.println(euros + " euros são convertidos em " + " " + moedaDestino);

                    break;

                case 6:
                    System.out.println("Quantidade de Pares");

                    System.out.println("Insira a quantidade de horas a converter em minutos em (int): ");
                    int horas = input.nextInt();

                    System.out.println(horas + " horas são " + " minutos.");

                    break;

                case 7:
                    System.out.println("Procurar um Valor");

                    System.out.println("Insira a quantidade de minutos a converter em horas em (int): ");
                    int minutos = input.nextInt();

                    System.out.println(minutos + " minutos são " + " segundos.");

                    break;
                case 0:
                    System.out.println("A encerrar o programa...\n");

                    break;

                default:
                    System.out.println("Opção não reconhecida: " + opcao);
            }

            limparConsola();

        } while (opcao != 0);


    }
}