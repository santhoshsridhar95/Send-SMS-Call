package com.communication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.communication.services.MessageService;

@RestController
public class CommunicationController {

	@Autowired
	MessageService messageService;
	
	@PutMapping("/messages")
	void sendMessage(@RequestParam String fromNumber, @RequestParam String toNumber)
	{
		messageService.sendMessage(toNumber, fromNumber);
	}
}
