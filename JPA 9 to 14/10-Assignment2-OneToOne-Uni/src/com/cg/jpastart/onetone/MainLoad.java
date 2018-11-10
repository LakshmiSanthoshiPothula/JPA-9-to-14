package com.cg.jpastart.onetone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainLoad {
	public static void main(String[] args) {
		
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	FeesDetails feesDetails = em.find(FeesDetails.class, 1);
	System.out.println(feesDetails.getF_id()+feesDetails.getNoOfInstallments()+feesDetails.getTotalFees());
	Course course = em.find(Course.class, 1);
	System.out.println(course.getC_id()+course.getC_name()+course.getFeeDetails());
	}
}
