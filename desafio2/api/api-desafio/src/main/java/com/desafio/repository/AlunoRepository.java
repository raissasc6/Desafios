package com.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	
	Aluno findById(long id);
	
}
