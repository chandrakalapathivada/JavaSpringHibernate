package com.javatpoint.SpringCore;



class student implements Topic
{
	
	public void Undersatnd() {
		// TODO Auto-generated method stub
		System.out.println("yes");
		
	}

	public void result() {
		// TODO Auto-generated method stub
		System.out.println("no");
		
	}
	
	
}
public class Student
{
	public static void main(String args[])
	{
		Topic t=new student();
		t.Undersatnd();
		t.result();
	}
}