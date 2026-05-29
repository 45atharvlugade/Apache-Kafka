package com.arl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class WorkingWithObjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkingWithObjectApplication.class, args);
	}

}
