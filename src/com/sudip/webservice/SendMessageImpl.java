package com.sudip.webservice;
import javax.jws.WebService;

@WebService(endpointInterface="com.sudip.webservice.SendMessageInterface")
public class SendMessageImpl implements SendMessageInterface {

	@Override
	public String sendMessage(String msg) {
		return "Hey we are waiting for you " + msg + ". Please call asap.";
	}

}
