package com.feedbackREST.feedbackREST;

import javax.persistence.Entity;
import javax.persistence.Id;

//This class is used for the Feedback Entry
@Entity
public class Feedback {
	
	@Id
	private String name;
	@Override
	public String toString() {
		return "Feedback [name=" + name + ", feedback=" + feedback + "]";
	}
	public Feedback(String name, String feedback) {
		super();
		this.name = name;
		this.feedback = feedback;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	private String feedback;

}
