package com.aziz.sanae.GBibliotheque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aziz.sanae.GBibliotheque.model.Livre;
import com.aziz.sanae.GBibliotheque.repository.LivreRepository;


@Service("LivreService")
public class LivreService {

    @Autowired
    private LivreRepository livrerepository;

    public Iterable<Livre> findAll() {

        return livrerepository.findAll();
    }


    public Livre findById(long ID) {

        return livrerepository.findById(ID).orElse(null);
    }


    public Livre save(Livre livre) {

        return livrerepository.save(livre);
    }


    public void delete(long ID) {
        livrerepository.deleteById(ID);
    }

    public Livre Update(Livre livre) {

        return livrerepository.save(livre);
    }

}