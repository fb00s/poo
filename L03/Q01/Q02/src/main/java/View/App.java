/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Felipe Boos
 */
import java.util.Scanner;
import Model.Funcionario;

public class App {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numFuncionarios = 5;
        Funcionario[] vetorFuncionarios = new Funcionario[numFuncionarios];
        
        for(int i = 0; i < numFuncionarios; i++){
            Funcionario funcionario = new Funcionario();
            
            System.out.println("Funcionario " + (i + 1) + "/" + numFuncionarios);
            System.out.println("Digite o nome do funcionario: ");
            funcionario.setNome(teclado.next());
            
            System.out.println("Digite o salario do funcionario: ");
            funcionario.setSalario(teclado.nextDouble());
            
            vetorFuncionarios[i] = funcionario;
        }
        
        teclado.close();
        
        
        
        for(Funcionario f : vetorFuncionarios){
            System.out.println("------------------------------------");
            System.out.println("Nome: " + f.getNome());
            System.out.printf("Salario: R$ %.2f\n", f.getSalario());
            System.out.printf("IRPF: R$ %.2f\n", f.calcularIrpf());
        }
    }
}
