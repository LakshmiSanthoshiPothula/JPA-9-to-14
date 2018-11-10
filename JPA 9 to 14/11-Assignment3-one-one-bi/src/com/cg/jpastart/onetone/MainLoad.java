package com.cg.jpastart.onetone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainLoad {
	public static void main(String[] args) {
		
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	FeesDetails feeDetails = em.find(FeesDetails.class, 1);
	System.out.println(feeDetails.getNoOfInstallments()+feeDetails.getTotalFees()+feeDetails.getCourses().getC_name());
	Course course = em.find(Course.class, 1);
	System.out.println(course.getFeeDetails().getNoOfInstallments()+course.getFeeDetails().getTotalFees());
	}
}
