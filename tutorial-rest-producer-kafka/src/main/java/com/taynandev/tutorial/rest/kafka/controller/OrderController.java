package com.taynandev.tutorial.rest.kafka.controller;

import com.taynandev.tutorial.rest.kafka.data.OrderData;
import com.taynandev.tutorial.rest.kafka.service.RegisterEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

	private final RegisterEventService registerEventService;

	@PostMapping("/save")
	public ResponseEntity<String> saveOrder(@RequestBody OrderData orderData){
		registerEventService.addEvent("SalvarPedido", orderData);
		return ResponseEntity.ok("Sucesso");
	}
}
