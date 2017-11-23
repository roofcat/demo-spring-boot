package com.crojas.demo.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class User {

	@NotNull(message = "no puede ser nulo")
	@NotBlank(message = "no puede is en blanco")
	private String userId;

	@NotNull(message = "no puede ser nulo")
	@NotEmpty(message = "no puede ser vacío")
	private String userName;

	@NotNull(message = "no puede ser nulo")
	private String gender;

	@NotNull(message = "no puede ser nulo")
	private Boolean married;

	@NotNull(message = "no puede ser nulo")
	private String profile;

	public User() {
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getMarried() {
		return married;
	}

	public void setMarried(Boolean married) {
		this.married = married;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

}
