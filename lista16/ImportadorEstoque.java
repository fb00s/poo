/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
class ImportadorEstoque {
    private HashMap<Produto, Integer> estoque = new HashMap<>();
    private File arquivo;

    public ImportadorEstoque() {
    }

    public HashMap<Produto, Integer> getEstoque() {
        return estoque;
    }

    public void setArquivo(File arquivo) {
        this.arquivo = arquivo;
    }
    
    public void processarArquivo() {
        try {
            Scanner arquivoScanner = new Scanner(arquivo, "UTF-8");
            
                        // verifica se tem mais linhas do que só o cabeçalho
            if (arquivoScanner.hasNextLine()) {
                arquivoScanner.nextLine(); // pula o cabeçalho
            }
            
            while (arquivoScanner.hasNextLine()) {
                String linha = arquivoScanner.nextLine(); // pega a proxima linha com informações
                String[] informacoes = linha.split(";"); // separa a string onde tem ";" em listas
                
                Produto produto = new Produto(informacoes[0], Double.parseDouble(informacoes[1]));
                int quantidade = Integer.parseInt(informacoes[2]);
                
                if (estoque.containsKey(produto)) {
                    estoque.put(produto, estoque.get(produto) + quantidade);
                } else {
                    estoque.put(produto, quantidade);
                }
            }
            
            arquivoScanner.close();
        } catch (FileNotFoundException  e) {
            System.out.println("Arquivo não encontrado");
        }
    }
}
