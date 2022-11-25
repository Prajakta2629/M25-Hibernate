package org.tnsindia.onetooneunidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUnidirectionalDemo {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		Student s=new Student();
		s.setID(1001);
		s.setNAME("Prajakta");
		
		Student s1=new Student();
		s1.setID(1002);
		s1.setNAME("Tejal");
		
		Address a=new Address();
		a.setStreetNo(12);
		a.setArea("M G ROAD");
		a.setCity("Nashik");
		
		Address a1=new Address();
		a1.setStreetNo(15);
		a1.setArea("M ROAD");
		a1.setCity("Pune");
		
		s.setAddress(a);
		em.persist(s);
		
		s1.setAddress(a1);
		em.persist(s1);
		
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		f.close();
	}
}
