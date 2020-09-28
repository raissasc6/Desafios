/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.APIcentralPet.resources;

import br.com.APIcentralPet.models.Animal;
import br.com.APIcentralPet.repository.AnimalRepository;
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
@RequestMapping({"/animal"})
public class AnimalResource {
    
    @Autowired
	AnimalRepository  animalRepository;
	
	@GetMapping("/animais")
	public List<Animal> listaAnimais(){
		return animalRepository.findAll();
	}
	
	@GetMapping("/{id_animal}")
	public Animal listaAnimalUnico(@PathVariable(value="id_aniamal")long id_animal){
		return animalRepository.findById(id_animal);
	}
	
	@PostMapping("/salvarAnimal")
	public Animal salvaAnimal(@RequestBody Animal animal) {
		return animalRepository.save(animal);
	}
	
	@DeleteMapping("/delete/{id_animal}")
	public void deletaAnimal(@PathVariable(value="id_animal") long id_animal) {
                Animal idEsp = listaAnimalUnico(id_animal);
		animalRepository.delete(idEsp);
	}
	
	@PutMapping("/atualizarAnimal")
	public Animal atualizarAnimal(@RequestBody Animal animal) {
		return animalRepository.save(animal);
	}
}

