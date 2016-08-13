package com.kishore.hibernate.connection;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateConnection {

	private static HibernateConnection connection;
	private Configuration conf;
	private SessionFactory sessionFactory;

	private HibernateConnection() throws HibernateException {
		conf = new Configuration().configure("Hibernate.cfg.xml");

		ServiceRegistry sessionRegistry = new ServiceRegistryBuilder()
				.applySettings(conf.getProperties()).buildServiceRegistry();
		sessionFactory = conf.buildSessionFactory(sessionRegistry);
	}

	public static synchronized HibernateConnection getInstance()
			throws HibernateException {
		if (connection == null) {
			connection = new HibernateConnection();
		}
		return connection;
	}

	public Session getSession() {
		return sessionFactory.openSession();
	}

}
