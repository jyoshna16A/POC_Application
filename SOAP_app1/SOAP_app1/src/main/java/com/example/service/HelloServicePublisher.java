package com.example.service;

import javax.xml.ws.Endpoint;

public class HelloServicePublisher {
	public static void main(String[] args) {
        // Publish the web service at the given URL
        Endpoint.publish("http://localhost:8080/ws/hello", new HelloServiceImpl());
        System.out.println("Service published at http://localhost:8080/ws/hello?wsdl");
    }
}
