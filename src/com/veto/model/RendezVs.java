package com.veto.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rendezVs")
public class RendezVs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rVs_id")
	private int id;
	
	@Column(name = "motif")
	private String motif;
	
	@Column(name = "date_rVs")
	private String dateRvs;
	
	@Column(name ="confirmRvs", nullable = false, columnDefinition = "boolean default false")
	private boolean isConfirmed = false;

	
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	@JoinColumn(name = "person_id")
	private Person user;

	public RendezVs() {
		
	}



	public RendezVs(String motif, String dateRvs, boolean isConfirmed, Person user) {
		super();
		this.motif = motif;
		this.dateRvs = dateRvs;
		this.isConfirmed = isConfirmed;
		this.user = user;
	}



	public RendezVs(String motif, Person user) {
		super();
		this.motif = motif;
		this.user = user;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getMotif() {
		return motif;
	}



	public void setMotif(String motif) {
		this.motif = motif;
	}



	public String getDateRvs() {
		return dateRvs;
	}



	public void setDateRvs(String dateRvs) {
		this.dateRvs = dateRvs;
	}



	public boolean isConfirmed() {
		return isConfirmed;
	}



	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}





	public Person getUser() {
		return user;
	}



	public void setUser(Person user) {
		this.user = user;
	}



	public void setUser(User user) {
		this.user = user;
	}
	
}
