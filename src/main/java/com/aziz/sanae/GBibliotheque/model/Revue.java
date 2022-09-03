package com.aziz.sanae.GBibliotheque.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "revue")
public class Revue extends Document {
	@Column()
	private String ref;
	@Column()
	private Date annee_pub;
	@OneToMany(mappedBy = "revue", cascade = CascadeType.ALL)
	protected List<Emprunt> emprunts;

	public Revue() {

	}

	@Override
	public String toString() {
		return "Revue [ref=" + ref + ", annee_pub=" + annee_pub + ", emprunts=" + emprunts + "]";
	}
	public Revue(double prix, String ref, Date annee_pub, List<com.aziz.sanae.GBibliotheque.model.Emprunt> emprunts) {
		super(prix);
		this.ref = ref;
		this.annee_pub = annee_pub;
		this.emprunts = emprunts;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public Date getAnnee_pub() {
		return annee_pub;
	}
	public void setAnnee_pub(Date annee_pub) {
		this.annee_pub = annee_pub;
	}
	public List<Emprunt> getEmprunts() {
		return emprunts;
	}
	public void setEmprunts(List<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}
	
}