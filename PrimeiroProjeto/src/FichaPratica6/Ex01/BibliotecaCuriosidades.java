package FichaPratica6.Ex01;

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
        } else {
            return false;
        }

        return (idadeUtilizador);
    }

    // if (idade =>18) { return true; }


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

        if (pais.equalsIgnoreCase("Portugal")) {
            capital = "Lisboa";
        } else if (pais.equalsIgnoreCase("Espanha")) {
            capital = "Madrid";
        } else if (pais.equalsIgnoreCase("França")) {
            capital = "Paris";
        } else if (pais.equals("Itália")) {
            capital = "equalsIgnoreCase";
        } else if (pais.equalsIgnoreCase("Alemanha")) {
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

        if ((mes >= 1 && mes <= 2) || mes == 12) {
            estacao = "Inverno";
        }
        else if (mes >= 3 && mes <= 5) {
            estacao = "Primavera";
        }
        else if (mes >= 6 && mes <= 8) {
            estacao = "Verão";
        }
        else if (mes >= 9 && mes <= 11) {
            estacao = "Outono";
        } else {
            estacao = "Mês inválido.";
        }

        return estacao;
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


    public static String diaSemana(int dia) {

        String diastring ="";

        if (dia == 1) {
            diastring = "Segunda-Feira";
        } else if (dia == 2) {
            diastring = "Terça-Feira";
        } else if (dia == 3) {
            diastring = "Quarta-Feira";
        } else if (dia == 4) {
            diastring = "Quinta-Feira";
        } else if (dia == 5) {
            diastring = "Sexta-Feira";
        } else if (dia == 6) {
            diastring = "Sabado";
        } else if (dia == 7) {
            diastring = "Domingo";
        } else {
            System.out.println("Entrada inválida.");
        }
        return (diastring);
    }


//    f) tipoNumero(int num)
//    A função deve retornar uma String com a classificação do número:
//     "Positivo" se o número for maior que 0
//     "Negativo" se o número for menor que 0
//      "Zero" se o número for igual a 0

    public static String tipoNumero(int num) {

        /** Função que avalia se <b>número é maior, igual ou menor que 0</b> (o que faz a função)
         * num é o numero do input, retorna o resultado da função
          */

        String numString = "";
        if (num > 0) {
            numString = "Positivo.";
        } else if ( num < 0) {
            numString = "Negativo.";
        } else if (num == 0) {
            numString = "Zero.";
        } else {
            System.out.println("Entrada inválida.");
        }
                    return(numString);
    }


}






