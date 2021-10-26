package com.taynandev.tutorial.ms.kafka.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.taynandev.tutorial.ms.kafka.data.OrderData;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SaveOrderService {

	@KafkaListener(topics = "SalvarPedido", groupId = "MicroserviceSaveOrder")
	private void execute(ConsumerRecord<String, String> record){

		log.info("Key = {}", record.key());
		log.info("Header = {}", record.headers());
		log.info("Partition = {}", record.partition());

		String stringData = record.value();

		ObjectMapper mapper = new ObjectMapper();
		OrderData orderData;

		try {
			orderData = mapper.readValue(stringData, OrderData.class);
		}
		catch (JsonProcessingException e) {
			log.error("Failed in the connvert event [data={}]", stringData, e);
			return;
		}

		log.info("Event received = {}", orderData);
	}
}
