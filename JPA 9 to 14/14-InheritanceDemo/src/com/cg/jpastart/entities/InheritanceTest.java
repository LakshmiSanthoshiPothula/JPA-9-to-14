package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();
		employee.setName("John");
		employee.setSalary(5000);
		employee.setEmployeeId(1);
		em.persist(employee);
		
		//create one manager
		Manager manager = new Manager();
		manager.setEmployeeId(2);
		manager.setName("Trisha");
		manager.setSalary(8000);
		manager.setDepartmentName("Sales");
		em.persist(manager);
		//create one contract emp

		ContractEmployee ce=new ContractEmployee();
		ce.setEmployeeId(3);
		ce.setName("santhu");
		ce.setSalary(3000);
		ce.setDuration(40);
		ce.setExtendable(true);
		em.persist(ce);
		
		
		
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();
	}
}
