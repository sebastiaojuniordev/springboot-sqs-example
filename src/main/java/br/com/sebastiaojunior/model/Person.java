package br.com.sebastiaojunior.model;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 3826053923660860167L;

	private Integer id;
	
	private String fullName;
	
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fullName=" + fullName + ", email=" + email + "]";
	}
}
