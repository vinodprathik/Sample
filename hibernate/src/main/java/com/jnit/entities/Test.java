package com.jnit.entities;

import java.io.Serializable;

import org.hibernate.annotations.Entity;

@Entity
public class Test implements Serializable {
	
	private int id;
	private String name;
	private String gender;
	
	private static final long serialVersionUid = 1L;
	
	Test(){
		
	}
Test(int id, String name, String gender){
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + id + ", Name=" + name + ", Gender=" + gender + "]";
	}
	
	

}
