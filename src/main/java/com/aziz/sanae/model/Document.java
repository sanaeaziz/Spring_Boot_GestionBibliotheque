package com.aziz.sanae.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
@Entity
public abstract class  Document {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	@NotNull
	protected double prix;

	public Document( double prix) {
		
		this.prix = prix;
		
	}
	
	public Document() {
	}

	

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}


	@Override
	public String toString() {
		return "Document [id=" + id + ", prix=" + prix +  "]";
	}
	
	public long getId() {
	    return id;
	  }



}
