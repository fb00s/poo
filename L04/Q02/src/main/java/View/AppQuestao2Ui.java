/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Felipe Boos
 */

import Model.Retangulo;
import javax.swing.JOptionPane;

public class AppQuestao2Ui {
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo();
        
        retangulo.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do retangulo: ")));
        
        retangulo.setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do retangulo: ")));
        
        JOptionPane.showMessageDialog(null,"Perimetro: " + retangulo.calcularPerimetro() + " Area: " + retangulo.calcularArea());
    }
}
