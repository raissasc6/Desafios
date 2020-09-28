/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.APIcentralPet.resources;

import br.com.APIcentralPet.models.Servico;
import br.com.APIcentralPet.repository.ServicoRepository;
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



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/servico"})
public class ServicoResource {
    
    @Autowired
	ServicoRepository  servicoRepository;
	
	@GetMapping("/servicos")
	public List<Servico> listaServico(){
		return servicoRepository.findAll();
	}
	
	@GetMapping("/{id_servico}")
	public Servico listaServicoUnico(@PathVariable(value="id_servico")long id_servico){
		return servicoRepository.findById(id_servico);
	}
	
	@PostMapping("salvarServico")
	public Servico salvaServico(@RequestBody Servico servico) {
		return servicoRepository.save(servico);
	}
	
	@DeleteMapping("/delete/{id_servico}")
	public void deletaServico(@PathVariable(value="id_servico") long id_servico) {
             Servico idEsp = listaServicoUnico(id_servico);
		servicoRepository.delete(idEsp);
	}

	@PutMapping("/atualizarServico")
	public Servico atualizarServico(@RequestBody Servico servico) {
		return servicoRepository.save(servico);
	}


}
