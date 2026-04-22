package FichaPratica6;

import java.util.Scanner;

public class BibliotecaCuriosidades {


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


//a) maiorDeIdade(int idade)
//A função deve retornar true se a pessoa for maior de idade ou false caso contrário.
//Considere que uma pessoa é maior de idade quando tem 18 ou mais anos.

    public static boolean maiorDeIdade(int idade) {
        boolean idadeUtilizador = false;
        if (idade >= 18) {
            idadeUtilizador = true;
        }

        return (idadeUtilizador);
    }


//    b) faseVida(int idade)
//    A função deve retornar uma String com a fase da vida correspondente, de acordo com os seguintes critérios:
//    0 a 12 anos → "Criança"
//    13 a 17 anos → "Adolescente"
//    18 a 64 anos → "Adulto"
//    65 ou mais anos → "Idoso"

    public static String faseVida(int idade) {
        String fase = "";

        if (idade <= 12) {
            fase = "Criança";
        }
        if (idade >= 13 && idade <= 17) {
            fase = "Adolescente";
        }
        if (idade >= 18 && idade <= 64) {
            fase = "Adulto";
        }
        if (idade >= 65) {
            fase = "Idoso";
        }

        return (fase);

    }


//    c) capitalPais(String pais)
//    A função deve retornar a capital do país indicado.
//    Considere apenas os seguintes países:
//    Portugal → Lisboa
//    Espanha → Madrid
//    França → Paris
//    Itália → Roma
//    Alemanha → Berlim
//    Caso o país não exista na lista, a função deve retornar "País não encontrado".

    public static String capitalPais(String pais) {
        String capital = "";

        if (pais.equals("Portugal")) {
            capital = "Lisboa";
        } else if (pais.equals("Espanha")) {
            capital = "Madrid";
        } else if (pais.equals("França")) {
            capital = "Paris";
        } else if (pais.equals("Itália")) {
            capital = "Roma";
        } else if (pais.equals("Alemanha")) {
            capital = "Berlim";
        } else {
            capital = "País não encontrado. Verifique se escreveu corretamente.";
        }

        return (capital);

    }

//    d) estacaoAno(int mes)
//    A função deve retornar uma String com a estação do ano correspondente ao mês inserido:
//    12, 1, 2 → "Inverno"
//    3, 4, 5 → "Primavera"
//    6, 7, 8 → "Verão"
//    9, 10, 11 → "Outono"
//    Caso o mês seja inválido, deve retornar "Mês inválido".

    public static String estacaoAno(int mes) {

        // DECLARAR VARIÁVEL
        String estacao = "";

        if ( (mes >=1 && mes <= 2) || mes == 12 ) {
            estacao = "Inverno";
        }
        if ( mes >= 3 && mes <= 5 ) {
            estacao = "Primavera";
        }
        if ( mes >= 6 && mes <= 8 ) {
            estacao = "Verão";
        }
        if (mes >= 9 && mes <= 11 ) {
            estacao = "Outono";
        } else {
            estacao = "Mês inválido.";
        }

        return (estacao);
    }



//    e) diaSemana(int dia)
//    A função deve retornar uma String correspondente ao número do dia da semana:
//1 → Segunda-feira
//2 → Terça-feira
//3 → Quarta-feira
//4 → Quinta-feira
//5 → Sexta-feira
//6 → Sábado
//7 → Domingo
//    Caso o número seja inválido, deve retornar "Dia inválido".


    public static String diaSemana(int mes) {

    String diasemana;

    if (diasemana == 1) {
        diasemana = "Segunda-Feira";
    }       else if (diasemana == 2 ) {
            diasemana = "Terça-Feira";
            } else if (diasemana == 3 ) {
                diasemana = "Quarta-Feira";
            } else if (diasemana == 4 ) {
                diasemana = "Quinta-Feira";
            } else if (diasemana == 5) {
                diasemana = "Sexta-Feira";
            } else if (diasemana == 6) {
                diasemana = "Sabado";
            } else if (diasemana == 7) {
                diasemana = "Domingo";
            }

        }

    return (diasemana);
    }



}