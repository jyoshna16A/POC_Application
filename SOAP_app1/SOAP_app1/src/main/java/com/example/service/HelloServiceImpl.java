package com.example.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.service.HelloService")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
