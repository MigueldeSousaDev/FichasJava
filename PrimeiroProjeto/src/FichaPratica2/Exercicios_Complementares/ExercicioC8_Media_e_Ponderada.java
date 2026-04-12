package FichaPratica2.Exercicios_Complementares;

import java.util.Scanner;

public class ExercicioC8_Media_e_Ponderada {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota_a, nota_b, nota_c;
        double media, p_a, p_b, p_c;

        System.out.println("Digite o valor da nota A: ");
        nota_a = input.nextDouble();
        System.out.println("Digite o valor da nota B: ");
        nota_b = input.nextDouble();
        System.out.println("Digite o valor da nota C: ");
        nota_c = input.nextDouble();

        // 1. Ler Valores | 2. Calcular média | 3. Ponderar valores por % | 4. Apresentar Resultados

        media = (nota_a + nota_b + nota_c) / 3;

        p_a = nota_a * 0.25;
        p_b = nota_b * 0.35;
        p_c = nota_c * 0.40;

        System.out.println("A média ponderada A é: " + p_a);
        System.out.println("A média ponderada B é: " + p_b);
        System.out.println("A média ponderada C é: " + p_c);
        System.out.println("A média NÃO PONDERADA TOTAL é: " + media);


    }
}
