package FichaPratica3;

import java.util.Scanner;

public class Exercicio11_Variavel_Salto_Variavel_Limite {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        int limite = 0, salto = 0, contador = 0 ;

        System.out.println("Insere um valor de limite: ");
        limite = input.nextInt();

        System.out.println("Insere um valor de salto: ");
        salto = input.nextInt();

        while ( contador < limite ) {
            contador = contador + salto;
            System.out.println(contador);

        }


    }
}
