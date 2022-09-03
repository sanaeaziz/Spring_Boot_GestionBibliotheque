package com.aziz.sanae.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aziz.sanae.model.Revue;



@Repository("RevueRepository")
public interface RevueRepository extends CrudRepository<Revue, Integer> {

}

