package com.cbx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("ahead native");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("master add");
		System.out.println("ahead native");




		

	}

}
