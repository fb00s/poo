/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista15.q1.model;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author gbvanzuita
 */
public class Turma {
    private String disciplina;
    private Turno turno;
    private ArrayList<Aluno> alunos;
    private Professor professor;

    public Turma(String disciplina, Turno turno, ArrayList<Aluno> alunos, Professor professor) {
        setDisciplina(disciplina);
        this.turno = turno;
        this.alunos = alunos;
        this.professor = professor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) throws IllegalArgumentException {
        if (disciplina.isBlank())
            throw new IllegalArgumentException("Turma deve possuir o nome da disciplina");
        
        this.disciplina = disciplina;
    }
    
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void incluirAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
    
    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }
    
    public Aluno obterAlunoMelhorNotaEnem() {
        ArrayList<Double> notas = new ArrayList<>();
        for (Aluno aluno : alunos) {
            notas.add(aluno.getNotaEnem());
        }
        return alunos.get(notas.indexOf(Collections.max(notas)));
    }
}
