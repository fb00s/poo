/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author felip
 */
import Model.ContaBancaria;

public class App {
    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setTitular("Felipe");
        ContaBancaria conta2 = new ContaBancaria();
        conta2.setTitular("Pelipe");
        
        ContaBancaria[] arrayDeContas = {conta1, conta2};
        
        conta1.depositar(1000);
        conta1.depositar(700);
        
        conta2.depositar(5000);
        
        conta2.sacar(3000);
        
        conta2.transferir(conta1, 1800);
        
        for (ContaBancaria cb : arrayDeContas){
            System.out.println("-------------------------------------");
            System.out.println("Nome do titular: " + cb.getTitular());
            System.out.println("Saldo: " + cb.getSaldo());
        }
    }
}
