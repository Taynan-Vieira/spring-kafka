package com.taynandev.tutorial.ms.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class TutorialMsKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialMsKafkaApplication.class, args);
	}

}
