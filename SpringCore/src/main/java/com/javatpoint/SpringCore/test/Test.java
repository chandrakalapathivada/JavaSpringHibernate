package com.javatpoint.SpringCore.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javatpoint.SpringCore.DbConn;
import com.javatpoint.SpringCore.config.AppConfig;

public class Test {

	public static void main (String args[])
	{
		/*AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		ac.scan("com.javatpoint.SpringCore"); //scanning the spring bean 
		
		ac.refresh();
		
		Object ob = ac.getBean("con", DbConn.class);// read object and print
		//or
	//	DbConn db=(DbConn) ob; //downcasting 
		System.out.println(ob);*/
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Object ob = ac.getBean("con" ,DbConn.class);
		System.out.println(ob);
	}
}
