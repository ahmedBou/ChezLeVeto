package com.veto.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
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



}
