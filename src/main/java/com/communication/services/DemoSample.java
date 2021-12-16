package com.communication.services;

import com.twilio.rest.api.v2010.account.Message;

public class DemoSample {

	public static void main(String[] args) {
		MessageService messageService = new MessageService();
		
		Message message = messageService.sendMessage("8217697857", "+16064025157");
		System.out.println("Message Status is" + message.getStatus());
		System.out.println("Message sent");
	}
}
