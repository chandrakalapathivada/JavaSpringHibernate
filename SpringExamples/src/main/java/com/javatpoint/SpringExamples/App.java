package com.javatpoint.SpringExamples;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Resource re = new ClassPathResource("com/javatpoint/SpringExamples/spring.xml");
        BeanFactory factory=new XmlBeanFactory(re);
        
        Student s=(Student)factory.getBean("studentbean");
        s.displayinfo();
    }
}
 