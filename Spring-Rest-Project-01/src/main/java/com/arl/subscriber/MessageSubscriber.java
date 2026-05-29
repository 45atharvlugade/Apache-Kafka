package com.arl.subscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.arl.helpers.MessageStore;

@Component("subscriber")
public class MessageSubscriber {

	@Autowired
	private MessageStore store;
	
	@KafkaListener(topics = "${app.tpc.name}",groupId = "102")
	public void receiveMessage(String message) {
		System.out.println("MessageSubscriber.receiveMessage()");
		store.storeMessage(message);
	    System.out.println(message);
	}
	
}
