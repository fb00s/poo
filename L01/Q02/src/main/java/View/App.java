/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author felip
 */
import Model.Pessoa;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Pessoa pessoa = new Pessoa();
        
        System.out.println("Digite sua altura: ");
        pessoa.altura =  scanner.nextDouble();
        
        System.out.println("Digite o seu peso: ");
        pessoa.peso = scanner.nextDouble();
        
        System.out.println("Seu imc eh: " + pessoa.calcularImc());
    }
}
