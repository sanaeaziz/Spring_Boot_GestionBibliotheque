package com.aziz.sanae.GBibliotheque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aziz.sanae.GBibliotheque.model.Adherent;

@Repository

public interface AdherentRepository extends JpaRepository<Adherent, Long> {
	Adherent findByCin(String cin);
	 


}
