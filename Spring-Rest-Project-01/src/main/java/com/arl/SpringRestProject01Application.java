package com.arl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringRestProject01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestProject01Application.class, args);
	}

}
