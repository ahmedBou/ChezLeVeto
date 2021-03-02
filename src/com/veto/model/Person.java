package com.veto.model;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public abstract class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable = false, updatable = false)
	private int id;

	private String pswd;
	private String prenom;
	private String nom;
	
	@Column(name="email", nullable = false, updatable = false)
	private String email;

	


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String pswd, String prenom, String nom, String email) {
		super();
		this.pswd = pswd;
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	  
}
