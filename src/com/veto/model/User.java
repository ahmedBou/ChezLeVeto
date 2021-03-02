package com.veto.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@AttributeOverride(name="id", column= @Column(name="user_id"))
@DiscriminatorValue(value = "u")
@Table(name="patient")
public class User extends Person {
//	private String animal;
	
	@OneToMany(mappedBy="user", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private List<Question> question = new ArrayList<Question>();
	
	public User() {
		super();	
	}
	
	public User(String pswd, String prenom, String nom, String email) {
		super(pswd, prenom, nom, email);
		// TODO Auto-generated constructor stub
	}





	public List<Question> getQuestion() {
		return question;
	}

	public void setQuestion(List<Question> question) {
		this.question = question;
	}

//	public String getAnimal() {
//		return animal;
//	}
//
//	public void setAnimal(String animal) {
//		this.animal = animal;
//	}


}
