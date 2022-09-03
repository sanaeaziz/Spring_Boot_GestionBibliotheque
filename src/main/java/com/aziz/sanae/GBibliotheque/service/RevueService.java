package com.aziz.sanae.GBibliotheque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aziz.sanae.GBibliotheque.model.Revue;
import com.aziz.sanae.GBibliotheque.repository.RevueRepository;

@Service("RevueService")
public class RevueService {

    @Autowired
    private RevueRepository revuerepository;

    public Iterable<Revue> findAll() {
        return revuerepository.findAll();

    }
    public Revue findById(long id) {

        return revuerepository.findById(id).orElse(null);
    }


    public Revue save(Revue revue) {

        return revuerepository.save(revue);
    }


    public void delete(long id) {
        revuerepository.deleteById(id);
    }

    public Revue Update(Revue revue) {

        return revuerepository.save(revue);
    }

}
