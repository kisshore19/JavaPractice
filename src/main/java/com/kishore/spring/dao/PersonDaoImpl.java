package com.kishore.spring.dao;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.kishore.hibernate.beans.onetomanyUnidirection.Person;

@Repository("personDao")
public class PersonDaoImpl extends AbstractDao implements PersonDao {

	public void savePerson(Object person) {
		persist(person);
	}

	@SuppressWarnings("unchecked")
	public List<Person> findAllPersons() {
		
		return getSession().createCriteria(Person.class).list();
		
	}

	public void deletePersonByName(String name) {
		
		Query query=  getSession().createQuery("delete from Person where name=:name");
		query.setParameter("name", name);
		query.executeUpdate();
	}

	public Person findPersonByID(int id) {
		try {
			return (Person) getSession().load(Person.class, id);
		} catch (HibernateException exception) {
			return (Person) getSession().get(Person.class, id);
		}

	}

	public void updatePerson(Person person) {
		getSession().saveOrUpdate(person);

	}

}
