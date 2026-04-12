package FichaPratica2;

import java.util.Scanner;

public class Exercicio2_Calcular_taxa_salario {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
        // a. Salário até 15.000€ inclusive paga taxa de 20%
        // b. Salário superior a 15.000€ paga taxa de 30%

        double salarioanual = 0, salario20 = 0, salario30=0;

        System.out.println("Declare o seu salário anual:");
        salarioanual = input.nextInt();

        if (salarioanual > 15000) {
            salario30 = salarioanual * 0.30;
            System.out.println("O seu salário anual paga 30% e líquido é:\n" + salario30);
        } else {
            salario20 = salarioanual * 0.20;
            System.out.println("O seu salário anual paga 20% e líquido é:\n" + salario20);

        }


    }
}
