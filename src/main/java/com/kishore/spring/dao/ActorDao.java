package com.kishore.spring.dao;

import java.util.List;

import com.kishore.hibernate.beans.Actor;

public interface ActorDao {

	void saveActor(Actor actor);

	List<Actor> findAllActors();

	void deleteActorByFirstName(String firstName);

	Actor findActorByID(int id);

	void updateActor(Actor actor);

}
