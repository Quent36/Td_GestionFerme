package com.entities;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departement implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDepartement;
	private String nom;
	private String Region;

	
	public Departement() {
		super();
	}

	public Departement(Long idDepartement, String nom, String region) {
		super();
		this.idDepartement = idDepartement;
		this.nom = nom;
		Region = region;
	}

	public Long getIdDepartement() {
		return idDepartement;
	}

	public void setIdDepartement(Long idDepartement) {
		this.idDepartement = idDepartement;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	@Override
	public String toString() {
		return "Departement [idDepartement=" + idDepartement + ", nom=" + nom + ", Region=" + Region + "]";
	}

}
