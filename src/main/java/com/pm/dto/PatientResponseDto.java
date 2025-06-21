package com.pm.dto;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class PatientResponseDto {
 
	private String id;
	private String name;
	private String email;
	private String address;
	private String dateOfBirth;
	private String registeredDate;
	
	
	public PatientResponseDto() {
		super();

	}


	public PatientResponseDto(String id, String name, String email, String address, String dateOfBirth,
			String registeredDate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.registeredDate = registeredDate;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getRegisteredDate() {
		return registeredDate;
	}


	public void setRegisteredDate(String registeredDate) {
		this.registeredDate = registeredDate;
	}
	
	
}
