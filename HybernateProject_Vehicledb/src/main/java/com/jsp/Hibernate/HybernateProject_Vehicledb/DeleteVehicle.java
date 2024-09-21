package com.jsp.Hibernate.HybernateProject_Vehicledb;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class DeleteVehicle {


				    public static void main( String[] args )
				    {
				     	
				   	//Hibernate Structure
				        Configuration cfg = new Configuration().configure().addAnnotatedClass(Vehicle.class);
				        SessionFactory sf = cfg.buildSessionFactory();
				        Session session = sf.openSession();
				        Transaction tran = session.beginTransaction();
				        
				        Vehicle vehicle = session.get(Vehicle.class,101);
				     
				        
				        session.delete(vehicle);
				        
				        tran.commit();
				        session.close();
				        sf.close();
				    }
				}
