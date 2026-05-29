package com.arl.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arl.model.IndianFestival;
import com.arl.publisher.MessageSender;
import com.arl.subscriber.KafkaMessageSubscriber;

@RestController
@RequestMapping("/rest")
public class KafkaMessageOperationController {

	@Autowired
	private MessageSender sender;
	
	@Autowired
	private KafkaMessageSubscriber sub; 
	
	@PostMapping("/send")
	public ResponseEntity<String> pushMessage(@RequestBody IndianFestival festival){
		String msg=sender.sendMessage(festival);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/read")
	public ResponseEntity<IndianFestival>  readMessage(){
		
		return new ResponseEntity<IndianFestival>(sub.getCurrentMessage(),HttpStatus.OK);
	}
}
