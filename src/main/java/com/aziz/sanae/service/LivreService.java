package com.aziz.sanae.service;

import org.springframework.stereotype.Service;

import com.aziz.sanae.model.Livre;
import com.aziz.sanae.repository.LivreRepository;



@Service("LivreService")
public class LivreService {

	private LivreRepository livrerepository;
	public Iterable<Livre> findAll() {

		return livrerepository.findAll();
	}

	
	public Livre findById(long ID) {
		
		return livrerepository.findById((int) ID).orElse(null);
	}

	
	public Livre save(Livre livre) {
		
		return livrerepository.save(livre);
	}

	
	public void delete(long ID) {
		livrerepository.deleteById((int) ID);
	} 
public Livre Update(Livre livre) {
		
		return livrerepository.save(livre);
	}

}