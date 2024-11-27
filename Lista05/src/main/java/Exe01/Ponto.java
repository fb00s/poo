/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe01;

/**
 *
 * @author felboos
 */
public class Ponto {
    private int x;
    private int y;
    
    public Ponto(){
        this.x = 0;
        this.y = 0;
    }
    
    public Ponto(int x, int y){
        setX(x);
        setY(y);
    }
    
    public int getX(){
        return x;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public Quadrante identificarQuadrante(){
        if (x > 0 && y > 0){
            return Quadrante.PRIMEIRO;
        }
        
        if (x > 0 && y < 0){
            return Quadrante.QUARTO;
        }
        
        if (x <0 && y > 0){
            return Quadrante.SEGUNDO;
        }
        
        if (x < 0 && y < 0){
            return Quadrante.TERCEIRO;
        }
        
        return Quadrante.NENHUM;
    }
    
    public boolean estaIncidindoSobreX(){
        return x == 0;
    }
    
    public boolean estaIncidindoSobreY(){
        return y == 0;
    }
    
    public double calcularDistancia(Ponto outroPonto){
        double x1 = this.x;
        double y1 = this.y;
        
        double x2 = outroPonto.x;
        double y2 = outroPonto.y;
        
        double distancia = calcular(x1, y1, x2, y2);
        
        return distancia;
    }
    
    public double calcularDistancia(Ponto p1, Ponto p2){
        double x1 = p1.x;
        double y1 = p1.y;
        
        double x2 = p2.x;
        double y2 = p2.y;
        
        double distancia = calcular(x1, y1, x2, y2);
        
        return distancia;
    }
    
    public double calcular(double x1, double y1, double x2, double y2){
        double diferencaX = x2 - x1;
        double diferencaY = y2 - y1;
        
        double quadradoDX = Math.pow(diferencaX, 2);
        double quadradoDY = Math.pow(diferencaY, 2);
        
        return Math.sqrt((quadradoDX + quadradoDY));
    }
}
