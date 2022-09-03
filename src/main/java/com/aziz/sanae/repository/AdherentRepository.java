package com.aziz.sanae.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aziz.sanae.model.Adherent;

@Repository

public interface AdherentRepository extends JpaRepository<Adherent, Long> {
	Adherent findByCin(String cin);
	 


}
