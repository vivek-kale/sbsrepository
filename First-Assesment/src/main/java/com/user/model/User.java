package com.user.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="userinfo")
public class User  {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String username;

	String firstname;
	String lastname;
	String role;
	String mngrid;
	
	public User()
	{}
	

	public User(int id, String username, String firstname, String lastname, String role, String mngrid) {
		super();
		this.id = id;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.role = role;
		this.mngrid = mngrid;
	}


//
//	public User(String lastname, String username, String firstname,int id) {
//		super();
//		this.id = id;
//		this.username = username;
//		this.firstname = firstname;
//		this.lastname = lastname;
//	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
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
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMngrid() {
		return mngrid;
	}

	public void setMngrid(String mngrid) {
		this.mngrid = mngrid;
	}

	

	

}
