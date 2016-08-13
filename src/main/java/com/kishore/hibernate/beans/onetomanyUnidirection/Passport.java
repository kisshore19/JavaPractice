package com.kishore.hibernate.beans.onetomanyUnidirection;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Proxy;


@Entity
@Table(name="Passport")
@Proxy(lazy=false)
public class Passport {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int passportId;
	
	@Column(name="issue_date")
	@Temporal(TemporalType.DATE)
	private Date issueDate;
	
	@Column(name="expiry_date")
	@Temporal(TemporalType.DATE)
	private Date expiryDate;
	
	@OneToOne(mappedBy="passport", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private Person person;
	
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
}
