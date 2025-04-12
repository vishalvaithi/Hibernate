package com.qspider.jdbcHibernate;

import com.qspider.jdbcHibernate.dto.dao.productDao;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	 	
    	
    	productDao.insert(102,"Mobile",15000, 5);
    	productDao.insert(103,"Mouse",1500, 8);
    	productDao.insert(104,"Keyboard",3000, 6);
    	productDao.insert(105,"Headset",1800, 3);
    	productDao.insert(106,"TV",25000, 5);

    		
 
    }
}
