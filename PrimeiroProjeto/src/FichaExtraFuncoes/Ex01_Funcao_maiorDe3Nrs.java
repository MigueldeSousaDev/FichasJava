package FichaExtraFuncoes;

import java.util.Scanner;

import static FichaExtraFuncoes.BibliotecaFichaExtraFuncoes.*;

public class Ex01_Funcao_maiorDe3Nrs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3, menor;
        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();
        System.out.print("Introduza um numero: ");
        num2 = input.nextInt();
        System.out.print("Introduza um numero: ");
        num3 = input.nextInt();

        menor = numeroMaisPequeno(num1, num2, num3);
        System.out.print("Menor: " + menor);

    }



        }
