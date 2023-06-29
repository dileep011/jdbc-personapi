package jdbc.com.service;

import java.util.ArrayList;
import java.util.List;

import jdbc.com.dao.PersonDao;
import jdbc.com.dto.Person;
public class PersonService {	
	PersonDao personDao=new PersonDao();
	
	public void createPersonTableService() {
		personDao.createPersonTable();
	}
	public int insertIntoPersonTableService(Person person) {
		return personDao.insertData(person);
	}
	public int updatePersonTableService(Person person) {
		return personDao.updateData(person);
	}
	public ArrayList getPersonDataService(Person person) {	
		return personDao.getPersonData(person);
		
	}
	public void deleteDataFromPersonservice(Person person) {
		personDao.deleteDataFromPerson(person);
	}
	public Person loginService(String email,String password1) {
		 return personDao.login(email,password1);
	}
}
