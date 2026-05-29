package com.arl.helpers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("store")
public class MessageStore {

	private List<String> store;
	
	public MessageStore() {
		// TODO Auto-generated constructor stub
		store=new ArrayList<String>();
		System.out.println("MessageStore.MessageStore()");
	}
	
	public void storeMessage(String msg) {
		store.add(msg);
		System.out.println("msg stored Successfully");
	}
	
	public List<String> getAllMessage() {
		return store;
	}
}
