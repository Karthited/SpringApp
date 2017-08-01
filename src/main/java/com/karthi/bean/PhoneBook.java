package com.karthi.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class PhoneBook {

	private String firstname;

	private String email;

	private long phone;
	@DateTimeFormat(pattern = "mm/dd/yyyy")
	private Date dateOfBirth;

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
