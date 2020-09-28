package com.desafio.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="aluno")
public class Aluno implements Serializable {
	
	private static final long serialVersionUID = 1;
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long id_aluno;
	
	private String nome_aluno;
        private int idade_aluno;

    public long getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(long id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public int getIdade_aluno() {
        return idade_aluno;
    }

    public void setIdade_aluno(int idade_aluno) {
        this.idade_aluno = idade_aluno;
    }
        
	
	
}
