package FichaPratica2;

import java.util.Scanner;

public class Exercicio11_Saldo_Bancario {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    // 11. Implemente um programa que, após pedir ao utilizador o saldo da conta bancária e montante a creditar/debitar
    // (montante positivo ou negativo, respetivamente), apresente se a operação é válida, ou seja, se o saldo final se
    // mantém positivo depois da operação. Finalmente, mostre o novo saldo.

    // Exemplos de execução: - Introduza saldo médio: 1000
    // - Introduza valor a movimentar: 800 - Saldo Atual: 180 - Introduza saldo médio: 1500
    // - Introduza valor a movimentar: -1100 - Saldo Atual: 400 - Introduza saldo médio: 600
    // - Introduza valor a movimentar: -1800 - Operação Inválida.
    // Saldo Insuficiente. - Saldo Atual: 600


        double saldomedio =0 , saldoatual =0, valormovimentar =0;

        System.out.println("Insira o saldo médio da sua conta bancária: "  );
        saldomedio = input.nextDouble();

        System.out.println("Introduza o valor a movimentar: " );
        valormovimentar = input.nextDouble();

        saldoatual = saldomedio + valormovimentar;


        if (saldoatual <=0 ) {
            System.out.println("A sua operação vai deixar a sua conta com Saldo Negativo. Valor: " +saldoatual);
        } else {
            System.out.println("O seu saldo atual (positivo) é:" + saldoatual );
        }








    }
}
