package com.kishore.hibernate.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import com.kishore.hibernate.beans.Actor;


@Entity
@Table(name="actor_info")
public class ActorInfo {
	
	private int actorId;
	private String firstName;
	private String lastName;
	private String filmInfo;
	
	private Actor actor;
	
	
	@Id
	//@GeneratedValue
	@Column(name="actor_id")
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	
	@Column(name="first_name")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name="last_name")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Column(name="film_info")
	public String getFilmInfo() {
		return filmInfo;
	}
	public void setFilmInfo(String filmInfo) {
		this.filmInfo = filmInfo;
	}
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	//@JoinColumn(name="actor_id")
	@JoinColumn(name="actor")
	public Actor getActor() {
		return actor;
	}
	public void setActor(Actor actor) {
		this.actor = actor;
	}
	
	
	
}
