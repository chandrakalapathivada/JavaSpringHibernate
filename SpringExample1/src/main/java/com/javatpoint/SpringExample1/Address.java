package com.javatpoint.SpringExample1;

public class Address {

	private String street;
	private String state;
	public Address(String street, String state) {
		super();
		this.street = street;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", state=" + state + "]";
	}
	
	}
