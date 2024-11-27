/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista16;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gabri
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("selecione o arquivo csv", "csv");
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(fileFilter);
        
        int retorno = chooser.showOpenDialog(chooser);
        
        if (retorno == JFileChooser.APPROVE_OPTION && chooser.getSelectedFile().getName().toLowerCase().endsWith(".csv")) {
            ImportadorEstoque importador = new ImportadorEstoque();
            importador.setArquivo(chooser.getSelectedFile());
            importador.processarArquivo();
            HashMap<Produto, Integer> estoque = importador.getEstoque();
            
            for (Map.Entry<Produto, Integer> objeto : estoque.entrySet()) {
                Produto key = objeto.getKey();
                int quantidade = objeto.getValue();
                System.out.println("Nome:"+key.getNome()+", Valor:"+key.getValor()+", Quantidade:"+quantidade);
            }
        }
    }
    
}
