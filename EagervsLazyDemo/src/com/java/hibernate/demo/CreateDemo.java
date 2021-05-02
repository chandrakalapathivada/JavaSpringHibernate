package com.java.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {
	
	public static void main(String args[]) {
	
	SessionFactory factory=new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Instructor.class)
			.addAnnotatedClass(InstructorDetail.class)
			.buildSessionFactory();
	
	Session session=factory.getCurrentSession();
	
	try
	{
		
		session.beginTransaction();
		
		
Instructor instructor=new Instructor("chad","Darby", "darby@gmal.com");
		
		InstructorDetail instructorDetail =new InstructorDetail("youchannel","luv2code");
		
		session.save(instructor);
		session.save(instructorDetail);
		System.out.println("saving instructor");
		
		session.getTransaction().commit();
		
		
	}
	finally
	{
		session.close();
	}

}

}