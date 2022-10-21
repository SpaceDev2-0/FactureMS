package com.esprit.microservice;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.esprit.microservice.Entity.Facture;
import com.esprit.microservice.Repository.FactureRepository;
@EnableEurekaClient
@SpringBootApplication
public class FactureMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactureMSApplication.class, args);
	}

	
	@Bean
	 ApplicationRunner init(FactureRepository repository){
		return args ->{
			Stream.of("Movenpick","Regency","hammamet").forEach(nom ->{
				repository.save(new Facture(nom));
			});
			repository.findAll().forEach(System.out::println);
		};
	}
}
