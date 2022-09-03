package com.aziz.sanae.GBibliotheque.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "livre")
public class Livre extends Document {
	@Column
	private String auteur;
	@Column
	private int nb_page;
	@OneToMany(mappedBy = "livre", cascade = CascadeType.ALL)
	protected List<Emprunt> emprunts;

	public Livre() {

	}

	@Override
	public String toString() {
		return "Livre [auteur=" + auteur + ", nb_page=" + nb_page + ", emprunts=" + emprunts + "]";
	}
	public Livre(double prix, String auteur, int nb_page, List<Emprunt> emprunts) {
		super(prix);
		this.auteur = auteur;
		this.nb_page = nb_page;
		this.emprunts = emprunts;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public int getNb_page() {
		return nb_page;
	}
	public void setNb_page(int nb_page) {
		this.nb_page = nb_page;
	}
	public List<Emprunt> getEmprunts() {
		return emprunts;
	}
	public void setEmprunts(List<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}
	
	}