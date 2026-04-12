package FichaPratica2.Exercicios_Complementares;

import java.util.Scanner;

public class ExercicioC3_Calcular_imposto_salario {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valor_prod, desc;

        System.out.println("Insira o valor do produto: ");
        valor_prod = input.nextDouble();


        if (valor_prod >= 100 ) {
            desc = valor_prod * 0.84;
            System.out.println("O valor do produto com desconto é: " + desc);

        } else {

            System.out.println("O valor do produto sem desconto é: " + valor_prod);
        }









    }
}
