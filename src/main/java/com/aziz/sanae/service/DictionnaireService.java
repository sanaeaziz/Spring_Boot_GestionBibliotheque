package com.aziz.sanae.service;

import org.springframework.stereotype.Service;

import com.aziz.sanae.model.Dictionnaire;
import com.aziz.sanae.repository.DictionnaireRepository;


@Service("DictionnaireService")
public class DictionnaireService {


	private DictionnaireRepository dictionnairerepository;
	public Iterable<Dictionnaire> findAll() {

		return dictionnairerepository.findAll();
	}

	
	public Dictionnaire findById(long ID) {
		
		return dictionnairerepository.findById((int) ID).orElse(null);
	}

	
	public Dictionnaire save(Dictionnaire dictionnaire) {
		
		return dictionnairerepository.save(dictionnaire);
	}

	
	public void delete(long ID) {
		dictionnairerepository.deleteById((int) ID);
	} 
public Dictionnaire Update(Dictionnaire dictionnaire) {
		
		return dictionnairerepository.save(dictionnaire);
	}

}


