package com.Cars.Carsbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CarsbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsbackendApplication.class, args);
	}

}
