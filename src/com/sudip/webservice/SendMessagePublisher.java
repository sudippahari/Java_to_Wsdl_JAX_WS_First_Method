package com.sudip.webservice;
import javax.xml.ws.Endpoint;

public class SendMessagePublisher {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:8008/sendMsg", new SendMessageImpl());
	}

}
