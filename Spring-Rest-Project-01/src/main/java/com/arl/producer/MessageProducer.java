package com.arl.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component("producer")
public class MessageProducer {

	@Autowired
	private KafkaTemplate< String, String> template;
	
	@Value("${app.tpc.name}")
	private String topicName;
	
	// to send the message to al the subscribers
	public String sendMessage(String message) {
		template.send(topicName, message);
		return "Message Sent Succefully";
		}
}
