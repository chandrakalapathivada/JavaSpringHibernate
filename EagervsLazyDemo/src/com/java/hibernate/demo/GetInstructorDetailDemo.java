package com.java.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetInstructorDetailDemo {
	
	public static void main(String args[]) {
	
	SessionFactory factory=new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Instructor.class)
			.addAnnotatedClass(InstructorDetail.class)
			.buildSessionFactory();
	
	Session session=factory.getCurrentSession();
	
	try
	{
		session=factory.getCurrentSession();
		session.beginTransaction();
		
		int theid=2;
		
		InstructorDetail tempinstructorDetail=session.get(InstructorDetail.class, theid);
		
		System.out.println("tempinstuctor"+tempinstructorDetail);
		System.out.println("the associated instructor" +tempinstructorDetail.getInstructor());

		
		if(tempinstructorDetail!=null) {
		session.getTransaction().commit();
		
		}
	}
	catch(Exception exc)
	{
		exc.printStackTrace();
	}
	finally
	{
		session.close();
		factory.close();
	}

}

}