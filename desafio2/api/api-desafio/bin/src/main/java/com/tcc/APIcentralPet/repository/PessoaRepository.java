/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.APIcentralPet.repository;

import br.com.APIcentralPet.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author wesley
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long>  {
    Pessoa findById(long id_pessoa);
}
