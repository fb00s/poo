/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Felipe Boos
 */
import javax.swing.JOptionPane;
import Model.Retangulo;

public class AppQuestao3Ui {
    public static void main(String[] args){
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do retangulo: "));
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do retangulo: "));
        
        Retangulo retangulo = new Retangulo(altura, comprimento);
        
        JOptionPane.showMessageDialog(null, "Perimetro do retangulo: " + retangulo.calcularPerimetro() +
                ", Area do retangulo: " + retangulo.calcularArea());
    }
}
