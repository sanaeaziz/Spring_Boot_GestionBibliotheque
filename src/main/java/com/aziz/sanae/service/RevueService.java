package com.aziz.sanae.service;

import org.springframework.stereotype.Service;

import com.aziz.sanae.model.Revue;
import com.aziz.sanae.repository.RevueRepository;

@Service("RevueService")
public class RevueService {

	private RevueRepository revuerepository;
	
	public Iterable<Revue> findAll() {
		return revuerepository.findAll();

	}

	
	public Revue findById(long id) {
		
		return revuerepository.findById((int) id).orElse(null);
	}

	
	public Revue save(Revue revue) {
		
		return revuerepository.save(revue);
	}

	
	public void delete(long id) {
		revuerepository.deleteById((int) id);
	} 
public Revue Update(Revue revue) {
		
		return revuerepository.save(revue);
	}

}
