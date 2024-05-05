package com.jbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SupplierMicroservice {

	public static void main(String[] args) {
		SpringApplication.run(SupplierMicroservice.class, args);
		System.out.println("Started....");
	}

}
