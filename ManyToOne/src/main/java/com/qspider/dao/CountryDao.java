package com.qspider.dao;

import com.qspider.dto.Country;

public class CountryDao implements JpaSteps {
	
	public static void createCountry(int countryId,String name,String president,String capital,String population) {
		
		Country c=new Country();
		c.setcId(countryId);
		c.setName(name);
		c.setPresident(president); 
		
		tr.begin();
		manager.persist(c);
		tr.commit();
		System.out.println("Success");
		
	}
	 
	public static Country findCountry(int countryId) {
		return manager.find(Country.class, countryId); 
	}
	
	public static void updateCountry(int countryId) {
		Country country = findCountry(countryId);
		tr.begin();
		country.setPopulation("1.5B");
		tr.commit();
	}
	
	public static void deleteCountry(int countryId) {
		Country country = findCountry(countryId);
		tr.begin();
		manager.remove(country);
		tr.commit();
	}

}
