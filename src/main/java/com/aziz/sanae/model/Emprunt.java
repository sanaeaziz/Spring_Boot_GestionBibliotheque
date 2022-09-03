package com.aziz.sanae.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



@Entity

public class Emprunt {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Date date_emprunt;
	private Date date_retour;

	@ManyToOne()
	@JoinColumn(name = "dic_id",insertable = false,updatable = false)
	private Dictionnaire dictionnaire;
	@ManyToOne()
	@JoinColumn(name = "livre_id",insertable = false,updatable = false)
	private Livre livre;
	@ManyToOne()
	@JoinColumn(name = "revue_id",insertable = false,updatable = false)
	private Revue revue;
	@ManyToOne()
	@JoinColumn(nullable = false,name = "adherent_id")
	private Adherent adherent;
	public long getId() {
		return id;
		
	}
	
	public Emprunt(long id, Date date_emprunt, Date date_retour, Dictionnaire dictionnaire, Livre livre, Revue revue,
			Adherent adherent) {
		super();
		this.id = id;
		this.date_emprunt = date_emprunt;
		this.date_retour = date_retour;
		this.dictionnaire = dictionnaire;
		this.livre = livre;
		this.revue = revue;
		this.adherent = adherent;
	}

	public void setId(long id) {
		this.id = id;
	}
	public Date getDate_emprunt() {
		return date_emprunt;
	}
	public void setDate_emprunt(Date date_emprunt) {
		this.date_emprunt = date_emprunt;
	}
	public Date getDate_retour() {
		return date_retour;
	}
	public void setDate_retour(Date date_retour) {
		this.date_retour = date_retour;
	}
	public Dictionnaire getDictionnaire() {
		return dictionnaire;
	}
	public void setDictionnaire(Dictionnaire dictionnaire) {
		this.dictionnaire = dictionnaire;
	}
	public Livre getLivre() {
		return livre;
	}
	public void setLivre(Livre livre) {
		this.livre = livre;
	}
	public Revue getRevue() {
		return revue;
	}
	public void setRevue(Revue revue) {
		this.revue = revue;
	}
	public Adherent getAdherent() {
		return adherent;
	}
	public void setAdherent(Adherent adherent) {
		this.adherent = adherent;
	}

	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", date_emprunt=" + date_emprunt + ", date_retour=" + date_retour
				+ ", dictionnaire=" + dictionnaire + ", livre=" + livre + ", revue=" + revue + ", adherent=" + adherent
				+ "]";
	}

	
}



