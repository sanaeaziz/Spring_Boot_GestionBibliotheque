package com.aziz.sanae.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aziz.sanae.model.Dictionnaire;



@Repository("DictionnaireRepository")
public interface DictionnaireRepository extends CrudRepository<Dictionnaire, Integer> {

}

