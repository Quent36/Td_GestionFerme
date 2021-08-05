package com.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Ferme implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFerme;
	private String nom;
	private Date dateAchat;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "FERME_DEPARTEMENT", joinColumns = {
			@JoinColumn(name="id_ferme", referencedColumnName = "idFerme")},
	inverseJoinColumns = {@JoinColumn(name="id_DEPARTEMENT", table = "departement",referencedColumnName = "idDepartement")})
	private List<Departement> departement;
	
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "FERME_DEPARTEMENT", joinColumns = {
			@JoinColumn(name="id_ferme", referencedColumnName = "idFerme")},
	inverseJoinColumns = {@JoinColumn(name="id_GERANT", table = "gerant",referencedColumnName = "idGerant")})
	private List<Gerant> gerants;
	
	
	@OneToMany(mappedBy = "eleveur")
	private List<Animal> animaux;
	
	
	public Ferme() {
		super();
	}

	public Ferme(Long idFerme, String nom, Date dateAchat) {
		super();
		this.idFerme = idFerme;
		this.nom = nom;
		this.dateAchat = dateAchat;
	}

	public Long getIdFerme() {
		return idFerme;
	}

	public void setIdFerme(Long idFerme) {
		this.idFerme = idFerme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	@Override
	public String toString() {
		return "Ferme [idFerme=" + idFerme + ", nom=" + nom + ", dateAchat=" + dateAchat + "]";
	}

}
