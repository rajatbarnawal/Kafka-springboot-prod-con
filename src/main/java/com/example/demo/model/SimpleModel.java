package com.example.demo.model;

import java.io.Serializable;

public class SimpleModel implements Serializable {
	private String firstName;
	private String lastName;
	
	
	public SimpleModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SimpleModel(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "SimpleModel [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
