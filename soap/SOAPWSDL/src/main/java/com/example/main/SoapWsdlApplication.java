package com.example.main;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com.example.soap.PersonServiceImpl;

import jakarta.xml.ws.Endpoint;

public class SoapWsdlApplication {
	public static void main(String[] args) throws UnknownHostException{
		 InetAddress address1 = InetAddress.getLocalHost();
	     String ipAddress = address1.getHostAddress();
	        System.out.println("InetAddress of Local Host : "
	                           + ipAddress);
		Endpoint.publish("http://localhost:8083/PersonService", new PersonServiceImpl());
		Endpoint.publish("http://" + ipAddress + ":8081/PersonService", new PersonServiceImpl());
		System.out.println("Service is published at http://localhost:8083/PersonService?wsdl");
		System.out.println("Service is published at http://"+ipAddress+":8081/PersonService?wsdl");
	}
}
