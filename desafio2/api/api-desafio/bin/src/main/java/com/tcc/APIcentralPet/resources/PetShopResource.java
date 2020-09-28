/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.APIcentralPet.resources;

import br.com.APIcentralPet.models.PetShop;
import br.com.APIcentralPet.repository.PetShopRepository;
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
@RequestMapping({"/petShop"})
public class PetShopResource {
    
    @Autowired
	PetShopRepository  petShopRepository;
	
	@GetMapping("/petShops")
	public List<PetShop> listaPetShop(){
		return petShopRepository.findAll();
	}
	
	@GetMapping("/{id_petShop}")
	public PetShop listaPetShopUnico(@PathVariable(value="id_petShop")long id_petShop){
		return petShopRepository.findById(id_petShop);
	}
	
	@PostMapping("salvarPetShop")
	public PetShop salvaPetShop(@RequestBody PetShop petShop) {
		return petShopRepository.save(petShop);
	}
	
	@DeleteMapping("/delete/{id_agenda}")
	public void deletaPetShop(@PathVariable(value="id_petShop")long id_petShop) {
            PetShop idEsp = listaPetShopUnico(id_petShop);
		petShopRepository.delete(idEsp);
	}
        

	@PutMapping("/atualizarPetShop")
	public PetShop atualizarPetShop(@RequestBody PetShop petShop) {
		return petShopRepository.save(petShop);
	}
    
}
