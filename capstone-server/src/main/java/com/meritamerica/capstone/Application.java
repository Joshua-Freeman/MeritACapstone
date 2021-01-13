package com.meritamerica.capstone;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = "com.meritamerica.capstone.repository")
@EntityScan("com.meritamerica.capstone.models")
@SpringBootApplication
public class Application {
	
	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
