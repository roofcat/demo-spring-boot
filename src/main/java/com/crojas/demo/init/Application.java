package com.crojas.demo.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.crojas")
public class Application {
	
	
	public static void main( String [] args ) throws Exception {
		
		SpringApplication.run( Application.class, args );
		
	}
	
	
}
