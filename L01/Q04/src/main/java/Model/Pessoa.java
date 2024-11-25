/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Model;

/**
 *
 * @author felip
 */
public class Pessoa {
    public double altura;
    public double peso;
    public String nome;
    
    public double calcularImc(){
        return peso / (altura * altura);
    }
}
