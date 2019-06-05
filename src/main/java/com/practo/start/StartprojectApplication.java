package com.practo.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller","service", "repository"})
@EntityScan(basePackages = {"com.practo.model"})
public class StartprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartprojectApplication.class, args);
	}

}
