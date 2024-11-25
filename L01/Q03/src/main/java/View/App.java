/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author felip
 */
import java.util.Scanner;
import Model.Pessoa;

public class App {
    public static void main(String[] args){
        int numPessoas = 3;
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < numPessoas; i++){
            Pessoa pessoa = new Pessoa();
            
            System.out.println("Digite a altura da pessoa");
            pessoa.altura = scanner.nextDouble();
            
            System.out.println("Digite o peso da pessoa: ");
            pessoa.peso = scanner.nextDouble();
            
            System.out.println("IMC calculado: " + pessoa.calcularImc());
            System.out.println("---------------------------------------");
        }
    }
}
