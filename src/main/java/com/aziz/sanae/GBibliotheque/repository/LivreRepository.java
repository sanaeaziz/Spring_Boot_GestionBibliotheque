package com.aziz.sanae.GBibliotheque.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aziz.sanae.GBibliotheque.model.Livre;



@Repository("LivreRepository")
public interface LivreRepository extends CrudRepository<Livre, Long> {

}