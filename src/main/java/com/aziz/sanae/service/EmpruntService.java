package com.aziz.sanae.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.aziz.sanae.model.Emprunt;
import com.aziz.sanae.repository.EmpruntRepository;


@Service("EmpruntService")
public class EmpruntService {
	
	private EmpruntRepository empruntrepository;
	
	
	public Collection<Emprunt> findAll() {

		return (Collection<Emprunt>) empruntrepository.findAll();
	}

	
	public Emprunt findById(long ID) {
		
		return empruntrepository.findById((int) ID).get();
	}

	
	public Emprunt save(Emprunt emprunt) {
		
		return empruntrepository.save(emprunt);
	}

	
	public void delete(long ID) {
		empruntrepository.deleteById((int) ID);
	} 
public Emprunt Update(Emprunt emprunt) {
		
		return empruntrepository.save(emprunt);
	}
	
}
