package com.arl.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arl.helpers.MessageStore;
import com.arl.producer.MessageProducer;
import com.arl.subscriber.MessageSubscriber;

@RestController
@RequestMapping("/msg")
public class MessageController {

	@Autowired
	private MessageStore store;
	
	@Autowired
	private MessageSubscriber sub;
	
	@Autowired
	private MessageProducer prod;
	
	@GetMapping("/sendmsg")
	public ResponseEntity<?> sendMsg(@RequestParam String message) {
		String msg=prod.sendMessage(message);
     	return new ResponseEntity<String>(msg,HttpStatus.CREATED);

	}
	
	
	@GetMapping("/readall")
	public ResponseEntity<?> readAllMsg() {
		List<String> msgs=store.getAllMessage();
		return new ResponseEntity<List<String>>(msgs,HttpStatus.OK);
	}
}
