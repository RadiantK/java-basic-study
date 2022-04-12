package com.nonsense.entity;

import java.time.LocalDateTime;

import com.nonsense.exception.WrongPasswordException;

public class User {
	private String id;
	private String password;
	private String name;
	private String eamil;
	private LocalDateTime regDate;

	public User(String id, String password, String name, String eamil, LocalDateTime regDate) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.eamil = eamil;
		this.regDate = regDate;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}

	public void changePassword(String currPassword, String newPassword) {
		if(!password.equals(currPassword)) {
			throw new WrongPasswordException();
		}
		
		this.password = newPassword;
	}
	
}
