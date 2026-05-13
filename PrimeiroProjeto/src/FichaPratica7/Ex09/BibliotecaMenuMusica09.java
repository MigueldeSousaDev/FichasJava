package FichaPratica7.Ex09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica6_Menus_E_Funcoes_Vetor_Matriz.Ex09.BibliotecaMatrizes.*;
import static FichaPratica7.BibliotecaDeFicheiros.*;

public class BibliotecaMenuMusica09 {

    // EXERCICIO 9.

// 1. Ficheiro Main vai Invocar a FUNÇÃO Menu.
// 2. Menu pede prompt User e dependendo da OPÇÃO > Chama FUNÇÃO.
// 3. Criar cada Função para cada Menu.
// 4. Auxiliar: Criar/Verificar Função que lê ficheiro e transforma em Matriz.

    public static void menuOpcoes(String[][]matrizCompleta) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Pesquisar Género Musical");
            System.out.println("2. Pesquisar por Nome de Artista");
            System.out.println("3. Pesquisar Música com Maior Duração");
            System.out.println("4. Pesquisar Música com Duração Maior que um valor especificado");
            System.out.println("5. Verificar Número de Músicas no Ficheiro");
            System.out.println("0. Sair");

            System.out.print("Escolha: ");
            opcao = input.nextInt();

            input.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Género Musical a pesquisar: ");
                    String generoPesquisar = input.nextLine();
                    pesquisarMusicasPorGenero(matrizCompleta,generoPesquisar);
                    // Chamar Função
                    break;
                case 2:
                    System.out.println("Nome do Artista a pesquisar: ");
                    String artistaPesquisar = input.nextLine();
                    pesquisarMusicasPorArtista(matrizCompleta,artistaPesquisar);
                    // Chamar Função
                    break;
                case 3:
                    System.out.println("Pesquisar Música com Maior Duração: ");
                    musicaMaiorDuracao(matrizCompleta);
                    // Chamar Função
                    break;
                case 4:
                    System.out.println(" Pesquisar Músicas com Duração acima de (segundos): ");
                    int duracaoIndicada = input.nextInt();
                    musicasDuracaoIndicada(matrizCompleta, duracaoIndicada);
                    // Chamar Função
                    break;
                case 5:
                    System.out.println("Número de Músicas no ficheiro: ");
                    String caminho =("src\\Ficheiros\\FichaPratica07\\exercicio_09.csv");
                    contarMusicasFicheiro(caminho);
                    // Chamar Função
                    // Leio através do scanner de linha ao invés de usar a Matriz na pesquisa.

                    break;
                case 0:
                    System.out.print("Opção 0 selecionada. A sair do programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Insira novamente o valor.");
            }
            limparConsola();
        } while (opcao != 0);
    }


// ---------------------------------------------------------------------------------
    // Funções relacionadas que estão dentro do Menu:

    // Função de Ler e Criar Matriz

    public static String[][] lerFicheiroCriarMatriz(String CaminhoFicheiro, String delimitador) throws FileNotFoundException {

        File AbrirFicheiro = new File(CaminhoFicheiro);
        Scanner scannerDeLinha = new Scanner(AbrirFicheiro);

        int contadorLinhas = 0;

        // Ignorar cabeçalho
        scannerDeLinha.nextLine();

        // 1. CONTAR LINHAS do Ficheiro para a Matriz mais tarde
        while (scannerDeLinha.hasNextLine()) {
            scannerDeLinha.nextLine();
            contadorLinhas++;
        }

        scannerDeLinha.close();

        // Reabrir ficheiro para leitura
        scannerDeLinha = new Scanner(AbrirFicheiro);

        // Ignorar cabeçalho novamente
        scannerDeLinha.nextLine();

        // 2. Transformar Linhas em Vetor (com delimitador)
        String primeiraLinha = scannerDeLinha.nextLine();
        String[] itemsLinha = primeiraLinha.split(delimitador);

        // 3. Tamanho das Colunas para Matriz
        int contadorColunas = itemsLinha.length;

        // voltar a abrir para leitura completa
        scannerDeLinha.close();
        scannerDeLinha = new Scanner(AbrirFicheiro);

        // ignorar cabeçalho outra vez
        scannerDeLinha.nextLine();

        // 4. Criar Matriz com Tamanho da Linha + Coluna (SÓ FAÇO PARSE POSTERIORMENTE NAS FUNÇÕES SEGUINTES)
        String[][] matrizCompleta = new String[contadorLinhas][contadorColunas];

        // 5. Preencher a Matriz (Atribuir valores lidos)

        int linhaAtualMatriz = 0;

        while (scannerDeLinha.hasNextLine()) {

            String linha = scannerDeLinha.nextLine();

            String[] linhaSeparada = linha.split(delimitador); // Cria Vetor com 4 posições a cada linha
            //String linhaSeparada = [0, 1, 2, 3]

            // o "i" incrementa as linhas e colunas. Definida para 0 acima.
            for (int i = 0; i < contadorColunas; i++) {
                matrizCompleta[linhaAtualMatriz][i] = linhaSeparada[i];

                //            matrizCompleta[linhaAtualMatriz][0] = linhaSeparada[0];
                //            matrizCompleta[linhaAtualMatriz][1] = linhaSeparada[1];
                //            matrizCompleta[linhaAtualMatriz][2] = linhaSeparada[2];
                //            matrizCompleta[linhaAtualMatriz][3] = linhaSeparada[3];

                //  FOR > linhaAtualMatriz mantém sempre o 0 neste ciclo; Atribuí o valor do conteúdo
                //  no Vetor linhaSeparada[i] à posição 2 (i) da matriz [_][i]. Ao mesmo tempo que incrementa o valor de i
                //  tanto no Vetor como na Matriz, passa o valor para a Matriz.

            }

            linhaAtualMatriz++;
        }

        scannerDeLinha.close();

        return matrizCompleta;
    }


