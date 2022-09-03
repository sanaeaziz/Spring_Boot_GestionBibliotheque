package com.aziz.sanae.GBibliotheque.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aziz.sanae.GBibliotheque.model.Emprunt;


@Repository("EmpruntRepository")
public interface EmpruntRepository extends CrudRepository<Emprunt,Long> {

}
