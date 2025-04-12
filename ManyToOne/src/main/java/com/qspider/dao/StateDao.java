package com.qspider.dao;

import com.qspider.dto.Country;
import com.qspider.dto.State;

public class StateDao  implements JpaSteps {
	
	public static void createState(int stateId,String name,String CM,String language,String population,int cId) {
		
	Country country = manager.find(Country.class, cId);
		
		State s=new State();
		s.setsId(stateId);
		s.setsName(name);
		s.setsCM(CM);
		s.setsLanguage(language);
		s.setsPopulation(population);
		s.setCountry(country);
		tr.begin();
		manager.persist(s);
		tr.commit();
		
	}

	public static State findState(int stateId) {
		State state = manager.find(State.class, stateId);
		Country country = state.getCountry();
		return state;	
	}

	public static void updateState(int stateId) {
		State state = findState(stateId);
		tr.begin();
		state.setsName("TN");
		tr.commit();
	}
	
	public static void deleteState(int stateId) {
		State state = findState(stateId);
		tr.begin();
		manager.remove(state);
		tr.commit();
	}
	
	
}
