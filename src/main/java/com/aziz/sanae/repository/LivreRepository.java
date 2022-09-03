package com.aziz.sanae.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aziz.sanae.model.Livre;



@Repository("LivreRepository")
public interface LivreRepository extends CrudRepository<Livre, Integer> {

}