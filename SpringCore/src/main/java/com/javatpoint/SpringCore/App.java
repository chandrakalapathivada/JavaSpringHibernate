package com.javatpoint.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Car car=new Car(); need to change this object everytime, we are looking for a change.
    	//we achieve loose coupling by using interface.
    	//But spring provides dependency injection concept, to inject the dependencies in run time.
    	// BeanFactory and ApplicationContext containers will provide beans in runtime.
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	//Vehicle v=(Vehicle)context.getBean("car");
       // v.drive();
		Car c=(Car)context.getBean("car");
		c.drive();
        /*Tyre t=(Tyre)context.getBean("tyre");
        System.out.println(t);*/
		
    }
}
