package com.sourav.Vehicle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sourav.Vehicle.inheritance.Aeroplane;
import com.sourav.Vehicle.inheritance.Bus;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vehicles_pu");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Bus b1 = new Bus(101, "Heavy Vehicle","Blue", "AC", 50,"Maharashtra","Karnataka");
		Bus b2 = new Bus(102,"Heavy Vehicle","Red","Non-AC", 55,"Maharashtra","Goa");
		
		Aeroplane a1 = new Aeroplane(103,"Air Carrier","White","Air India",100,4000);
		Aeroplane a2 = new Aeroplane(104,"Air Carrier","Red","Kingfisher",150,5000);
		
		
		    em.persist(b1);  
		    em.persist(b2);  
		      
		    em.persist(a1);  
		    em.persist(a2); 

		em.getTransaction().commit();

		em.close();
		emf.close();
    }
}
