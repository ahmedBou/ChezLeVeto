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
	private User user;
	


	public RendezVs() {
		// TODO Auto-generated constructor stub
	}



	public RendezVs(String motif, String dateRvs, boolean isConfirmed, User user) {
		super();
		this.motif = motif;
		this.dateRvs = dateRvs;
		this.isConfirmed = isConfirmed;
		this.user = user;
	}
	
	

}
