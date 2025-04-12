package com.qspider.jdbc.dao;

import com.qspider.dto.AadharCard;
import com.qspider.dto.Citizen;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CitizenDao {

	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	static EntityManager manager = factory.createEntityManager();
	static EntityTransaction transaction = manager.getTransaction();

	public static void createCitizen(int citizenzId, String name, String email, long contact) {
		Citizen c = new Citizen();
		c.setCitizenId(citizenzId);
		c.setName(name);
		c.setEmail(email);
		c.setPhoneNumber(contact);
		transaction.begin();
		manager.persist(c);
		transaction.commit();
	}

	public static Citizen findCitizen(int citizenId) {
		Citizen citizen = manager.find(Citizen.class, citizenId);
		return citizen;
	}

	public static void updateCitizen(int citizenId) {
	 	Citizen citizen = manager.find(Citizen.class, citizenId);
		if (citizen != null) {
			transaction.begin();
			citizen.setName("Ramesh");
			transaction.commit();
		} else {
			System.out.println("Invalid citizen Id");
		}
	}

	// create the method to print aadhar card detail based on citizen id

	public static void aadharDetail(int citizenId) {

		Citizen c = findCitizen(citizenId);
		AadharCard ad = c.getAadharCard();
		System.out.println(ad.getName());
		System.out.println(ad.getAadharId());
		System.out.println(ad.getDateOfBirth());

	}

	// update the mobile/phone number in aadharcarrd, table for the citizen having
	// name--> xyz ,and citizenId = Id
	public static void updateDetail(String name, int citizenId) {

		Citizen citizen = findCitizen(citizenId);
		AadharCard ad = citizen.getAadharCard();
		if (citizen.getName().equals(name)) {
			transaction.begin();
			ad.setPhoneNumber(9876543210l);
			System.out.println("success");
			transaction.commit();
		} else {
			System.out.println("Invalid...");
		}

	}

	public static void deleteCitizen(int citizenId) {
		Citizen citizen = manager.find(Citizen.class, citizenId);
		if (citizen != null) {
			transaction.begin();
			manager.remove(citizen);
			transaction.commit();
		} else {
			System.out.println("Invalid citizen Id");
		}

	}

}
