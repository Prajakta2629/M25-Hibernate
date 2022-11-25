package org.tnsindia.bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyBidirectionalDemo {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();

		
		Department department=new Department();
		department.setId(12121);
		department.setName("HR");
		
		Department department1=new Department();
		department1.setId(12122);
		department1.setName("MARKETING");
		
		Employee emp=new Employee();
		emp.setEmp_id(123);
		emp.setEmp_name("Prajakta");
		emp.setSalary(50500);
		
		Employee emp1=new Employee();
		emp1.setEmp_id(124);
		emp1.setEmp_name("Trjal");
		emp1.setSalary(50501);
		
		
		emp.setDepartment(department);		
		em.persist(emp);
		
		emp1.setDepartment(department1);
		em.persist(emp1);
		
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		f.close();
	}

}
