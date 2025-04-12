package com.dao;

import com.dto.Director;
import com.dto.Movie;

public class MovieDao implements JpaSteps{
	
	public static void createMov(int movieId,String movieName,String genre,String box_office,
			int rating,int Director_LNo)
	{
		Director dir=manager.find(Director.class,Director_LNo);
		Movie mov=new Movie();
		mov.setMovieId(movieId);
		mov.setMovieName(movieName);
		mov.setGenre(genre);
		mov.setBox_office(box_office);
		mov.setRating(rating);
		mov.setDir(dir);
	
		tr.begin();
		manager.persist(mov);
		tr.commit();
	}
	
	public static Movie findMovie(int MovieId) {
		Movie Movie = manager.find(Movie.class, MovieId);
		Director country = Movie.getDir();
		return Movie;	
	}

	public static void updateMovie(int MovieId) {
		Movie Movie = findMovie(MovieId);
		tr.begin();
		Movie.setMovieName("Leo");
		tr.commit();
	}
	
	public static void deleteMovie(int MovieId) {
		Movie Movie = findMovie(MovieId);
		tr.begin();
		manager.remove(Movie);
		tr.commit();
	}
	
}