package com.dao;

import com.dto.Movie;

public class Moviedao implements JpaSteps{
	public static void createMovie(int movieId,String title,String genre,String releaseYear) {
		Movie mov = new Movie();
		mov.setMovieId(movieId);
		mov.setTitle(title);
		mov.setGenre(genre);
		mov.setReleaseYear(releaseYear);
		
		tr.begin();
		manager.persist(mov);
		tr.commit();
	}
	
	public static Movie findMovie(int movieId) {
		return manager.find(Movie.class, movieId);
	}
	
	public static void updateMovie(int movieId) {
		Movie mov = findMovie(movieId);
		tr.begin();
		mov.setTitle("Leo");
		tr.commit();
		System.out.println("Updated Successfully");

	}
	
	public static void deleteMovie(int movieId) {
		Movie mov = findMovie(movieId);
		tr.begin();
		manager.remove(mov);
		tr.commit();
		System.out.println("deleted Successfully");

	}
}