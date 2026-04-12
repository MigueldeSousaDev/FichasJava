package FichaPratica2;

import java.util.Scanner;

public class Exercicio8_Calcular_media {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    // 8. Escreva um programa que leia três notas (0-20 valores) de um aluno, calcule a sua média final ponderada, e diga
    // se está aprovado ou não (mais de 9.5). Ponderações: Nota 1: 25%; Nota 2: 35%; Nota 3:40%

    double nota1, nota2, nota3, mediap;

        System.out.println("Insira a sua nota na disciplina A: ");
        nota1 = input.nextDouble();

        System.out.println("Insira a sua nota na disciplina B: ");
        nota2 = input.nextDouble();

        System.out.println("Insira a sua nota na disciplina C: ");
        nota3 = input.nextDouble();

        mediap = (nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5);
        System.out.println("A sua média ponderada é: " + mediap);

        if (mediap >= 9.5) {
            System.out.println("Está aprovado no curso.");
        } else {
            System.out.println("Está reprovado no curso.");
        }


    }
}

//mediaponderada = (numero1 * 0.2) + (numero2 * 0.3) + (numero3 * 0.5);
        //System.out.print("A média ponderada é:" + mediaponderada);