/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * Classe que representa um retângulo com altura e comprimento.
 * Oferece métodos para calcular a área e o perímetro.
 * @author Felipe Boos
 */
public final class Retangulo {
    private int altura;
    private int comprimento;
    
    public Retangulo(){
    }
    
    /**
     * Construtor que inicializa o retângulo com valores fornecidos de altura e comprimento.
     *
     * @param altura - a altura do retângulo. Deve ser maior que 0.
     * @param comprimento - o comprimento do retângulo. Deve ser maior que 0.
     */
    public Retangulo(int altura, int comprimento){
        setAltura(altura);
        setComprimento(comprimento);
    }
    
    /**
     * Obtém a altura do retângulo.
     *
     * @return a altura atual do retângulo.
     */
    public int getAltura(){
        return altura;
    }
    
    /**
     * Define a altura do retângulo.
     *
     * @param altura a nova altura. Deve ser maior que 0.
     * @throws IllegalArgumentException se a altura for menor ou igual a 0.
     */
    public void setAltura(int altura){
        if (altura <= 0){
            throw new IllegalArgumentException("Valor incorreto para altura: " + altura);
        }
        
        this.altura = altura;
    }
    
     /**
     * Obtém o comprimento do retângulo.
     *
     * @return o comprimento atual do retângulo.
     */
    public int getComprimento(){
        return comprimento;
    }
    
    /**
     * Define o comprimento do retângulo.
     *
     * @param comprimento o novo comprimento. Deve ser maior que 0.
     * @throws IllegalArgumentException se o comprimento for menor ou igual a 0.
     */
    public void setComprimento(int comprimento){
        if (comprimento <= 0){
            throw new IllegalArgumentException("Valor incorreto para comprimento: " + comprimento);
        }
        
        this.comprimento = comprimento;
    }
    
    /**
     * Calcula o perímetro do retângulo.
     *
     * @return o perímetro, que é a soma dos lados multiplicada por 2.
     */
    public int calcularPerimetro(){
        return (altura * 2) + (comprimento * 2);
    }    
    
    /**
     * Calcula a área do retângulo.
     *
     * @return a área, que é a multiplicação da altura pelo comprimento.
     */
    public int calcularArea(){
        return altura * comprimento;
    }
    
}
