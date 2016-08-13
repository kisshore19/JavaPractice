package com.kishore.spring.service;

import java.util.List;

import com.kishore.hibernate.beans.onetomanyUnidirection.Person;

public interface PersonService {

	void savePerson(Object person);

	List<Person> findAllPersons();

	void deletePersonByName(String name);

	Person findPersonByID(int id);

	void updatePerson(Person person);
}
