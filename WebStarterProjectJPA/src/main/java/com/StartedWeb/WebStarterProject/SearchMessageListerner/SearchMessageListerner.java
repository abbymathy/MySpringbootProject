package com.StartedWeb.WebStarterProject.SearchMessageListerner;

import javax.jms.Message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class SearchMessageListerner {
	
	@JmsListener(destination = "in.search")
	@SendTo("out.search")
	public String recieveSearchMsg(Message jsonMessage) {
		System.out.println(jsonMessage);
		return "Sucessfully returned";
	}

}
