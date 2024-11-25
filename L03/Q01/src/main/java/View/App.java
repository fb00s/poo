/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Felipe Boos
 */
import Model.Funcionario;
import java.util.Scanner;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        Funcionario funcionario = new Funcionario();
        
        System.out.println("Digite o seu nome: ");
        funcionario.setNome(teclado.next());
        
        System.out.println("Digite o seu salario: ");
        funcionario.setSalario(teclado.nextDouble());
         
        System.out.printf("O valor do seu IRPF eh R$ " + "%.2f%n", funcionario.calcularIrpf());
        //System.out.println("O valor do seu IRPF eh R$ " + df.format(funcionario.calcularIrpf()));
        
        teclado.close();
        
    }
}
