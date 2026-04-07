package com.example.Xsd1;


import com.example.xsd2.Address;
import com.example.xsd2.Order;
import com.example.xsd2.OrderItem;
import com.example.xsd2.Orders;
import com.example.xsd2.Person;
import com.sun.tools.xjc.XJCListener;
import com.sun.tools.xjc.api.XJC;
import com.sun.tools.xjc.api.SchemaCompiler;

import java.io.File;
import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Xsd1Application {

	public static void main(String[] args) {
		SpringApplication.run(Xsd1Application.class, args);
		Person person = new Person();
		person.setFirstName("Venkata");
		person.setLastName("Jyoshna");
		person.setEmail("jyoshna@gmail.com");
		person.setPhone("7454334373");
		Address address = new Address();
		address.setState("AndhraPradesh");
		address.setCity("Bestavaripeta");
		address.setStreet("main road");
		address.setPostalCode("523334");
		person.setAddress(address);
		System.out.println("person details : " + person.toString());
		
		OrderItem items = new OrderItem();
		items.setProductCode("HIU434");
		items.setQuantity(3);
//		items.setPrice(76);
		System.out.println("Order item : " + items);
		
		Order order = new Order();
		order.setOrderID("121");
//		order.setOrderDate("13-01-2025");
		order.setCustomer(person);
//		order.setTotalAmount((long) 5632);
//		order.setOrderItems(items); 
		System.out.println("Order : " + order);
		
		Person person1 = new Person();
		person1.setFirstName("Venkata");
		person1.setLastName("Jyoshna");
		person1.setEmail("jyoshna@gmail.com");
		person1.setPhone("7454334373");
		Address address1 = new Address();
		address1.setState("AndhraPradesh");
		address1.setCity("Bestavaripeta");
		address1.setStreet("main road");
		address1.setPostalCode("523334");
		person1.setAddress(address);
		System.out.println("person details : " + person1.toString());
		
		OrderItem items1 = new OrderItem();
		items1.setProductCode("HIU434");
		items1.setQuantity(3);
//		items1.setPrice(76);
		System.out.println("Order item : " + items1);
		
		
		Order order1 = new Order();
		order1.setOrderID("121");
//		order1.setOrderDate("13-01-2025");
		order1.setCustomer(person);
//		order1.setTotalAmount((long) 5632);
		System.out.println("Order : " + order1);
		
//		Orders orders = new Orders();
//		orders.setOrder(order);
//		orders.setOrder(order1);
//		orders.getOrder();
//		System.out.println("List of orders : " + orders.getOrder());
    }

}
