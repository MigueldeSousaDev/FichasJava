package FichaPratica7.Ex09;

import java.io.FileNotFoundException;

import static FichaPratica7.BibliotecaDeFicheiros.*;
import static FichaPratica7.Ex09.BibliotecaMenuMusica09.*;

public class Exercicio9 {

    public static void main(String[] args) throws FileNotFoundException {

        // Criação Matriz para ser Chamada
        String[][] matrizCompleta = lerFicheiroCriarMatriz("src\\Ficheiros\\FichaPratica07\\exercicio_09.csv", ",");

        menuOpcoes(matrizCompleta);





    }

}
