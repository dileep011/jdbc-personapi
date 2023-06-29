package jdbc.com.controller;

import java.util.ArrayList;
import java.util.List;

import jdbc.com.dto.Person;
import jdbc.com.service.PersonService;

public class GetPersonData {

	public static void main(String[] args) {
		Person person=new Person();
		PersonService personservice=new PersonService();
		ArrayList<Person> li=personservice.getPersonDataService(person);
		if(li.size()>0) {
			for(Person person1 : li) {
			System.out.println("Name of the person -->"+person1.getName());
			System.out.println("Age of the person -->"+person1.getAge());
			System.out.println("ID of the person -->"+person1.getId());
			System.out.println("Email of the Person -->"+person1.getEmail());
			System.out.println("Password of the person -->"+person1.getPassword());
			System.out.println("------------------------------------");	
			}
			}	
		}
	}