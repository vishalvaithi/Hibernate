package com.qspider.OneToOne2;

import com.dao.RegisterDao;
import com.dao.VehicleDao;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

    	
    	VehicleDao.createvehicle(1, "Maruti Swift", "9 L");
    	RegisterDao.createregno("MH12AB1234", 1);
    	
    	VehicleDao.createvehicle(2, "Hyundai Creta", "12 L");
    	RegisterDao.createregno("DL04XY5678", 2);
    	VehicleDao.createvehicle(3, "Honda City", "10 L");
    	RegisterDao.createregno("KA05JK9087", 3);
    	VehicleDao.createvehicle(4, "Tata Nexon", "17 L");
    	RegisterDao.createregno("TN10RT3344", 4);
    	VehicleDao.createvehicle(5, "Mahindra XUV300", "22 L");
    	RegisterDao.createregno("GJ01CD7788", 5);
    	
    }
}
