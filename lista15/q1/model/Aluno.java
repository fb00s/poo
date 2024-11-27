/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista15.q1.model;

/**
 *
 * @author gbvanzuita
 */
public class Aluno {
    private int matricula;
    private String nome;
    private double notaEnem;


    public Aluno(int matricula, String nome, double notaEnem) {
        setNome(nome);
        setMatricula(matricula);
        setNotaEnem(notaEnem);
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) throws IllegalArgumentException {
        if (matricula < 1)
            throw new IllegalArgumentException("Valor de matricula invalido");
        
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isBlank())
            throw new IllegalArgumentException("Aluno deve possuir nome");
            
        this.nome = nome;
    }
    
    public double getNotaEnem() {
        return notaEnem;
    }

    public void setNotaEnem(double notaEnem) throws IllegalArgumentException {
        if (notaEnem < 0)
            throw new IllegalArgumentException("Nota invalida");
        this.notaEnem = notaEnem;
    }
}
