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

public final class Ponto {
    private int x;
    private int y;
    
    public Ponto(){
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
    
    public boolean estaIncidindoSobreX(){
        return y == 0;
    }
    
    public boolean estaIncidindoSobreY(){
        return x == 0;
    }
    
}
