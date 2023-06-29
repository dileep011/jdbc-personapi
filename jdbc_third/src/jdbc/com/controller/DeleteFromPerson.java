package jdbc.com.controller;

import jdbc.com.dto.Person;
import jdbc.com.service.PersonService;
import java.util.*;
public class DeleteFromPerson {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		Person person = new Person();
		PersonService personService= new PersonService();
		System.out.println("enter the id to delete person data");
		person.setId(scan.nextInt());
		personService.deleteDataFromPersonservice(person);
		System.out.println("data deleted");
	}

}
