package com.kishore.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.kishore.hibernate.beans.Actor;
import com.kishore.hibernate.beans.onetomanyBidirection.Professor;

@Repository("professorDao")
public class ProfessorDaoImpl extends AbstractDao implements ProfessorDao {

	public void saveProfessor(Professor professor) {
		persist(professor);
	}

	@SuppressWarnings("unchecked")
	public List<Professor> findAllProfessor() {
		Criteria createCriteria = getSession().createCriteria(Professor.class);
		return (List<Professor>)createCriteria.list();
	}

	public void deleteProfessorByName(String name) {
		Query query = getSession().createSQLQuery("delete from professor where name =:name ");
		query.setString("name", name);
		query.executeUpdate();
		
	}

	public Professor findProfessorByID(int id) {
		Criteria createCriteria = getSession().createCriteria(Professor.class);
		createCriteria.add(Restrictions.idEq(id));
		return (Professor)createCriteria.uniqueResult();
	}

	public void updateProfessor(Professor professor) {
		getSession().update(professor);
		
	}

}
