package com.jsp.Hibernate.HybernateProject_Vehicledb;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Vehicle vehicle = new Vehicle();
    	vehicle.setVehicleId(103);
    	vehicle.setVehicleName("Classic 350");
    	vehicle.setVehicleBrand("Royal Enfield");
    	vehicle.setVehiclePrice(250000);
    	
    	
    	//Hibernate Structure
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Vehicle.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tran = session.beginTransaction();
        
        session.save(vehicle);
        
        tran.commit();
        session.close();
        sf.close();
    }
}