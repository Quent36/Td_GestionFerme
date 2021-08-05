package com.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gerant implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGerant;
	private String nom;
	private String prenom;

	public Gerant() {
		super();
	}

	public Gerant(Long idGerant, String nom, String prenom) {
		super();
		this.idGerant = idGerant;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Long getIdGerant() {
		return idGerant;
	}

	public void setIdGerant(Long idGerant) {
		this.idGerant = idGerant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Gerant [idGerant=" + idGerant + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

}
