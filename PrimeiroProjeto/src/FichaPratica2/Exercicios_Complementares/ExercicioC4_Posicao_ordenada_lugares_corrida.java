package FichaPratica2.Exercicios_Complementares;

import java.util.Scanner;

public class ExercicioC4_Posicao_ordenada_lugares_corrida {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String texto;

        System.out.println("Insira uma letra do alfabeto: ");
        texto = input.next();

        if (texto.equals("a") || texto.equals("e") || texto.equals("i") || texto.equals("o") || texto.equals("u") ) {
            System.out.println("Inseriu uma Vogal = " + texto);

        }

        else {

            System.out.println("Inseriu uma Consoante = " + texto);
        }






    }
}
