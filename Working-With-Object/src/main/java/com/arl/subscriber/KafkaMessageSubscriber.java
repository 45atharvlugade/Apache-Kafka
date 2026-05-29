package com.arl.subscriber;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.arl.model.IndianFestival;

@Component("subscriber")
public class KafkaMessageSubscriber {

	private IndianFestival festival;
	
	@KafkaListener(topics="${app.tpc.name}",groupId = "grp1")
	public void readMessage(IndianFestival festival) {
		this.festival=festival;
		System.out.println(festival.toString());
	}
	
	public IndianFestival getCurrentMessage() {
		return festival;
	}
}
