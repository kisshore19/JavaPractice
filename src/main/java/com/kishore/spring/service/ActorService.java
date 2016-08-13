package com.kishore.spring.service;

import java.util.List;

import com.kishore.hibernate.beans.Actor;

public interface ActorService {

	void saveActor(Actor actor);

	List<Actor> findAllActors();

	void deleteActorByFirstName(String firstName);

	Actor findActorByID(int id);

	void updateActor(Actor actor);

}
