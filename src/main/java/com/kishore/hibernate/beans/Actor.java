package com.kishore.hibernate.beans;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "actor")
public class Actor {

	private int actor_id;
	private String first_name;
	private String last_name;
	private Timestamp last_update;
	
	private ActorInfo actorInfo;

	@Id
	@GeneratedValue()
	@Column(name = "actor_id", nullable = false, unique = true)
	public int getActor_id() {
		return actor_id;
	}

	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}

	@Column(name = "first_name")
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	@Column(name = "last_name")
	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	@Column(name = "last_update", nullable = false)
	public Timestamp getLast_update() {
		return last_update;
	}
	

	@OneToOne(mappedBy="actor", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	public ActorInfo getActorInfo() {
		return actorInfo;
	}

	public void setActorInfo(ActorInfo actorInfo) {
		this.actorInfo = actorInfo;
	}

	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		return "Actor [actor_id=" + actor_id + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", last_update=" + last_update
				+ "]";
	}
	
	

}
