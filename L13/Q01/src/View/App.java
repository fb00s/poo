/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package View;

/**
 *
 * @author Felipe Boos
 */

import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o diretorio: ");
        String diretorioTxt = teclado.next();
        
        File diretorio = new File(diretorioTxt);
        
        try {
            File[] conteudoDiretorio = diretorio.listFiles();
            
            if (conteudoDiretorio == null) throw new NullPointerException("Diretorio nao existe");
            
            double tamanho = pegaTamanhoArquivos(conteudoDiretorio);
            
            System.out.println("\nTamanho do diretorio em Megabytes: " + tamanho);
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static double pegaTamanhoArquivos(File[] conteudoDiretorio){
        long tamanho = 0;
        
        for (File arquivo : conteudoDiretorio){
            if (arquivo.isDirectory()){
                System.out.println("\nDiretorio: " + arquivo.getName());
                if (arquivo.listFiles() != null) tamanho += pegaTamanhoArquivos(arquivo.listFiles());
            } else {
                System.out.println(arquivo.getName() + "" + arquivo.length());
                tamanho += arquivo.length();
            }
        }
        
        return tamanho * Math.pow(10, -6);
    }
}