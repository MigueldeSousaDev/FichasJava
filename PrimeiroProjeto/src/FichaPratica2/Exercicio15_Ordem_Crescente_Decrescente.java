import java.util.Scanner;

public class Exercicio15_Ordem_Crescente_Decrescente {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, n3, temp;
        String ex;

        System.out.println("Digite o primeiro valor: ");
        n1 = input.nextInt();

        System.out.println("Digite o segundo valor: ");
        n2 = input.nextInt();

        System.out.println("Digite o terceiro valor: ");
        n3 = input.nextInt();

        System.out.println("Pretende ordenar os números por ordem Crescente ou Decrescente?\nA > Crescente\nB > Decrescente");
        ex = input.next();

        if (ex.equalsIgnoreCase("A")) {  // Crescente
            if (n1 > n2) {
                temp = n1;
                n1 = n2;
                n2 = temp;
            }
            if (n1 > n3) {
                temp = n1;
                n1 = n3;
                n3 = temp;
            }
            if (n2 > n3) {
                temp = n2;
                n2 = n3;
                n3 = temp;
            }

            System.out.println("A ordem crescente é: " + n1 + "<" + n2 + "<" + n3);

        } else if (ex.equalsIgnoreCase("B")) { // Decrescente
            if (n1 < n2) {
                temp = n1;
                n1 = n2;
                n2 = temp;
            }
            if (n1 < n3) {
                temp = n1;
                n1 = n3;
                n3 = temp;
            }
            if (n2 < n3) {
                temp = n2;
                n2 = n3;
                n3 = temp;
            }

            System.out.println("A ordem decrescente é: " + n1 + ">" + n2 + ">" + n3);

        } else {
            System.out.println("Opção inválida!");
        }
    }
}
