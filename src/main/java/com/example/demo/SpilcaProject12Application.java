package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"controllers"})
public class SpilcaProject12Application {

	public static void main(String[] args) {
		SpringApplication.run(SpilcaProject12Application.class, args);
	}

}
