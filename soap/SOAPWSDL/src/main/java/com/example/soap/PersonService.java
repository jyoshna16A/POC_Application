package com.example.soap;

import jakarta.jws.WebService;

@WebService
public interface PersonService {

	public boolean addPerson(Person p);
	
	public boolean deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();
}
