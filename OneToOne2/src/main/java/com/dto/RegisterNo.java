package com.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RegisterNo {

	@Id
	private String registerNo;

	public String getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}
}
