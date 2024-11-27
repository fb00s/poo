/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista13.q02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author gabri
 */
public class ArquivoMp3 implements ArquivoNaoTemTagMp3{
    private TagMp3 tagMp3 = new TagMp3();

    public ArquivoMp3(String nomeArquivo) {
        contruirTag(nomeArquivo);
    }
    
    private void contruirTag(String nomeArquivo) {
        try {
            ArgumentoNaoEhArquivoException isArquivo = new ArgumentoNaoEhArquivoException(nomeArquivo);
            ArquivoNaoTemTagMp3(nomeArquivo);
            
            File f = new File(nomeArquivo);
            FileInputStream fis = new FileInputStream(f);
            
            byte[] dados = fis.readAllBytes();
            
            String titulo = PegarTexto(dados, 3, 30);
            tagMp3.setTitulo(titulo);
            
            String artista = PegarTexto(dados, 33, 30);
            tagMp3.setArtista(artista);
            
            String album = PegarTexto(dados, 63, 30);
            tagMp3.setAlbum(album);
            
            String ano = PegarTexto(dados, 93, 4);
            tagMp3.setAno(Integer.parseInt(ano.trim()));
            
            String comentario = PegarTexto(dados, 97, 28);
            tagMp3.setComentario(comentario);
            
            String numeroFaixa = PegarTexto(dados, 126, 1);
            boolean verificarVazio = numeroFaixa.getBytes()[0] == 0;
            tagMp3.setNumeroFaixa(verificarVazio ? 0 : numeroFaixa.getBytes()[0]);
            
            String genero = PegarTexto(dados, 127, 1);
            tagMp3.setGenero(genero.getBytes()[0]);
            
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        } catch (IllegalArgumentException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public TagMp3 getTagMp3() {
        return tagMp3;
    }
    
    @Override
    public void ArquivoNaoTemTagMp3(String arquivo) throws FileNotFoundException, IOException {
        File f = new File(arquivo);
        FileInputStream fis = new FileInputStream(f);
        byte[] dados = fis.readAllBytes();
        byte[] tagBytes = Arrays.copyOfRange(dados, dados.length - 128, dados.length);
        String tag = new String(tagBytes, 0, 3);
        fis.close();
        
        if (!tag.equals("TAG"))
            throw new IllegalArgumentException("Arquivo não tem tag mp3");
    }
    
    public String PegarTexto(byte[] dados, int inicio, int quantidadeLer) {
        byte[] tagBytes = Arrays.copyOfRange(dados, dados.length - 128, dados.length);
        String texto = new String(tagBytes, inicio, quantidadeLer);
        return texto;
    }
}
