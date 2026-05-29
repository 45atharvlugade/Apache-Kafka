package com.arl.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.arl.model.IndianFestival;

import lombok.Data;

@Component("sender")
@Data
public class MessageSender {

	@Autowired
	private KafkaTemplate<String, IndianFestival> template;
	
	@Value("${app.tpc.name}")
	private String topicName;
	
	public String sendMessage(IndianFestival festival) {
		template.send(topicName,festival);
		return "Message Sent";
	}
}
