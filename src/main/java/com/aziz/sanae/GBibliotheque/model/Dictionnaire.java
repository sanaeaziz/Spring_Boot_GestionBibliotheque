package com.aziz.sanae.GBibliotheque.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "dictionnaire")
public class Dictionnaire extends Document {
	@Column()
	private String langue;
	@OneToMany(mappedBy = "dictionnaire", cascade = CascadeType.ALL)

	private List<Emprunt> emprunts;
	
	public Dictionnaire( double prix,String langue) {
		super( prix);
		this.langue = langue;
		}
	
	public Dictionnaire() {
		super();
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public List<Emprunt> getEmprunts() {
		return emprunts;
	}

	public void setEmprunts(List<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}
}