/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista16;

import java.util.Objects;

/**
 *
 * @author gabri
 */
public class Produto {
    private String nome;
    private double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        
        if (o == null || getClass() != o.getClass())
            return false;
        
        Produto produto = (Produto) o;        
        return Double.compare(produto.valor, this.valor) == 0 && Objects.equals(this.nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, valor);
    }

    @Override
    public String toString() {
        return "Produto{" + "nome='" + nome + '\'' + ", preco=" + valor + '}';
    }
    
}
