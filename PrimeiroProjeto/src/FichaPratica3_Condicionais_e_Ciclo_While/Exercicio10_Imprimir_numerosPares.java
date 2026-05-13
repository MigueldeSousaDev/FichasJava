package FichaPratica3_Condicionais_e_Ciclo_While;

import java.util.Scanner;

public class Exercicio10_Imprimir_numerosPares {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double prompt, inicio = 2, fim, contador = 0;


        System.out.println("Introduza um valor.");
        prompt = input.nextDouble();

        contador = inicio;

        while ( contador <= prompt ) {
            System.out.println(contador);
            contador += 2;
        }



    }
}
