/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.APIcentralPet.resources;

import br.com.APIcentralPet.models.Agenda;
import br.com.APIcentralPet.repository.AgendaRepository;
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
@RequestMapping({"/agenda"})
public class AgendaResource {
    
    @Autowired
	AgendaRepository  agendaRepository;
	
	@GetMapping("/agendas")
	public List<Agenda> listaAgenda(){
		return agendaRepository.findAll();
	}
	
	@GetMapping("/{id_agenda}")
	public Agenda listaAgendaUnico(@PathVariable(value="id_agenda")long id_agenda){
		return agendaRepository.findById(id_agenda);
	}
	
	@PostMapping("/salvarAgenda")
	public Agenda salvaAgenda(@RequestBody Agenda agenda) {
		return agendaRepository.save(agenda);
	}
	
	@DeleteMapping("/delete/{id_agenda}")
	public void deletaAgenda(@PathVariable(value="id_agenda")long id_agenda){
                Agenda idEsp = listaAgendaUnico(id_agenda);
		agendaRepository.delete(idEsp);
	}

	@PutMapping("/atualizarAgenda")
	public Agenda atualizarAgenda(@RequestBody Agenda agenda) {
		return agendaRepository.save(agenda);
                
	}
    
}
