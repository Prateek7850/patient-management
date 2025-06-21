package com.pm.dto;
import com.pm.validator.CreatePatientValidator;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class PatientRequestDTO {
    
	@NotBlank(message="Name should not be blank")
	@Size(max=100,message="Size of name should not be more than 100")
	private String name;
	
	@NotBlank(message="Email should not be blank")
	@Email(message="Enter valid email")
	private String email;
	
	@NotBlank(message="Address should not be blank")
	private String address;
	
	@NotBlank(message="DOB should not be blank")
	private String dateOfBirth;
	
	@NotNull(groups = CreatePatientValidator.class, message="Registered date can't be null")
	private String registeredDate;
	
	
	public PatientRequestDTO() {
		super();
	}

	public PatientRequestDTO(
			@NotBlank(message = "Name should not be blank") @Size(max = 100, message = "Size of name should not be more than 100") String name,
			@NotBlank(message = "Email should not be blank") @Email(message = "Enter valid email") String email,
			@NotBlank(message = "Address should not be blank") String address,
			@NotBlank(message = "DOB should not be blank") String dateOfBirth,
			/**@NotNull(message = "Registered date can't be null")**/ String registeredDate) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.registeredDate = registeredDate;
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
