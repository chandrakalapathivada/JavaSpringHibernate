package com.java.springbootdemo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	
	@GetMapping("/")
	public String sayHello()
	{
		return "jkhksahdhashd hi hwllo jkjj "+LocalDateTime.now();
	}
	
	@GetMapping("/hello")
	public String getHelloo()
	{
		return "jkhksahdhashd hi hwllo jkjj ";
	}
	

}
