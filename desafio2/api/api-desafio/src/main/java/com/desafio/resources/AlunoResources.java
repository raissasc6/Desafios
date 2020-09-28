package com.desafio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.models.Aluno;
import com.desafio.repository.AlunoRepository;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping({"/aluno"})
public class AlunoResources {
	
	@Autowired
	AlunoRepository alunoRepository;
	
	@GetMapping("/all")
	public List<Aluno> listaAlunos(){
		return alunoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Aluno listaAlunoUnico(@PathVariable(value="id") long id){
		return alunoRepository.findById(id);
	}
	
	@PostMapping("/salvar")
	public Aluno salvaAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
				
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletaAlunoID(@PathVariable(value="id") long id) {
		Aluno idEsp = listaAlunoUnico(id);
		alunoRepository.delete(idEsp);
	}
	
	@PutMapping("/update")
	public Aluno atualizaAluno(@RequestBody Aluno aluno) {
                return alunoRepository.save(aluno);
	}
	
}
