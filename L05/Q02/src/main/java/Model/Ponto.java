/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author felip
 */

import Enum.Quadrante;

/**
 * Classe que representa um ponto com posição x e y;
 * Oferece métodos para calcular distância deste até outro ponto e a distância entre dois pontos
 * @author Felipe Boos
 */
public final class Ponto {
    private int x;
    private int y;
    
    /**
     *
     */
    public Ponto(){
    }
    
    /**
     * Construtor que inicializa o ponto com valores x e y fornecidos
     *
     * @param x
     * @param y
     */
    public Ponto(int x, int y){
        setX(x);
        setY(y);
    }
    
    /**
     * Obtém x
     * 
     * @return x 
     */
    public int getX(){
        return x;
    }
    
    /**
     * Define o valor de x do ponto
     *
     * @param x
     */
    public void setX(int x){
        this.x = x;
    }
    
    /**
     * Obtém y
     *
     * @return y
     */
    public int getY(){
        return y;
    }
    
    /**
     * Define o valor y do ponto
     *
     * @param y
     */
    public void setY(int y){
        this.y = y;
    }
    
    /**
     * Método identifica o quadrante para as coordenadas x e y atuais
     *
     * @return Quadrante
     */
    public Quadrante identificarQuadrante(){
        if (estaIncidindoSobreX() || estaIncidindoSobreY()){
            return Quadrante.NENHUM;
        }
        
        if (x > 0){
            if (y > 0){
                return Quadrante.PRIMEIRO;
            } else {
                return Quadrante.QUARTO;
            }
        } else {
            if (y > 0){
                return Quadrante.SEGUNDO;
            } else {
                return Quadrante.TERCEIRO;
            }
        }
        
    }
    
    /**
     * Define se o ponto está sobre o eixo X
     *
     * @return boolean 
     */
    public boolean estaIncidindoSobreX(){
        return y == 0;
    }
    
    /**
     * Define se o ponto está sobre o eixo Y
     *
     * @return boolean
     */
    public boolean estaIncidindoSobreY(){
        return x == 0;
    }
    
    /**
     * Método calcula a distância do ponto instanciado até outro ponto passado como parâmetro
     *
     * @param outroPonto
     * @return distancia
     */
    public double calcularDistancia(Ponto outroPonto){
        double x1 = this.x;
        double y1 = this.y;
        
        double x2 = outroPonto.x;
        double y2 = outroPonto.y;
        
        double diferencaX = x2 - x1;
        double diferencaY = y2 - y1;
        
        double quadradoDistancia = Math.pow(diferencaX, 2) + Math.pow(diferencaY, 2);
        
        return Math.sqrt(quadradoDistancia);
    }
    
    /**
     * Método calcula a distância entre dois pontos
     *
     * @param p1
     * @param p2
     * @return distancia
     */
    public static double calcularDistancia(Ponto p1, Ponto p2){
        double x1 = p1.x;
        double y1 = p1.y;
        
        double x2 = p2.x;
        double y2 = p2.y;
        
        double diferencaX = x2 - x1;
        double diferencaY = y2 - y1;
        
        double quadradoDistancia = Math.pow(diferencaX, 2) + Math.pow(diferencaY, 2);
        
        return Math.sqrt(quadradoDistancia);
    }
    
}
