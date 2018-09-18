package com.udemy.rest.webservices.restfulwebservices.user;

import java.util.Date;

import javax.xml.crypto.Data;

public class User {
	private Integer id;
	private String name;
	private Date dateOfBirth;

	public User(Integer id, String name, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s, dateOfBirth=%s]", id, name, dateOfBirth);
	}
}
