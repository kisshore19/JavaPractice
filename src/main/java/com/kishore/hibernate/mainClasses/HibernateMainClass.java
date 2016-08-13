package com.kishore.hibernate.mainClasses;

import java.sql.Timestamp;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.kishore.hibernate.beans.Actor;
import com.kishore.hibernate.connection.HibernateConnection;

public class HibernateMainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Session session = HibernateConnection.getInstance().getSession();
		
		Actor actor=new Actor();
		
		actor.setFirst_name("kishore");
		actor.setLast_name("oggu");
		actor.setLast_update(new Timestamp(System.currentTimeMillis()));
		
		Transaction  transaction=session.beginTransaction();
		
		
		session.save(actor);
		
		
		transaction.commit();
		session.close();
		

	}

}
