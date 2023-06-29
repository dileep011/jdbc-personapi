package jdbc.com.controller;

import java.util.Scanner;

import jdbc.com.dto.Person;
import jdbc.com.service.PersonService;

public class InsertPersonDataController {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {

		PersonService personService= new PersonService();

		Person person=new Person();

		System.out.println("enter id");
		person.setId(scan.nextInt());
		System.out.println("enter name");
		person.setName(scan.next());
		System.out.println("enter age");
		person.setAge(scan.nextInt());
		System.out.println("enter email");
		person.setEmail(scan.next());
		System.out.println("enter password");
		person.setPassword(scan.next());
		int r=personService.insertIntoPersonTableService(person);
		if(r<=1) {
			System.out.println("data saved");
		}
		else {
			System.out.println("data not saved");
		}


	}

}
