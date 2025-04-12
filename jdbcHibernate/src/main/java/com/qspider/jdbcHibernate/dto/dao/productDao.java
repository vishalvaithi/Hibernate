package com.qspider.jdbcHibernate.dto.dao;

import com.qspider.jdbcHibernate.dto.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class productDao {

	public static void insert(int pId,String pName,double pPrice,int pQuantity) {
		
		Product product=new Product();
		product.setpId(pId);
		product.setpName(pName);
		product.setpPrice(pPrice);
		product.setpQuantity(pQuantity);
		
	 	EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(product);
		transaction.commit();
		
	}
	
	
	
}
