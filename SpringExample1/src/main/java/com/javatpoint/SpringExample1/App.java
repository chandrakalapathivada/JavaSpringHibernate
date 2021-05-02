package com.javatpoint.SpringExample1;

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
        Resource re=new ClassPathResource("com/javatpoint.SpringExample1/beans.xml");
        BeanFactory factory=new XmlBeanFactory(re);
        Employee eme=(Employee)factory.getBean("employee");
        eme.show();
        
    }
}
