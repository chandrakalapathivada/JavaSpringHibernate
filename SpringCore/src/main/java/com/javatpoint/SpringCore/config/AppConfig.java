package com.javatpoint.SpringCore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("basepackages = com.javatpoint.SpringCore")
//loading properties into the container
@PropertySource("classpath:app.properties")
public class AppConfig {
	

	
}
