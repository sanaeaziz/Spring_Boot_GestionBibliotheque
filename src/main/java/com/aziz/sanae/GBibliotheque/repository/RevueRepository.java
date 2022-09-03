package com.aziz.sanae.GBibliotheque.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aziz.sanae.GBibliotheque.model.Revue;



@Repository("RevueRepository")
public interface RevueRepository extends CrudRepository<Revue, Long> {

}

