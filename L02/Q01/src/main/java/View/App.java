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
        Scanner teclado = new Scanner(System.in);
        int numPessoas = 3;
        Pessoa[] listaPessoas = new Pessoa[numPessoas];
        
        for(int i = 0; i < numPessoas; i++){
            Pessoa pessoa = new Pessoa();
            System.out.println("Pessoa " + (i + 1) + "/" + numPessoas);
            System.out.println("Digite o nome da pessoa: ");
            pessoa.setNome(teclado.next());
            
            System.out.println("Digite a altura da pessoa: ");
            pessoa.setAltura(teclado.nextDouble());
            
            System.out.println("Digite o peso da pessoa: ");
            pessoa.setPeso(teclado.nextDouble());
            
            listaPessoas[i] = pessoa;
        }
        teclado.close();
        
        System.out.println("---------------------------");
        
        for(Pessoa p : listaPessoas){
            System.out.println("Nome: " + p.getNome());
            
            System.out.println("Altura: " + p.getAltura());
            
            System.out.println("Peso: " + p.getPeso());
            
            System.out.println("IMC: " + p.calcularImc());
            
            System.out.println("---------------------------");
        }
    }
}
