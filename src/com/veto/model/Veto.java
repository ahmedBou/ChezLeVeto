package com.veto.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@AttributeOverride(name="id", column= @Column(name= "veto_id"))
@DiscriminatorValue(value = "v")
@Table(name="veterinaire")
public class Veto extends Person {
	private String company;
	
	public Veto() {
		super();
		}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}

	@OneToMany(mappedBy="veto", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private List<Response> res = new ArrayList<Response>();


}
