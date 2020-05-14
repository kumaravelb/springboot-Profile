package com.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.profiles.service.RequiredClass;

@SpringBootApplication
public class SpringbootProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProfileApplication.class, args);
	}

	/*
	 * @Autowired private RequiredClass requiredclass;
	 * 
	 * @Override public void run(String... args) throws Exception {
	 * System.out.println("conditional on class running"+requiredclass.getClass());
	 * }
	 */

}
