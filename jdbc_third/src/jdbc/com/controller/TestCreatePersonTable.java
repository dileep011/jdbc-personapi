package jdbc.com.controller;

import jdbc.com.service.PersonService;

public class TestCreatePersonTable {

	public static void main(String[] args) {
		PersonService personService= new PersonService();
		
		personService.createPersonTableService();
		System.out.print("table created");

	}

}
