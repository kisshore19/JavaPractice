package com.kishore.hibernate.beans.onetoManyBidirectional;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="collage")
public class Collage {

	@Id
	@GeneratedValue
	@Column(name="collage_id")
	private int collageId;
	
	@Column(name="collage_name")
	private String collageName;
	
	@Column(name="collage_location")
	private String collageLocation;

	@OneToMany(mappedBy="collage", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Student> student;

	public int getcollageId() {
		return collageId;
	}

	public void setcollageId(int collageId) {
		this.collageId = collageId;
	}

	public String getcollageName() {
		return collageName;
	}

	public void setcollageName(String collageName) {
		this.collageName = collageName;
	}

	public String getcollageLocation() {
		return collageLocation;
	}

	public void setcollageLocation(String collageLocation) {
		this.collageLocation = collageLocation;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

}
