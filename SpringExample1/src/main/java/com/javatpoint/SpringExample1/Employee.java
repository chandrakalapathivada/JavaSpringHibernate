package com.javatpoint.SpringExample1;

public class Employee {

	private String name;
	private int id;
	private Address adress;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	/*public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}


	public Employee(int id) {
		super();
		this.id = id;
	}


	public Employee(String name) {
		super();
		this.name = name;
	}*/


	void show()
	{
		System.out.println("Constructor injection");
		System.out.println(id+ " " +name);
		System.out.println(adress.toString());
		
	}


	


	public Employee(String name, int id, Address adress) {
		super();
		this.name = name;
		this.id = id;
		this.adress = adress;
	}
}
