package com.java.SpringRest;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class Driver 
{
    public static void main( String[] args )
    {
        try
        {
        	ObjectMapper mapper=new ObjectMapper();
        	
        //	Student theStudent=mapper.readValue(new File("data/sample-lite.json"), Student.class);
        	
        	Student theStudent=mapper.readValue(new File("data/sample-full.json"), Student.class);
        	
        	System.out.println("First Name:"+theStudent.getFirstName());
        	
        	System.out.println("Last Name:"+theStudent.getLastName());

        	System.out.println("status:"+theStudent.isActive());

        	System.out.println("status:"+theStudent.getAddress().getCity());
        	
        	for(String tempLang :theStudent.getLanguages()) {

        	System.out.println(tempLang);
        	}
        	
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
}
