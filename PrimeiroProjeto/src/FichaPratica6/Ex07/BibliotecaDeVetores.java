package FichaPratica6.Ex07;

import java.util.Scanner;

public class BibliotecaDeVetores {

    // Import do Scanner
    Scanner input = new Scanner(System.in);

// ---------------------------------------------------------------------------

    public static void limparConsola() {

        // Import do Scanner
        Scanner input_ = new Scanner(System.in);

        // Limpar a consola
        System.out.println("\n(Prima enter p/ voltar)");
        input_.nextLine(); // Apanhar com o enter que vem do ultimo input
        input_.nextLine(); // Vai esperar pelo nosso enter
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

// -------------------------------------------------------------------------------------

//  a) maiorElemento(int[ ] vetor)
//  Retorna o maior valor existente no vetor.

    public static int maiorElemento(int[] vetor) {

        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

// -------------------------------------------------------------------------------------


//    b) menorElemento(int[ ] vetor)
//    Retorna o menor valor existente no vetor.

    public static int menorElemento(int[] vetor) {

        int menor = vetor[0];


        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

// ----------------------------------------------------------------------------

// c) somatorio(int[ ] vetor)
//  Retorna a soma de todos os elementos do vetor.

    public static int somatorio(int[] vetor) {
        int somatorio = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            somatorio += vetor[i];
        }
        return somatorio;
    }



}
