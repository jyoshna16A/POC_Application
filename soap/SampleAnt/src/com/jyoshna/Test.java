package com.jyoshna;


import java.net.InetAddress;
import java.net.UnknownHostException;

import com.service.AttachmentService;
import com.service.AttachmentServiceImpl;
import com.service.ImageServiceImpl;

import jakarta.xml.ws.Endpoint;
import jakarta.xml.ws.WebServiceClient;
@WebServiceClient
public class Test {
	public static void main(String[] args) throws UnknownHostException {
		
		 InetAddress address1 = InetAddress.getLocalHost();
	     String ipAddress = address1.getHostAddress();
	        System.out.println("InetAddress of Local Host : "
	                           + ipAddress);
		 Endpoint.publish("http://localhost:8080/AttachmentService", new ImageServiceImpl ());
		 Endpoint.publish("http://"+ipAddress+":8081/AttachmentService", new AttachmentServiceImpl());
	     System.out.println("Service is published at http://localhost:8080/AttachmentService?wsdl");
	     System.out.println("Service is published at http://"+ipAddress+":8081/AttachmentService?wsdl");
	}

	
}
