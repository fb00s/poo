/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista15.q2;

/**
 *
 * @author gabri
 */
public class ContaEspecial extends ContaBancaria {
    private double limiteCredito;

    public ContaEspecial(double limiteCredito, String numero, double saldo, Cliente titular) {
        super(numero, saldo, titular);
        this.limiteCredito = limiteCredito;
    }    

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    @Override
    public void sacar(double valor) {
        if (valor > this.getSaldo()+this.limiteCredito)
            throw new IllegalArgumentException("Valor excede o limite de credito");
        double saldo = this.getSaldo() - valor;
        this.setSaldo(saldo);
    }
}
