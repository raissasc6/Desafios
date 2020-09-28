/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.APIcentralPet.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="AGENDA")
public class Agenda implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id_agenda;
    private int ano_agenda;
    @OneToOne
    private PetShop petshop;

    public long getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(long id_agenda) {
        this.id_agenda = id_agenda;
    }

    public int getAno_agenda() {
        return ano_agenda;
    }

    public void setAno_agenda(int ano_agenda) {
        this.ano_agenda = ano_agenda;
    }
   
    public static long getSerialversionuid() {
		return serialVersionUID;
    }
}
