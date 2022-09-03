package com.aziz.sanae.GBibliotheque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aziz.sanae.GBibliotheque.model.Adherent;
import com.aziz.sanae.GBibliotheque.repository.AdherentRepository;
 
@Service
public class AdherentService {
	@Autowired(required=true)
	private AdherentRepository adherentrepository;
	
	
	public Adherent findAdherentByCIN(String cin) {
		return (Adherent) adherentrepository.findByCin(cin);
	}
	
	public Adherent save(Adherent adherent) {		
		return adherentrepository.save(adherent);
	}

	public Adherent findAdherentByID(long id) {
		return (Adherent) adherentrepository.findById(id).get();
	}
	
	public List<Adherent> findAllAdherent() {
		return  adherentrepository.findAll();
	}
	public Boolean deleteAdherent(long l) {
		 this.adherentrepository.deleteById(l);
		return true;
	}

}
