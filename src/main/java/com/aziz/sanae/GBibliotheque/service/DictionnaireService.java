package com.aziz.sanae.GBibliotheque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aziz.sanae.GBibliotheque.model.Dictionnaire;
import com.aziz.sanae.GBibliotheque.repository.DictionnaireRepository;

import java.util.Optional;


@Service("DictionnaireService")
public class DictionnaireService {

	@Autowired
	private DictionnaireRepository dictionnairerepository;

	public Iterable<Dictionnaire> findAll() {
			Iterable<Dictionnaire> listDictionnaire = dictionnairerepository.findAll();
			if(!listDictionnaire.iterator().hasNext()){
				System.out.println("no dicionnaure in db");
			}
		return listDictionnaire;
	}

	
	public Dictionnaire findById(long ID) {
		
		return dictionnairerepository.findById(ID).orElse(null);
	}

	
	public Dictionnaire save(Dictionnaire dictionnaire) {
		
		return dictionnairerepository.save(dictionnaire);
	}

	
	public void delete(long id) {
		Optional<Dictionnaire> dictionnaire = dictionnairerepository.findById(id);
		if(!dictionnaire.isPresent()){
			System.out.println("no dictionnaire with this id");
		}
		dictionnairerepository.deleteById(id);
	} 
public Dictionnaire Update(Dictionnaire dictionnaire) {
		
		return dictionnairerepository.save(dictionnaire);
	}

}


