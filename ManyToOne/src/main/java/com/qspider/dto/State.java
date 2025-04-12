package com.qspider.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class State {
	
	@Id
	private int sId;
	private String sName;
	private String sCM;
	private String sLanguage;
	private String sPopulation;
	@ManyToOne
	private Country country;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCM() {
		return sCM;
	}
	public void setsCM(String sCM) {
		this.sCM = sCM;
	}
	public String getsLanguage() {
		return sLanguage;
	}
	public void setsLanguage(String sLanguage) {
		this.sLanguage = sLanguage;
	}
	public String getsPopulation() {
		return sPopulation;
	}
	public void setsPopulation(String sPopulation) {
		this.sPopulation = sPopulation;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country1) {
		this.country = country1;
	}

}
