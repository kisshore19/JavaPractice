package com.kishore.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.kishore.hibernate.beans.Actor;

@Repository("actorDao")
public class ActorDaoImpl extends AbstractDao implements ActorDao {

	public void saveActor(Actor actor) {
		persist(actor);
	}

	@SuppressWarnings("unchecked")
	public List<Actor> findAllActors() {
		Criteria createCriteria = getSession().createCriteria(Actor.class);
		return (List<Actor>)createCriteria.list();
	}

	public void deleteActorByFirstName(String firstName) {
		Query query = getSession().createSQLQuery("delete from actor where first_name =:firstName ");
		query.setString("firstName", firstName);
		query.executeUpdate();
		
	}

	public Actor findActorByID(int id) {
		Criteria createCriteria = getSession().createCriteria(Actor.class);
		createCriteria.add(Restrictions.idEq(id));
		return (Actor)createCriteria.uniqueResult();
	}

	public void updateActor(Actor actor) {
		getSession().update(actor);
		
	}

}
