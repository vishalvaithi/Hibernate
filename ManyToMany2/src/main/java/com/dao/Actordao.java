package com.dao;

import java.util.List;
import java.util.Scanner;

import com.dto.Actor;
import com.dto.Movie;

public class Actordao implements JpaSteps {
	public static void createActor(int actorId, String actorName, int age, String nationality) {
		Scanner scn = new Scanner(System.in);
		Actor act = new Actor();
		act.setActorId(actorId);
		act.setActorName(actorName);
		act.setAge(age);
		act.setNationality(nationality);
		List<Movie> list = act.getMovies();
		System.out.println("enter no of Movies :");
		int n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter Movie Id :");
			Movie mov = manager.find(Movie.class, scn.nextInt());
			list.add(mov);
		}
		act.setMovies(list);
		tr.begin();
		manager.persist(act);
		tr.commit();
		System.out.println("Inserted Successfully");
	}
	
	public static Actor findActor(int actorId) {
		return manager.find(Actor.class, actorId);
	}
	
	public static void updateActor(int actorId) {
		Actor act = findActor(actorId);
		tr.begin();
		act.setActorName("Vijay");
		tr.commit();
		System.out.println("Updated Successfully");
		
	}
	
	public static void deleteActor(int actorId) {
		Actor act = findActor(actorId);
		tr.begin();
		manager.remove(act);
		tr.commit();
		System.out.println("deleted Successfully");
		
	}
}
