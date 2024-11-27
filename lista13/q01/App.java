package lista13.q01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.io.File;
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
        Scanner s = new Scanner(System.in);
        
        System.out.print("Informe o diretorio:");
        String diretorioTexto = s.next();
        s.close();
        
        File diretorio = new File(diretorioTexto);
        System.out.println(diretorio.length());
        
        try {
            File[] conteudoDiretorio = diretorio.listFiles();
            
            if (conteudoDiretorio == null)
                throw new NullPointerException("Diretorio não existe");
            
            double tamanho = pegarTamanho(conteudoDiretorio);
            System.out.println("\nTamanho do diretorio em Megabytes: "+tamanho);
            
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static double pegarTamanho(File[] diretorio) {
        long tamanho = 0;
        
        for (File arquivo : diretorio) {
            if (arquivo.isDirectory()) {
                System.out.println("\nDiretorio: "+arquivo.getName());
                if (arquivo.listFiles() != null)
                    tamanho += pegarTamanho(arquivo.listFiles());
            } else {
                System.out.println(arquivo.getName()+" "+arquivo.length());
                tamanho += arquivo.length();
            }
        }
        
        return tamanho*Math.pow(10, -6);
    }
}
