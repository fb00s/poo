/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Model;

/**
 *
 * @author felip
 */
public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        setSaldo(getSaldo() + valor);
    }
    
    public void sacar(double valor){
        setSaldo(getSaldo() - valor);
    }
    
    public void transferir(ContaBancaria contaDestino, double valor){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
