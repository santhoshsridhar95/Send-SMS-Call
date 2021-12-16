package com.communication.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class MessageService {

//	@Value("${twilio.account.from-number}")
//	private String fromNumber;
//	
//	@Value("${twilio.account.to-number}")
//	private String toNumber;
	@Value("${twilio.account.sid:AC2c18207cfd030e2107cf3d0a0a371c85}")
	private static String ACCOUNT_SID="AC2c18207cfd030e2107cf3d0a0a371c85";
	
	@Value("${twilio.account.authToken:863dc4ca1d6e14c922900f6b9fe128df}")
	private static String AUTH_TOKEN="863dc4ca1d6e14c922900f6b9fe128df";
	
	static {
	      Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	   }
	
	public Message sendMessage(String toNumber, String fromNumber)
	{
		 return Message
				 .creator(new PhoneNumber(fromNumber), new PhoneNumber(toNumber),
		         "Message from Spring Boot Application")
				 .create();
	}
}
