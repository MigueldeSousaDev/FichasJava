package FichaPratica2;

import java.util.Scanner;

public class Exercicio4_switch_opcoes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //4. Na fórmula 1, os pontos no final de cada corrida são atribuidos da seguinte forma:
        //a. 1º Lugar: 10 pontos
        //b. 2º Lugar: 8 pontos
        //c. 3º Lugar: 6 pontos
        //d. 4º Lugar: 5 pontos
        //e. 5º Lugar: 4 pontos
        //f. 6º Lugar: 3 pontos
        //g. 7º Lugar: 2 pontos
        //h. 8º Lugar: 1 ponto

        //Escreva um programa que leia o lugar em que o piloto terminou e escreva quantos pontos ganhou.
        //Exemplos de execução: - Introduza o seu lugar na corrida: 2 - Ganhou 8 pontos - Introduza o seu lugar na corrida: 10 - Não ganhou pontos


        int lugar;

        System.out.println("Introduza o seu lugar na corrida: ");
        lugar = input.nextInt();

        if (lugar ==1) {
            System.out.println(" Ganhou 10 pontos");
        }
        if (lugar ==2) {
            System.out.println(" Ganhou 8 pontos");
        }
        if (lugar ==3) {
            System.out.println(" Ganhou 6 pontos");
        }
        if (lugar ==4) {
            System.out.println(" Ganhou 5 pontos");
        }
        if (lugar ==5) {
            System.out.println(" Ganhou 4 pontos");
        }
        if (lugar ==6) {
            System.out.println(" Ganhou 3 pontos");
        }
        if (lugar ==7) {
            System.out.println(" Ganhou 2 pontos");
        }
        if (lugar ==8) {
            System.out.println(" Ganhou 1 pontos");
        } else {
            System.out.println(" Não ganhou pontos");
        }





    }
}


// SOLUÇÃO ALTERNATIVA COM "CASE"

//int lugar;
//
//System.out.print("Introduza o seu lugar na corrida: ");
//lugar= input.nextInt();
//
//switch (lugar){
//    case 1: {
//        System.out.print("Ganhou 10 pontos");
//        break;}
//    case 2: {
//        System.out.print("Ganhou 8 pontos");
//        break;}
//    case 3: {
//        System.out.print("Ganhou 6 pontos");
//        break;}
//    case 4: {
//        System.out.print("Ganhou 5 pontos");
//        break;}
//    case 5: {
//        System.out.print("Ganhou 4 pontos");
//        break;}
//    case 6: {
//        System.out.print("Ganhou 3 pontos");
//        break;}
//    case 7: {
//        System.out.print("Ganhou 2 pontos");
//        break;}
//    case 8: {
//        System.out.print("Ganhou 1 pontos");
//        break;}
//    default: {
//        System.out.print("Não ganhou pontos");
//        break;}
//    }