package com.taynandev.tutorial.rest.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class JavaSpringKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringKafkaApplication.class, args);
	}

}
