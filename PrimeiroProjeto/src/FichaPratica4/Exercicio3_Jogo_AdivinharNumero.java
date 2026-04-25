package FichaPratica4;

import java.util.Scanner;

public class Exercicio3_Jogo_AdivinharNumero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int valor1, valor2, contador = 0;

        System.out.println("JOGADOR 1: Insira o valor que deverá ser acertado pelo jogador 2: \n");
        valor1 = input.nextInt();

        do {

            System.out.println("Jogador 2: Insira um valor entre 0 e 100.");
            valor2 = input.nextInt();
            contador++;

            if (valor2 != valor1){
                System.out.println("Falhaste! Tenta outra vez!");
            }

        } while (valor1 != valor2);

        System.out.println("Parabéns! Acertou no número!");


    }
}
