package FichaExtraFuncoes;

import java.util.Scanner;

public class BibliotecaFichaExtraFuncoes {

    // Import do Scanner
    Scanner input_ = new Scanner(System.in);

    public static int numeroMaisPequeno(int num1, int num2, int num3) {

        int menor = 0;

        if (num1 < num2 && num1 < num3) {
            menor = num1;
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
        } else if (num3 < num1 && num3 < num2) {
            menor = num3;
        }
    return menor;
    }
}