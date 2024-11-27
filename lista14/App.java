/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> listaDados = new ArrayList<>(); // lista para conter todas as listas de dados
        
        try {
            // pega o arquivo e faz o scanner dele para leitura
            File arquivo = new File("C:\\Users\\gabri\\Downloads\\L14_municipios.csv");
            Scanner arquivoScanner = new Scanner(arquivo, "UTF-8");
            
            // verifica se tem mais linhas do que só o cabeçalho
            if (arquivoScanner.hasNextLine()) {
                arquivoScanner.nextLine(); // pula o cabeçalho
            }
            
            while (arquivoScanner.hasNextLine()) {
                String linha = arquivoScanner.nextLine(); // pega a proxima linha com informações
                String[] informacoes = linha.split(";"); // separa a string onde tem ";" em listas
                
                ArrayList<String> listaLinhaDados = new ArrayList<>(); // lista com os dados
                for (String dado : informacoes) {
                    listaLinhaDados.add(dado.trim()); // adiciona na lista de dados
                }
                
                listaDados.add(listaLinhaDados); // adiciona na lista de informações (lista de listas)
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }
        
        String nomeCidadeMaiorPopulacao = "";
        int maiorPopulacao = Integer.MIN_VALUE;
        String nomeCidadeMenorPopulacao = "";
        int menorPopulacao = Integer.MAX_VALUE;
        
        for (ArrayList<String> linha : listaDados) {
            String nomeCidade = linha.get(1); // pega o nome da cidade
            int populacao = Integer.parseInt(linha.get(3)); // pega a quantidade de população

            if (populacao > maiorPopulacao) {
                maiorPopulacao = populacao;
                nomeCidadeMaiorPopulacao = nomeCidade;
            }
            
            if (populacao < menorPopulacao) {
                menorPopulacao = populacao;
                nomeCidadeMenorPopulacao = nomeCidade;
            }
        }

        System.out.println("Cidade com maior população\n" + nomeCidadeMaiorPopulacao + ": " + maiorPopulacao +"\n");
        System.out.println("Cidade com menor população\n" + nomeCidadeMenorPopulacao + ": " + menorPopulacao);

    }
    
}