// ----------------------------------------------------------------------------------------------------------------------

    public static void pesquisarMusicasPorGenero(String[][] matrizCompleta, String generoPesquisar) {

        for (int linha = 0; linha < matrizCompleta.length; linha++) {
            if (matrizCompleta[linha][2].equalsIgnoreCase(generoPesquisar)) {
                System.out.println(matrizCompleta[linha][0] + "||" + matrizCompleta[linha][1]);
            }
        }
    }

// ----------------------------------------------------------------------------------------------------------------------

    public static void pesquisarMusicasPorArtista(String[][] matrizCompleta, String artistaPesquisar) {

        for (int linha = 0; linha < matrizCompleta.length; linha++) {
            if (matrizCompleta[linha][1].equalsIgnoreCase(artistaPesquisar)) {
                System.out.println(matrizCompleta[linha][0] + "||" + matrizCompleta[linha][1]);
            }
        }
    }


// ----------------------------------------------------------------------------------------------------------------------

    // Converter segundos e minutos
    // em vez de reutilizar variáveis, usar diretamente o parse para dividir em 2 vetores

    public static int converterDuracaoParaSegundos(String duracao) {

    String[] partes = duracao.split(":");
    int minutos = Integer.parseInt(partes[0]);
    int segundos = Integer.parseInt(partes[1]);

    return minutos * 60 + segundos;

    }
// ----------------------------------------------------------------------------------------------------------------------

    public static void musicaMaiorDuracao(String[][] matrizCompleta) {

    int maior = 0;
    int indiceMaior = 0;

        for (int linha = 0; linha < matrizCompleta.length; linha++) {

            int duracaoSegundos = converterDuracaoParaSegundos(matrizCompleta[linha][3]);

            if (duracaoSegundos > maior) {
                maior = duracaoSegundos;
                indiceMaior = linha;
            }
        }
            System.out.println(matrizCompleta[indiceMaior][0] + " || " + matrizCompleta[indiceMaior][3]);
    }

// ----------------------------------------------------------------------------------------------------------------------



    public static void musicasDuracaoIndicada (String[][] matrizCompleta, int duracaoIndicada) {

        int indiceMaior = 0;

        for (int linha = 0 ; linha < matrizCompleta.length; linha++) {

            int duracaoSegundos = converterDuracaoParaSegundos(matrizCompleta[linha][3]);


            if (duracaoSegundos>duracaoIndicada) {
                indiceMaior = linha;
                System.out.println(matrizCompleta[indiceMaior][0] + " || " + matrizCompleta[indiceMaior][3]);
            }

        }

    }

// ------------------------------------------------------------------------------------------------------------------------

    public static void contarMusicasFicheiro (String CaminhoFicheiro) throws FileNotFoundException {

        File AbrirFicheiro = new File(CaminhoFicheiro);
        Scanner scannerDeLinha = new Scanner(AbrirFicheiro);

        scannerDeLinha.nextLine(); // Avançar cabeçalho

        int linhasDeMusica = 0;
        while (scannerDeLinha.hasNextLine()) {
            scannerDeLinha.nextLine();
            linhasDeMusica++;
        }
        scannerDeLinha.close();  // ✅ Fechar o scanner (boa prática)
        System.out.println("O ficheiro contém " + linhasDeMusica + " músicas.");

        }





}


