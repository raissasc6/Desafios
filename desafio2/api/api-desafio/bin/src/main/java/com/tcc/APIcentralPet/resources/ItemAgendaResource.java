/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.APIcentralPet.resources;

import br.com.APIcentralPet.models.ItemAgenda;
import br.com.APIcentralPet.repository.ItemAgendaRepository;
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
@RequestMapping({"/itemAgenda"})
public class ItemAgendaResource {
    
    @Autowired
	ItemAgendaRepository  itemAgendaRepository;
	
	@GetMapping("/itemAgenda")
	public List<ItemAgenda> listaItemAgenda(){
		return itemAgendaRepository.findAll();
	}
	
	@GetMapping("/itemAgenda/{id_itemAgenda}")
	public ItemAgenda listaItemAgendaUnico(@PathVariable(value="id_itemAgenda")long id_itemAgenda){
		return itemAgendaRepository.findById(id_itemAgenda);
	}
	
	@PostMapping("itemAgenda")
	public ItemAgenda salvaItemAgenda(@RequestBody ItemAgenda itemAgenda) {
		return itemAgendaRepository.save(itemAgenda);
	}
	
	@DeleteMapping("/itemAgenda")
	public void deletaItemAgenda(@RequestBody ItemAgenda itemAgenda) {
		itemAgendaRepository.delete(itemAgenda);
	}
	
	@PutMapping("/itemAgenda")
	public ItemAgenda atualizarItemAgenda(@RequestBody ItemAgenda itemAgenda) {
		return itemAgendaRepository.save(itemAgenda);
	}
    
}

