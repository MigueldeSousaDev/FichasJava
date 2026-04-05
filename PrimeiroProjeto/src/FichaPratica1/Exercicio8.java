package FichaPratica1;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 8. Escreva um programa que calcule a duração (no formato hh:mm:ss) de um álbum musical com 5
        // canções. A duração de cada canção é lida em minutos e segundos.

        // Introduza minutos da música 1: 10 - Introduza segundos da música 1: 55
        // - Introduza minutos da música 2: 50 - Introduza segundos da música 2: 5
        // - Introduza minutos da música 3: 1 - Introduza segundos da música 3: 30
        // - Total  do Álbum: 1h 2m 30s


        // Ler Valores e Definir Variaveis

        int musica1m, musica1s, musica2m, musica2s, musica3m, musica3s, musica4m, musica4s, musica5m, musica5s, horastotal, minutostotal, segundostotal;

        System.out.println("Introduza os minutos da música 1:");
        musica1m = input.nextInt();
        System.out.println("Introduza os segundos da música 1:");
        musica1s = input.nextInt();


        System.out.println("Introduza os minutos da música 2:");
        musica2m = input.nextInt();
        System.out.println("Introduza os segundos da música 2:");
        musica2s = input.nextInt();


        System.out.println("Introduza os minutos da música 3:");
        musica3m = input.nextInt();
        System.out.println("Introduza os segundos da música 3:");
        musica3s = input.nextInt();


        System.out.println("Introduza os minutos da música 4:");
        musica4m = input.nextInt();
        System.out.println("Introduza os segundos da música 4:");
        musica4s = input.nextInt();


        System.out.println("Introduza os minutos da música 5:");
        musica5m = input.nextInt();
        System.out.println("Introduza os segundos da música 5:");
        musica5s = input.nextInt();

        segundostotal = (musica1m * 60 + musica1s) + (musica2m * 60 + musica2s) + (musica3m * 60 + musica3s) + (musica4m * 60 + musica4s) + (musica5m * 60 + musica5s);
        horastotal = segundostotal / 3600;
        int resto = segundostotal % 3600;

        minutostotal = resto / 60;
        segundostotal = resto % 60;


        System.out.println("Horas de Música:" + horastotal);
        System.out.println("Minutos de Música:" + minutostotal);
        System.out.println("Segundos de Música:" + segundostotal);

    }
}
