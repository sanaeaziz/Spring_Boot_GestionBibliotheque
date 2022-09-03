package com.aziz.sanae.GBibliotheque.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aziz.sanae.GBibliotheque.model.Emprunt;
import com.aziz.sanae.GBibliotheque.repository.EmpruntRepository;


@Service("EmpruntService")
public class EmpruntService {

	@Autowired
    private EmpruntRepository empruntrepository;


    public Collection<Emprunt> findAll() {

        return (Collection<Emprunt>) empruntrepository.findAll();
    }


    public Emprunt findById(long ID) {

        return empruntrepository.findById(ID).get();
    }


    public Emprunt save(Emprunt emprunt) {

        return empruntrepository.save(emprunt);
    }


    public void delete(long ID) {
        empruntrepository.deleteById(ID);
    }

    public Emprunt Update(Emprunt emprunt) {

        return empruntrepository.save(emprunt);
    }

}
