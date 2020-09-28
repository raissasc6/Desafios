/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.APIcentralPet.resources;

import br.com.APIcentralPet.models.Pessoa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.APIcentralPet.repository.PessoaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/pessoa"})
public class PessoaResource {
    
    	@Autowired
	PessoaRepository  pessoaRepository;
	
	@GetMapping("/pessoas")
	public List<Pessoa> listaPessoas(){
		return pessoaRepository.findAll();
	}
	
	@GetMapping("/{id_pessoa}")
	public Pessoa listaPessoaUnico(@PathVariable(value="id_pessoa")long id_pessoa){
		return pessoaRepository.findById(id_pessoa);
	}
	
	@PostMapping("/salvarPessoa")
	public Pessoa salvaPessoa(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	@DeleteMapping("/delete/{id_pessoa}")
	public void deletaPessoa(@PathVariable(value="id_pessoa")long id_pessoa){
            Pessoa idEsp = listaPessoaUnico(id_pessoa);
		pessoaRepository.delete(idEsp);
	}
  
	@PutMapping("/pessoa")
	public Pessoa atualizarPessoa(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
    
}
