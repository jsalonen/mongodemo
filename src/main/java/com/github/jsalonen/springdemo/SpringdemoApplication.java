package com.github.jsalonen.springdemo;

import com.github.jsalonen.springdemo.entity.Zone;
import com.github.jsalonen.springdemo.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdemoApplication implements CommandLineRunner {
	@Autowired
	private ZoneRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		repository.save(new Zone("kitchen"));

		System.out.println("Zones found with findAll():");
		System.out.println("-------------------------------");
		for (Zone zone : repository.findAll()) {
			System.out.println(zone);
		}
		System.out.println();

		System.out.println("Find by name (kitchen):");
		System.out.println(repository.findByName("kitchen"));
		System.out.println();
	}
}

