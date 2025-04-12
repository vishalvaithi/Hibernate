package com.qspider.jdbc.dao;

import com.qspider.dto.AadharCard;
import com.qspider.dto.Citizen;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AadharCardDao {

	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	static EntityManager manager = factory.createEntityManager();
	static EntityTransaction transaction = manager.getTransaction();

	public static void createAadhar(int aadharId, String name, long phoneNum, String address, String dateOfBirth,
			int age, int citizenId) {

		AadharCard a = new AadharCard();
		a.setAadharId(aadharId);
		a.setName(name);
		a.setPhoneNumber(phoneNum);
		a.setAddress(address);
		a.setAge(age);
		a.setDateOfBirth(dateOfBirth);

		Citizen c = manager.find(Citizen.class, citizenId);
		c.setAadharCard(a);
		transaction.begin();
		manager.persist(a);
		transaction.commit();
	}


	
}
