/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista15.q2;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author gabri
 */
public class ContaBancaria {
    private String numero;
    private double saldo;
    private Cliente titular;
    private ArrayList<Movimento> movimentos = new ArrayList<>();

    public ContaBancaria(String numero, double saldo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }    
    
    public void depositar(double valor) {
        this.saldo += valor;
        Movimento movimento = new Movimento(valor, TipoMovimento.CREDITO);
        this.incluirMovimento(movimento);
    }
    
    public void sacar(double valor) {
        if (valor > saldo)
            throw new IllegalArgumentException("Valor excede o saldo");
        this.saldo -= valor;
        Movimento movimento = new Movimento(valor, TipoMovimento.DEBITO);
        this.incluirMovimento(movimento);
    }
    
    public void transferir(ContaBancaria contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
    public ArrayList<Movimento> getMovimentos() {
        return movimentos;
    }
    
    protected void incluirMovimento(Movimento m) {
        movimentos.add(m);
    }
    
    public void ordenaMovimentosHoraDecrescente() {
        movimentos.sort(Comparator.comparing(Movimento::getHora).reversed());
    }
}
