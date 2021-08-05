package com.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Eleveur implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEleveur;
	private String nom;
	private int age;
	private boolean statut;

	
	@OneToMany(mappedBy = "eleveur")
	private List<Animal> animaux;
	
	
	public Eleveur() {
		super();
	}

	public Eleveur(Long idEleveur, String nom, int age, boolean statut) {
		super();
		this.idEleveur = idEleveur;
		this.nom = nom;
		this.age = age;
		this.statut = statut;
	}

	public Long getIdEleveur() {
		return idEleveur;
	}

	public void setIdEleveur(Long idEleveur) {
		this.idEleveur = idEleveur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	@Override
	public String toString() {
		return "Eleveur [idEleveur=" + idEleveur + ", nom=" + nom + ", age=" + age + ", statut=" + statut + "]";
	}

}
