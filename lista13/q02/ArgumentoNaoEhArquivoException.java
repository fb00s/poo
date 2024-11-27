/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista13.q02;

import java.io.File;

/**
 *
 * @author gabri
 */
public class ArgumentoNaoEhArquivoException {
    public ArgumentoNaoEhArquivoException(String arquivo) {
        File f = new File(arquivo);
        
        if (!f.isFile())
            throw new IllegalArgumentException("Não é um arquivo");
    }
}
