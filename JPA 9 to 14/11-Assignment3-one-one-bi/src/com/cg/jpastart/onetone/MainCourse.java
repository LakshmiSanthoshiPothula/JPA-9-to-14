package com.cg.jpastart.onetone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Course course = new Course();
		course.setC_name("cp");
		FeesDetails feeDetails = new FeesDetails();
		feeDetails.setNoOfInstallments(1);
		feeDetails.setTotalFees(50002.0);
		course.setFeeDetails(feeDetails);
		em.persist(course);
        em.getTransaction().commit();
		
		System.out.println("Added to database");
		em.close();
		factory.close();
	}

}
