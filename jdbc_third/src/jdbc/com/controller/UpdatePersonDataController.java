package jdbc.com.controller;

import jdbc.com.dto.Person;
import jdbc.com.service.PersonService;
import java.util.*;
public class UpdatePersonDataController {
	static Scanner scan=new Scanner (System.in);
	public static void main(String[] args) {
		Person person =new Person();

		PersonService personService=new PersonService();

		System.out.println("enter the the name to modify");
		person.setName(scan.next());
		System.out.println("enter the id to modify name");
		person.setId(scan.nextInt());
		int i=personService.updatePersonTableService(person);
		if(i<=1) {
			System.out.println("data has been modified");
		}
		else {
			System.out.println("plz the id that your enterd");
		}
	}

}
