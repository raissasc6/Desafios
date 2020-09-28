/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.APIcentralPet.repository;

import br.com.APIcentralPet.models.ItemAgenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemAgendaRepository extends JpaRepository<ItemAgenda, Long>{
    
    ItemAgenda findById(long id_itemAgenda);
}
