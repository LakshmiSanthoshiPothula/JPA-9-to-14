package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		ContractEmployee con=new ContractEmployee();
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		Employee employee=null;
		employee =em.find(Employee.class,3);
		System.out.println(employee);
		System.out.println(employee instanceof Employee);
		System.out.println(employee instanceof Manager);
		System.out.println(employee instanceof ContractEmployee);
		if(employee instanceof Manager){
			Manager m=(Manager) employee;//down cast
			System.out.println(m.getDepartmentName());
			System.out.println(m.getEmployeeId());
			System.out.println(m.getName());
			System.out.println(m.getSalary());
		}
		if(employee instanceof ContractEmployee){
			ContractEmployee ce=(ContractEmployee)employee;
			System.out.println(ce.getEmployeeId());
			System.out.println(ce.getName());
			System.out.println(ce.getSalary());
			System.out.println(ce.getDuration());
		
	
			
		}
		em.close();
		emf.close();
	}

}
