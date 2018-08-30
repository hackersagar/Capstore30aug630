package com.cg.capstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan("com.cg.capstore.bean")
@EnableJpaRepositories("com.cg.capstore")
@ComponentScan("com.cg.capstore")
@SpringBootApplication
public class CapstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapstoreApplication.class, args);
	}
}
