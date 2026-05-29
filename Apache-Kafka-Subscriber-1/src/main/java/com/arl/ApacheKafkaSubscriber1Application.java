package com.arl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ApacheKafkaSubscriber1Application {

	public static void main(String[] args) {
		SpringApplication.run(ApacheKafkaSubscriber1Application.class, args);
	}

}
