package FichaPratica6.Ex03;

import java.util.Scanner;

public class BibliotecaConversoes {

    public static void limparConsola() {

        // Import do Scanner
        Scanner input_ = new Scanner(System.in);

        // Limpar a consola
        System.out.println("(Prima enter p/ voltar)");
        input_.nextLine(); // Apanhar com o enter que vem do ultimo input
        input_.nextLine(); // Vai esperar pelo nosso enter
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }


// ------------------------------------------------

    /** @celsius Usuário define o valor
     * @fahrenheit é Variável guardada e convertida em Fahrenheit
     * @return Fahrenheit após conversão de Celsius > Fahrenheit
     */
    public static double celsiusParaFahrenheit(double celsius) {

//  a) celsiusParaFahrenheit(double celsius)
//  Retorna o valor correspondente em graus Fahrenheit. Celsius = (Fahrenheit - 32) / 1.8

        double fahrenheit;
        fahrenheit = (celsius * 1.8) + 32;

        return fahrenheit;
    }

// --------------------------------------------------

    /**
     *
     * @param fahrenheit > input do user em Fahrenheit
     * @fahrenheitParaCelsius recebe Fº e converte em Cº
     * @return celsius
     */

    public static double fahrenheitParaCelsius(double fahrenheit) {

// b) fahrenheitParaCelsius(double fahrenheit)
// Retorna o valor correspondente em graus Celsius. Fahrenheit = (Celsius * 1.8) + 32

        double celsius;
        celsius = (fahrenheit - 32) / 1.8 ;
        return celsius;
    }


// ---------------------------------------------------------
    /**
     * @param metros > input do user que vai ser convertido em <b>centímetros</b>
     * @return centímetros
     */

    public static double metrosParaCentimetros(double metros) {
// c) metrosParaCentimetros(double metros)
// Retorna o valor correspondente em centímetros.

        double centimetros;
        centimetros = metros * 100;
        return centimetros;
    }
// ----------------------------------------------------------------------------

    /**
     *
     * @metros é recebido e converte em <b>centímetros</b>
     * @return cm (centímetros)
     */
    public static double centimetrosParaMetros(double cm) {

//d) centimetrosParaMetros(double cm)
//Retorna o valor correspondente em metros.

    double metros;
    metros = cm / 100;
    return metros;
    }
//------------------------------------------------------------------------------

    /**
     *
     * @param euros > inserido por user <b>QUANTIDADE</b>
     * @param moedaDestino > inserido por user <b>TIPO DE MOEDA</b>
     * @return variáveis: <b>gbp, usd ou brl em valor "double" já convertidos</b>
     */

    public static double converterEuros(double euros, String moedaDestino) {
//  e) converterEuros(double euros, String moedaDestino)
//  Retorna o valor convertido de euros para outra moeda.
//  Considere, por exemplo, as seguintes moedas de destino: USD, GBP e BRL.
//  As taxas de conversão devem ser definidas no programa.

    double gbp = euros * 0.87;
    double usd = euros * 1.17;
    double brl = euros * 5.87;

    if (moedaDestino.equals("GBP")) {
        return gbp;
    } else if (moedaDestino.equals("USD")) {
        return usd;
    } else if (moedaDestino.equals("BRL")) {
        return brl;
    } else {
        return 0;
    }
    }

// -------------------------------------------------------------------

    /**
     * @param horas > enviado pelo USER
     * @return minutos > convertidos de HORAS para MINUTOS
     */

public static int horasParaMinutos(int horas) {
//  g) horasParaMinutos(int horas)
//  Retorna o número total de minutos correspondente.

    int minutos = horas * 60;
    return minutos;
}

// ---------------------------------------------------------
    /**
     * @param minutos > enviado pelo USER
     * @return segundos > convertidos de MINUTOS para SEGUNDOS
     */

public static int minutosParaSegundos(int minutos) {
//  h) minutosParaSegundos(int minutos)
//  Retorna o número total de segundos correspondente.

    int segundos = minutos * 60;
    return segundos;

}


}
