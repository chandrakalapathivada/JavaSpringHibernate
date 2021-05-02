package com.java.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCoursesDemo {
	
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
		
		int theId=10;
		
		Course tempCourse=session.get(Course.class, theId);
		// craete some courses
		session.delete(tempCourse);
		
		// save the courses /
		session.getTransaction().commit();
		
		
	}
	finally
	{
		session.close();
		factory.close();
	}

}

}