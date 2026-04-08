package com.example.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloService {

    @WebMethod
    String sayHello(String name);
}
