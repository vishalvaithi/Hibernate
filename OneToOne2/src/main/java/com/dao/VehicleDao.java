package com.dao;

import com.dto.Vehicle;

public class VehicleDao implements JpaSteps{
	public static void createvehicle(int id,String name,String price)
	{
		Vehicle v=new Vehicle();
		v.setVehicleId(id);
		v.setVehicleName(name);
		v.setPrice(price);
		tr.begin();
		manager.persist(v);
		tr.commit();
	}
}