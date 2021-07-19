package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Hotel;

@SpringBootApplication
public class HotelInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelInfoServiceApplication.class, args);
	}

	@Bean 
	public Hotel sagar() {
		return new Hotel(101,"Krishna Sagar", "marathalli");
	}
	
	@Bean 
	public Hotel sangeetha() {
		return new Hotel(102,"Hotel Sangeetha", "Chennai");
	}
	
	@Bean 
	public Hotel nandani () {
		return new Hotel(103,"Hotel Nandani", "Hyedrabad");
	}
	
	
}
