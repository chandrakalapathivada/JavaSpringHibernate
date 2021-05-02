package com.java.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetInstructorCoursesDemo {
	
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
		// craete some courses
		
		Course tempcourse1=new Course("spring");
		Course tempcourse2=new Course("hiberante");
		
		//add courses to instructor
		tempInstructor.add(tempcourse1);
		tempInstructor.add(tempcourse2);
		// save the courses
		
		session.save(tempInstructor);
		session.getTransaction().commit();
		
		
	}
	finally
	{
		session.close();
		factory.close();
	}

}

}