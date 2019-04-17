package com.example.propertiesdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class PropertiesDemoApplication implements CommandLineRunner{

	
	@Autowired
	EuroFeed euroFeed;
	
	@Autowired
	LiborFeed liborFeed;
	
	
	public static void main(String[] args) {
		SpringApplication.run(PropertiesDemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("euroFeed.getSymbol():"+euroFeed.getSymbol());
		System.out.println("euroFeed.getMessage():"+euroFeed.getMessage());
		
		
		System.out.println("liborFeed.getSymbol():"+liborFeed.getSymbol());
		System.out.println("liborFeed.getMessage():"+liborFeed.getMessage());
	}
	
	
}
