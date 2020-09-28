/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.APIcentralPet.repository;

import br.com.APIcentralPet.models.Servico;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ServicoRepository extends JpaRepository<Servico, Long>{
    
    Servico findById(long id_servico);
}
