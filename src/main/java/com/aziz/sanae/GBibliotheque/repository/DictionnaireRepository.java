package com.aziz.sanae.GBibliotheque.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aziz.sanae.GBibliotheque.model.Dictionnaire;



@Repository("DictionnaireRepository")
public interface DictionnaireRepository extends CrudRepository<Dictionnaire, Long> {

}

