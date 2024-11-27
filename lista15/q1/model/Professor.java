/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista15.q1.model;

/**
 *
 * @author gbvanzuita
 */
public class Professor {
    private String nome;
    private String email;
    private Titulacao titulacao;

    public Professor(String nome, String email, Titulacao titulacao) {
        setNome(nome);
        setEmail(email);
        this.titulacao = titulacao;
    }
    
    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isBlank())
            throw new IllegalArgumentException("Professor deve possuir nome");
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalArgumentException {
        if (email.isBlank())
            throw new IllegalArgumentException("Professor deve possuir email");
        this.email = email;
    }


    public Titulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }
    
    
}
