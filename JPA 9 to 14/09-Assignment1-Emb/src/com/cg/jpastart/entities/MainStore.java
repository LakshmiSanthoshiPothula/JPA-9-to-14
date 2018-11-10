package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
   
		
		System.out.println("creating a bean ..");
		Qualification qualification=new Qualification("MBBS", 10);
		
		Doctor doctor = new Doctor();
		
		doctor.setName("santhu");
		doctor.setFees(30000);
		doctor.setQualification(qualification);
	    em.getTransaction().begin();
		em.persist(doctor); 
		em.getTransaction().commit(); 
		
		System.out.println("Added one doctor to database.");
		em.close();
		factory.close();
	}

}
