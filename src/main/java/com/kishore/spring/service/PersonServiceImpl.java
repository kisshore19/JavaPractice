package com.kishore.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kishore.hibernate.beans.onetomanyUnidirection.Person;
import com.kishore.spring.dao.PersonDao;

@Transactional
@Service("personService")
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao personDao;

	public void savePerson(Object person) {
		personDao.savePerson(person);
	}

	public List<Person> findAllPersons() {
		return personDao.findAllPersons();
	}

	public void deletePersonByName(String name) {

		personDao.deletePersonByName(name);
	}

	public Person findPersonByID(int id) {

		return personDao.findPersonByID(id);
	}

	public void updatePerson(Person person) {

		personDao.updatePerson(person);
	}

}
