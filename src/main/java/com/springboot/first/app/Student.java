package com.springboot.first.app;

//creating a java bean class
//JavaBeans are classes that encapsulate many objects into a single object(the bean)

public class Student {
	
	private String firstName;
	private String lastName;
	
	//constructor
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//getter and setter
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
