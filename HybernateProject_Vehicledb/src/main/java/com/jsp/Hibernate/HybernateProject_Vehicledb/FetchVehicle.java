package com.jsp.Hibernate.HybernateProject_Vehicledb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchVehicle {
	 public static void main( String[] args )
	    {
	     	
	   	//Hibernate Structure
	        Configuration cfg = new Configuration().configure().addAnnotatedClass(Vehicle.class);
	        SessionFactory sf = cfg.buildSessionFactory();
	        Session session = sf.openSession();
	        Transaction tran = session.beginTransaction();
	        
	        Vehicle vehicle = session.get(Vehicle.class,103);
	        System.out.println(vehicle.getVehicleId());
	        System.out.println(vehicle.getVehicleName());
	        System.out.println(vehicle.getVehicleBrand());
	        System.out.println(vehicle.getVehiclePrice());
	        
	        tran.commit();
	        session.close();
	        sf.close();
	    }
}
