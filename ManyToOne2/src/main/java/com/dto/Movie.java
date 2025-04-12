package com.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
	public class Movie {
		@Id
		private int movieId;
		private String movieName;
		private String genre;
		private String box_office;
		private int rating;
		@ManyToOne
		private Director dir;
		public int getMovieId() {
			return movieId;
		}
		public void setMovieId(int movieId) {
			this.movieId = movieId;
		}
		public String getMovieName() {
			return movieName;
		}
		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public String getBox_office() {
			return box_office;
		}
		public void setBox_office(String box_office) {
			this.box_office = box_office;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
		public Director getDir() {
			return dir;
		}
		public void setDir(Director dir) {
			this.dir = dir;
		}
	}


