package FichaPratica6.Ex04;

import java.util.Scanner;

import static FichaPratica6.Ex03.BibliotecaConversoes.*;

public class Exercicio4_Menu_Switch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {


            System.out.println("\n\n\n----- Assistente de Curiosidades -----");
            System.out.println("1. Temperaturas – Celsius p/ Fahrenheit");
            System.out.println("2. Temperaturas – Fahrenheit p/ Celsius");
            System.out.println("3. Sistema Métrico – Metros p/ Centímetros");
            System.out.println("4. Sistema Métrico – Centímetro p/ Metros");
            System.out.println("5. Moedas – EUR p/ outras Moedas");
            System.out.println("6. Tempo – Horas p/ Minutos");
            System.out.println("7. Tempo – Minutos p/ Segundos");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            System.out.println("-----------------------------------------------");

            switch (opcao) {
                case 1:
                    System.out.println("Temperaturas – Celsius p/ Fahrenheit");

                    double celsius;

                    System.out.print("Insira a temperatura em Celsius: ");
                    celsius = input.nextDouble();

                    // CHAMAR A FUNÇÃO
                    System.out.println("Temperatura em Fahrenheit: " + celsiusParaFahrenheit(celsius));

                    break;

                case 2:
                    System.out.println("Temperaturas – Fahrenheit p/ Celsius");

                    double fahrenheit;

                    System.out.print("Insira a temperatura em Fahrenheit: ");
                    fahrenheit = input.nextInt();

                    System.out.println("Temperatura em Celsius: " + fahrenheitParaCelsius(fahrenheit));

                    break;

                case 3:
                    System.out.println("Sistema Métrico – Metros p/ Centímetros");

                    double metros;

                    System.out.print("Insira os metros: ");
                    metros = input.nextDouble();

                    System.out.println("Centímetros convertidos: " + metrosParaCentimetros(metros) + " centímetros.");

                    break;

                case 4:
                    System.out.println("Sistema Métrico – Centímetro p/ Metros");

                double cm;

                System.out.print("Insira os metros: ");
                cm = input.nextDouble();

                System.out.println("Centímetros convertidos: " + centimetrosParaMetros(cm) + " metros.");

                    break;

                case 5:
                    System.out.println("Moedas – EUR p/ outras Moedas");

                    System.out.println("Escreva GBP, USD ou BRL para definir a moeda a ser convertida: \n");
                    String moedaDestino = input.next();

                    System.out.println("Defina a quantidade em moeda a ser convertida, separada por (,): \n");
                    double euros = input.nextDouble();

                    System.out.println( euros + " euros são convertidos em " + converterEuros(euros, moedaDestino) + " " + moedaDestino);

                    break;

                case 6:
                    System.out.println("Tempo – Horas p/ Minutos");

                    System.out.println("Insira a quantidade de horas a converter em minutos em (int): ");
                    int horas = input.nextInt();

                    System.out.println(horas + " horas são " + horasParaMinutos(horas) + " minutos.");

                    break;

                case 7:
                    System.out.println("Tempo – Minutos p/ Segundos");

                    System.out.println("Insira a quantidade de minutos a converter em horas em (int): ");
                    int minutos = input.nextInt();

                    System.out.println(minutos + " minutos são " + minutosParaSegundos(minutos) + " segundos.");

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



//                case 1:
//                    System.out.println("Temperaturas – Celsius p/ Fahrenheit");
//
//                    double celsius;
//
//                    System.out.print("Insira a temperatura em Celsius: ");
//                    celsius = input.nextDouble();
//
//                    if (celsiusParaFahrenheit(celsius)) {
//                        System.out.println("Temperatura em Celsius: " + celsius);
//                    } else {
//                        System.out.println("Entrada errada.");
//                    }
//                    // CHAMAR A FUNÇÃO
//
//                    break;