package com.kishore.hibernate.beans.onetomanyBidirection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="parkingspace")
public class ParkingSpace {
	
	private int id;
    private int lot;
    private String location;
    
    private Professor professor;
    
    
    @Id
    @GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLot() {
		return lot;
	}
	public void setLot(int lot) {
		this.lot = lot;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@OneToOne(mappedBy="parkingSpace",cascade=CascadeType.ALL, fetch=FetchType.EAGER, orphanRemoval=true)
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
    
    

}
