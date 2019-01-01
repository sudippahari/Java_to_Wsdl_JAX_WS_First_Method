package com.sudip.webservice;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface SendMessageInterface {

	@WebMethod
	public String sendMessage(String msg);
}
