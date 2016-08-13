package com.kishore.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kishore.hibernate.beans.Actor;
import com.kishore.spring.dao.ActorDao;

@Service("actorService")
@Transactional
public class ActorServiceImpl implements ActorService {

	@Autowired
	ActorDao actorDao;

	public void saveActor(Actor actor) {
		actorDao.saveActor(actor);

	}

	public List<Actor> findAllActors() {
		return actorDao.findAllActors();
	}

	public void deleteActorByFirstName(String firstName) {
		actorDao.deleteActorByFirstName(firstName);

	}

	public Actor findActorByID(int id) {
		return actorDao.findActorByID(id);
	}

	public void updateActor(Actor actor) {

		actorDao.updateActor(actor);
	}

}
