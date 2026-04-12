package FichaPratica2;

import java.util.Scanner;

public class Exercicio17_Saldo_Medio_Credito {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double saldo, credito;

        System.out.println("Insira o seu Saldo Médio do último ano: ");
        saldo = input.nextDouble();

        if (saldo <= 2000) {
            System.out.println("Sem condições de acesso ao crédito");
        }
        else if (saldo <= 4000) {
            credito =  saldo * 0.20;
            System.out.println("O valor de crédito concedido é de: " + credito);
        }
        else if (saldo <= 6000) {
            credito =  saldo * 0.30;
            System.out.println("O valor de crédito concedido é de: " + credito);
        }
        else if (saldo >= 6000) {
            credito =  saldo * 0.40;
            System.out.println("O valor de crédito concedido é de: " + credito);
        }



    }
}
