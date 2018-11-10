package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
   
		
		System.out.println("loading a bean ..");
		
		
		Doctor doctor = null;
		
		doctor=em.find(Doctor.class, 1);
		
		 
		 
		
		System.out.println(doctor);
		System.out.println(doctor.getQualification());
		em.close();
		factory.close();

	}

}
