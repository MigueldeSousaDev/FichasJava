package FichaPratica7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class BibliotecaDeFicheiros {


    //Ex-1
    public static void imprimirFicheiroNaConsola (String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner meuScannerFic = new Scanner(ficheiro);

        while(meuScannerFic.hasNextLine()){
            String linha = meuScannerFic.nextLine();
            System.out.println(linha);
        }
    }

    //Ex-2
    public static void criarFicheiroEscrever () throws FileNotFoundException {

        String fileContent = "Hello! Adoro programar em Java!";

        //Criar ou Abrir o Ficheiro
        File ficheiroArmando = new File("C:\\Users\\swd14\\OneDrive - CESAE\\Ambiente de Trabalho\\Professor Vitor\\FichasJava\\Ficheiros\\FichaPratica07\\exercicio_02.txt");

        // Propósito: ler (Scanner) ou escrever (PrintWriter)
        PrintWriter maquinaEscrever = new PrintWriter(ficheiroArmando);

        maquinaEscrever.println(fileContent);
        maquinaEscrever.println("É a minha UFCD favorita. Ficheiro que criei para o exercicio 2.");

        maquinaEscrever.close();

    }

    //Ex-3
    public static void lerECopiarFicheiro () throws FileNotFoundException {

        // Abrir Ficheiro
        File ficheiroOriginal = new File("C:\\Users\\User\\Desktop\\OneDrive - CESAE\\Ambiente de Trabalho\\Professor Vitor\\FichasJava\\PrimeiroProjeto\\src\\Ficheiros\\FichaPratica07\\exercicio_03.txt");

        // Criar Ficheiro Cópia
        File ficheiroCopia = new File ("C:\\Users\\User\\Desktop\\OneDrive - CESAE\\Ambiente de Trabalho\\Professor Vitor\\FichasJava\\PrimeiroProjeto\\src\\Ficheiros\\FichaPratica07\\exercicio_03_copia.txt");


        // Ler ou Escrever ficheiro (scanner vs printwriter)
        Scanner scannerFicheiroOriginal = new Scanner(ficheiroOriginal);
        PrintWriter maquinaEscrever = new PrintWriter(ficheiroCopia);

        while (scannerFicheiroOriginal.hasNextLine()) {
            String linha = scannerFicheiroOriginal.nextLine();

            maquinaEscrever.println(linha);
        }

        scannerFicheiroOriginal.close();
        maquinaEscrever.close();

    }


    // Ex-4 > Ler ficheiro e imprimir na consola IDE

    public static void lerEImprimirIDE() throws FileNotFoundException {

            // Abrir OEM
            File csvFileOriginal = new File("C:\\Users\\User\\Desktop\\OneDrive - CESAE\\Ambiente de Trabalho\\Professor Vitor\\FichasJava\\PrimeiroProjeto\\src\\Ficheiros\\FichaPratica07\\exercicio_04.csv");

            // Importar scanner

            Scanner scannertuga = new Scanner(csvFileOriginal);

            while (scannertuga.hasNextLine()) {
                String linha = scannertuga.nextLine();

                System.out.println(linha);
            }
        }



    // --------------------------------------------------------------------------
    // Ex.5

    public static void lerStringNumeros() throws FileNotFoundException {

        // 1. Abrir ficheiro e ler com Scanner
        // 2. Split dos numeros (verificr se necessário integer.parse

        /**@linha - Recebe toda a linha do ficheiro (no ciclo)
         * @itemsLinha - Criamos como Vetor de Strings vazio e atribuimos o conteúdo de "linha", mas separado por espaço. O espaço é usado como delimitador do vetor.
         * @numero por fim usamos o ParseInt para cada posição do Vetor e executar cálculo.
         */


        // Abrir Ficheiro
        File AbrirFicheiro = new File("C:\\Users\\User\\Desktop\\OneDrive - CESAE\\Ambiente de Trabalho\\Professor Vitor\\FichasJava\\PrimeiroProjeto\\src\\Ficheiros\\FichaPratica07\\exercicio_05_31.txt");

        // Para ler o Ficheiro
        Scanner scannerDeLinha = new Scanner(AbrirFicheiro);

        // Cria uma Variável para dar print. String >
        int soma = 0;

        while (scannerDeLinha.hasNextLine()) {
            String linha = scannerDeLinha.nextLine();
            String[] itemsLinha = linha.split(" ");

            for (int i = 0; i < itemsLinha.length; i++) {
                int numero = Integer.parseInt(itemsLinha[i]);
                soma += numero;

            }
        }
        System.out.println("Soma: " + soma);

    }



}


