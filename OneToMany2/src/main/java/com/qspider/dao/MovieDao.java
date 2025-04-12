package com.qspider.dao;

import java.util.ArrayList;
import java.util.List;

import com.qspider.dto.Director;
import com.qspider.dto.Movie;

public class MovieDao implements JpaSteps{
	
	public static void createMov(int movieId,String movieName,String genre,String box_office,int rating,int Director_LNo)
	{
		Director Dir=manager.find(Director.class,Director_LNo);
		Movie mov=new Movie();
		mov.setMovieId(movieId);
		mov.setMovieName(movieName);
		mov.setGenre(genre);
		mov.setBox_office(box_office);
		mov.setRating(rating);
		mov.setDirector(Dir);

		/*List<Movie>ListofDir=Dir.getDirectorList();
		if(ListofDir != null)
		{
			ListofDir.add(mov);
		}
		else
		{
			ListofDir=new ArrayList<Movie>();
			ListofDir.add(mov);
		}
		System.out.println(ListofDir);
		Dir.setDirectorList(ListofDir);
		*/
		tr.begin();
		manager.persist(mov);
		tr.commit();
		System.out.println("Success");
	}
}
