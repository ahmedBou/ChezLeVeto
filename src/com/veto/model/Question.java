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
@Table(name="chat")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "q_id", updatable = false, nullable = false)
	private Long question_id;


	@Column(name="question")
	private String question;
	

	public Question(String question, User user) {
		super();
		this.question = question;
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name = "fk_user")
	private User user;

	public void setUser(User user) {
		this.user = user;
	}
	
	public Long getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}


	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}




				
}

