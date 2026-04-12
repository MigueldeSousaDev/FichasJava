package FichaPratica2.Exercicios_Complementares;

import java.util.Scanner;

public class ExercicioC2_Imposto_Salario_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        double peso;

        System.out.println("Insira o seu peso: ");
        peso = input.nextDouble();

        if (peso >= 0 ) { peso = peso * 0.16; }

        System.out.println("Peso: " + peso);



    }
}
