package com.veto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="response")
public class Response {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "q_id", updatable = false, nullable = false)
	private Long response_id;
	
	@Column(name="response")
	private String response;

	public Response() {
		super();
	}
	public Response(String response, Person veto) {
		super();
		this.response = response;
		this.veto = veto;
	}
	
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person veto;

	public Long getResponse_id() {
		return response_id;
	}
	public void setResponse_id(Long response_id) {
		this.response_id = response_id;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public Person getVeto() {
		return veto;
	}
	public void setVeto(Person veto) {
		this.veto = veto;
	}

}
