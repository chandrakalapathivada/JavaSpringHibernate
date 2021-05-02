package com.java.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateInstructorDemo {
	
	public static void main(String args[]) {
	
	SessionFactory factory=new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Instructor.class)
			.addAnnotatedClass(InstructorDetail.class)
			.addAnnotatedClass(Course.class)
            .buildSessionFactory();
	
	Session session=factory.getCurrentSession();
	
	try
	{
		
		session.beginTransaction();
		
       //get the instructor form database
		
		int theId=1;
		
		Instructor tempInstructor=session.get(Instructor.class, theId);
		
		System.out.println(tempInstructor);
		
		System.out.println(tempInstructor.getCourses());
		
		session.getTransaction().commit();
		
		
	}
	finally
	{
		session.close();
		factory.close();
	}

}

}