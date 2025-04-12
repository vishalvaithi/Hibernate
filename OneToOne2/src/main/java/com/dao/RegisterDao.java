package com.dao;

import com.dto.RegisterNo;
import com.dto.Vehicle;

public class RegisterDao implements JpaSteps{
	public static void createregno(String regno,int id)
	{
		RegisterNo rn=new RegisterNo();
		rn.setRegisterNo(regno);
		
		Vehicle v=manager.find(Vehicle.class,id);
		v.setRegister(rn);
		tr.begin();
		manager.persist(rn);
		tr.commit();
	}
	
	public static Vehicle find(int vId)
	{
		Vehicle v=manager.find(Vehicle.class,vId);
		return v;
	}
	public static void update(int vId)
	{
		Vehicle v=manager.find(Vehicle.class,vId);
		if(v!=null)
		{
			tr.begin();
			v.setVehicleName("Hero");
			tr.commit();
		}
		else
		{
			System.out.println("invalid vehicle id");
		}
	} 
	
	public static void delete(int vId)
	{
		Vehicle v=manager.find(Vehicle.class,vId);
		if(v !=null)
		{
			tr.begin();
			manager.remove(v);
			tr.commit();
		}
		else
		{
			System.out.println("invalid data");
		}
	}
}