package com.qspider.ManyToOne;
import com.qspider.dao.CountryDao;
import com.qspider.dao.StateDao;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

    	CountryDao.createCountry(1, "India", "Vishal", "Delhi", "1.5b");
    	StateDao.createState(1, "Chennai", "Vijay","Tamil", "8c", 1);
    
//    	CountryDao.updateCountry(1);
//    	System.out.println(CountryDao.findCountry(1).getPopulation());
//    
//    	StateDao.updateState(1);
//    	System.out.println(StateDao.findState(1).getsName());
//    
//   	CountryDao.deleteCountry(1);
//    	StateDao.deleteState(1);
    	
    }
}
