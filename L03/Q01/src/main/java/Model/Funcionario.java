/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Model;

/**
 *
 * @author felip
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    private static final double FAIXA_1_LIMITE_SUP = 1903.98;
    private static final double FAIXA_2_LIMITE_SUP = 2826.65;
    private static final double FAIXA_3_LIMITE_SUP = 3751.05;
    private static final double FAIXA_4_LIMITE_SUP = 4664.68;
    
    private static final double ALIQUOTA_FAIXA_2 = 0.075;
    private static final double ALIQUOTA_FAIXA_3 = 0.15;
    private static final double ALIQUOTA_FAIXA_4 = 0.225;
    private static final double ALIQUOTA_FAIXA_5 = 0.275;
    
    public double calcularIrpf(){
        double total = 0;
        
        if (salario <= FAIXA_1_LIMITE_SUP){ // Faixa 1
            return total;
        }
        
        if (salario <= FAIXA_2_LIMITE_SUP){ // Faixa 2
            total += (salario - FAIXA_1_LIMITE_SUP) * ALIQUOTA_FAIXA_2;
            return total;
        }
        
        total += (FAIXA_2_LIMITE_SUP - FAIXA_1_LIMITE_SUP) * ALIQUOTA_FAIXA_2;
        
        if (salario <= FAIXA_3_LIMITE_SUP){ // Faixa 3
            total += (salario - FAIXA_2_LIMITE_SUP) * ALIQUOTA_FAIXA_3;
            return total;
        }
        
        total += (FAIXA_3_LIMITE_SUP - FAIXA_2_LIMITE_SUP) * ALIQUOTA_FAIXA_3;
        
        if (salario <= FAIXA_4_LIMITE_SUP) { // Faixa 4
            total += (salario - FAIXA_3_LIMITE_SUP) * ALIQUOTA_FAIXA_4;
            return total;
        }
        
        total += (FAIXA_4_LIMITE_SUP - FAIXA_3_LIMITE_SUP) * ALIQUOTA_FAIXA_4;
        
        total += (salario - FAIXA_4_LIMITE_SUP) * ALIQUOTA_FAIXA_5; // Faixa 5
        
        return total;
    }
}
