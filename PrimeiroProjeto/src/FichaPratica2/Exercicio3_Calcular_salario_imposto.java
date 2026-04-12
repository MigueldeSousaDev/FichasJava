package FichaPratica2;

import java.util.Scanner;

public class Exercicio3_Calcular_salario_imposto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //3. Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
        //a. Salário até 15.000€ inclusive paga taxa de 20%
        //b. Salário de 15.000€ a 20.000€ inclusive paga taxa de 30%
        //c. Salário de 20.000€ a 25.000€ inclusive paga taxa de 35%
        //d. Salário superior a 25.000€ paga taxa de 40%

        double salanual, sal20 = 0, sal30 = 0, sal35=0, sal40 = 0;

        System.out.println("Insira o seu salário anual:\n");
        salanual = input.nextDouble();

        if (salanual <= 15000) {
            sal20 = salanual * 0.20;
            System.out.println("O imposto que irás pagar é de " + sal20);
        }

        if (salanual >15000 && salanual <=20000) {
            sal30 = salanual * 0.30;
            System.out.println("O imposto que irás pagar é de " + sal30);
        }

        if (salanual >20000 && salanual <= 25000) {
            sal35 = salanual * 0.35;
            System.out.println("O imposto que irás pagar é de " + sal35);
        }

        if (salanual >25000) {
            sal40 = salanual * 0.40;
            System.out.println(" O imposto que irás pagar é de " + sal40);
        }

    }
}
