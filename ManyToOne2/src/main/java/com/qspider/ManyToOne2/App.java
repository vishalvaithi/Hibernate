package com.qspider.ManyToOne2;

import com.dao.DirectorDao;
import com.dao.MovieDao;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

//    	DirectorDao.createDir(11,"Christopher Nolan", "America",24);
//    	DirectorDao.createDir(22,"Zack Znyder", "British",17);
//    	DirectorDao.createDir(33,"Mani Ratnam", "India",13);
//    	DirectorDao.createDir(44,"Vetri Maaran", "India",19);
//    	DirectorDao.createDir(55,"Mike Leigh", "Europe",11);
    	
    	MovieDao.createMov(1, "Vaadivasal", "Drama","200 cr", 7, 44);
    	MovieDao.createMov(2, "Hard Truth", "Drama","75 cr", 6, 55);
    	MovieDao.createMov(3, "Opphenheimer", "SciFi","1500 cr", 9, 11);
    	MovieDao.createMov(4, "300 Spartans", "Action","600 cr", 8, 22);
    	MovieDao.createMov(5, "Naked", "Thriller,Drama","270 cr", 7, 55);
    	MovieDao.createMov(6, "Interstellar", "Scifi","1700 cr", 9, 11);
    	MovieDao.createMov(7, "Thalapathy", "Action,Drama","75 cr", 9, 33);
    	MovieDao.createMov(8, "Thug Life", "Thriller,Action","550 cr", 9, 33);
    	MovieDao.createMov(9, "The Dark Knight", "SuperHero","900 cr", 8, 11);
    	MovieDao.createMov(10, "Vada Chennai", "Action,Drama","200 cr", 9, 44);
    	MovieDao.createMov(11, "Man of Steel", "Action","800 cr", 8, 22);
    	
    	
    }
}
