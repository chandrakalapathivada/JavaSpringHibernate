package com.java.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {
	
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
		
	/*	Instructor instructor=new Instructor("chad","Darby", "darby@gmal.com");
		
		InstructorDetail instructorDetail =new InstructorDetail("youchannel","luv2code");
	*/	
	
	
		session.beginTransaction();
		
		int theid=1;
		Instructor tempIntstructor=session.get(Instructor.class, theid);
		 
		if(tempIntstructor !=null)
		{
			session.delete(tempIntstructor);
		}
		
		System.out.println("delete instructor");
		
        
		
		session.getTransaction().commit();
		
		
	}
	finally
	{
		session.close();
	}

}

}