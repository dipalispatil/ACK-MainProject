package com.softech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan({"main.controllers", "main.repositories"})
//@EnableJpaRepositories("main.repositories")
@SpringBootApplication
public class AcknowledgementModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcknowledgementModuleApplication.class, args);
	}

}


