package com.swamy.demo;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {
	@Id
	private String firstname;
	private String lastname;
	private String messege;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMessege() {
		return messege;
	}
	public void setMessege(String messege) {
		this.messege = messege;
	}
	
	
	

}
