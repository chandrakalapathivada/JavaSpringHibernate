package com.javatpoint.SpringCore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("con")
public class DbConn {
	//@Value("OracleDriver")// dircet value /static value 
	@Value("${code}") //reading values from spring container//environmet memory
    private String driver;
    @Value("${url}")
	//@Value("jdbc:oracle")
    private String url;
	@Override
	public String toString() {
		return "DbConn [driver=" + driver + ", url=" + url + "]";
	}

	public DbConn()
	{
	 System.out.println("DB_CONNECTION");
	}
}
