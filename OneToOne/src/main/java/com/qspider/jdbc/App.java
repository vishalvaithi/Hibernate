package com.qspider.jdbc;

import com.qspider.jdbc.dao.CitizenDao;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {

//    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
//		
//    	AadharCard ac=new AadharCard();
//    	Citizen c=new Citizen();
//    	c.setAadharCard(ac);
//    	
//		CitizenDao.createCitizen(1, "Vishal", "vishalpk03@gmail.com", 8667702495l);
//		AadharCardDao.createAadhar(100, "Vishal", 8667702495l, "Chennai", "11-04-2003", 21, 1);
//
//		CitizenDao.createCitizen(2, "Hari", "hari3@gmail.com", 9643755214l);
//		AadharCardDao.createAadhar(101, "Hari", 9643755214l, "Chennai", "21-05-2003", 21, 2);
//
//		CitizenDao.createCitizen(3, "Ashwin", "ahwin@gmail.com", 9788234910l);
//		AadharCardDao.createAadhar(102, "Ashwin", 9788234910l, "Chennai", "1-01-2003", 22, 3);
//
//		CitizenDao.createCitizen(4, "Santhosh", "santhosh@gmail.com", 8144444898l);
//		AadharCardDao.createAadhar(103, "Santhosh", 8144444898l, "Chennai", "22-02-2003", 22, 4);
//
//		CitizenDao.createCitizen(5, "Kishore", "kishore@gmail.com", 8838295317l);
//		AadharCardDao.createAadhar(104, "Kishore", 8838295317l, "Chennai", "30-09-2003", 21, 5);
//
//		CitizenDao.createCitizen(6, "Ajay", "ajay@gmail.com", 9486203422l);
//		AadharCardDao.createAadhar(105, "Ajay", 9486203422l, "Chennai", "10-10-2003", 21, 6);

		//CitizenDao.aadharDetail(1);	
		//CitizenDao.updateDetail("Ramesh", 1);
		CitizenDao.deleteCitizen(6);

	}
}
