package com.aziz.sanae.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aziz.sanae.model.Emprunt;


@Repository("EmpruntRepository")
public interface EmpruntRepository extends CrudRepository<Emprunt,Integer> {

}
