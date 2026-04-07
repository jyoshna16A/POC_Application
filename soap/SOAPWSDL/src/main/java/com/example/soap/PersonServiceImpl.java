package com.example.soap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.example.soap.PersonService")
public class PersonServiceImpl implements PersonService {

	private static Map<Integer,Person> persons = new HashMap<Integer,Person>();

	@Override
	public boolean addPerson(Person p) {
		if(persons.get(p.getId()) != null) return false;
		persons.put(p.getId(), p);
		System.out.println("Add person : " + p.getId());
		try (Connection conn = DBConnection.getConnection()) {
			System.out.println("connection : " + conn.toString());
            // Check if the person already exists
            String checkQuery = "SELECT * FROM Person WHERE id = ?";
            try (PreparedStatement checkStmt = conn.prepareStatement(checkQuery)) {
                checkStmt.setInt(1, p.getId());
                ResultSet rs = checkStmt.executeQuery();
                if (rs.next()) {
                    return false; // Person already exists
                }
            }

            // Insert the new person
            String insertQuery = "INSERT INTO db.Person (id, name, age) VALUES (?, ?, ?)";
            try (PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {
                insertStmt.setInt(1, p.getId());
                insertStmt.setString(2, p.getName());
                insertStmt.setInt(3, p.getAge());
                insertStmt.executeUpdate();
            }

            System.out.println("Add person: " + p.getId());
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
	}

	@Override
	public boolean deletePerson(int id) {
		if(persons.get(id) == null) return false;
		persons.remove(id);
		System.out.println("delete person : " + id);
		try (Connection conn = DBConnection.getConnection()) {
            // Check if the person already exists
			String checkQuery = "SELECT * FROM Person WHERE id = ?";
            try (PreparedStatement checkStmt = conn.prepareStatement(checkQuery)) {
                checkStmt.setInt(1, id);
                ResultSet rs = checkStmt.executeQuery();
                if (!rs.next()) {
                    return false; // Person does not exist
                }
            }
            //Delete the person data
            String deleteQuery = "DELETE FROM db.Person WHERE id = ?";
            try (PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery)) {
                deleteStmt.setInt(1, id);
                deleteStmt.executeUpdate();
            }

            System.out.println("Deleted person: " + id);
            return true;
		}
		catch (SQLException e) {
            e.printStackTrace();
            return false;
        } 
		
	}

	@Override
	public Person getPerson(int id) {
		 String query = "SELECT * FROM db.Person WHERE id = ?";
		    try (Connection conn = DBConnection.getConnection();
		         PreparedStatement stmt = conn.prepareStatement(query)) {

		        stmt.setInt(1, id);
		        ResultSet rs = stmt.executeQuery();

		        if (rs.next()) {
		            Person person = new Person();
		            person.setId(rs.getInt("id"));
		            person.setName(rs.getString("name"));
		            person.setAge(rs.getInt("age"));
		            System.out.println("Retrieved person: " + person.toString());
		            return person;
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    return null; 
	}

	@Override
	public Person[] getAllPersons() {
	    String countQuery = "SELECT COUNT(*) FROM Person";
	    String selectQuery = "SELECT * FROM db.Person";
	    Person[] persons = null;

	    try (Connection conn = DBConnection.getConnection();
	         Statement countStmt = conn.createStatement();
	         ResultSet countRs = countStmt.executeQuery(countQuery)) {

	        if (countRs.next()) {
	            int count = countRs.getInt(1);
	            persons = new Person[count];
	        }

	        try (Statement selectStmt = conn.createStatement();
	             ResultSet rs = selectStmt.executeQuery(selectQuery)) {

	            int i = 0;
	            while (rs.next() && persons != null) {
	                Person person = new Person();
	                person.setId(rs.getInt("id"));
	                person.setName(rs.getString("name"));
	                person.setAge(rs.getInt("age"));
	                // Set other fields

	                persons[i++] = person;
	            }

	            System.out.println("List of persons: " + Arrays.toString(persons));

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return persons;
	}


}

