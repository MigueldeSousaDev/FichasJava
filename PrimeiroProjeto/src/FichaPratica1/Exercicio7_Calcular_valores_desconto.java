package FichaPratica1;

import java.util.Scanner;

public class Exercicio7_Calcular_valores_desconto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // 7. Escreva um programa que requisite ao utilizador o preço de 3 produtos adquiridos. Apresente o valor
        //  a pagar, considerando que deverá ter um desconto de 10% sobre o total dos produtos.

        // Ler preço de 3 produtos (variaveis)

        double prod1, prod2, prod3, valortotal, valorcdesconto;

        System.out.println("Qual o preço do produto 1?: ");
        prod1 = input.nextDouble();

        System.out.println("Qual o preço do produto 2?:");
        prod2 = input.nextDouble();

        System.out.println("Qual o preço do produto 3 ?:");
        prod3 = input.nextDouble();


        // Apresentar valores totais e com desconto

        valortotal = prod1 + prod2 + prod3;

        valorcdesconto = valortotal * 0.9;
        System.out.println("O valor com desconto aplicado é:" + valorcdesconto);


    }
}
