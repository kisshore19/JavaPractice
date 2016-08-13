package com.kishore.testpackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JNDITest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{

		/*Hashtable env = new Hashtable(2);
		env.put(JboContext.INITIAL_CONTEXT_FACTORY, JboContext.JBO_CONTEXT_FACTORY);
		InitialContext  ctx = new InitialContext(env);*/
		
		//System.setProperty("java.naming.factory.initial","org.jnp.interfaces.NamingContextFactory");  
		// System.setProperty("java.naming.provider.url","localhost:1099");  
		
		//InitialContext ctxt = new InitialContext();
		//Class.forName("org.jnp.interfaces.NamingContextFactory");
		 Properties props = new Properties();
		 props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
		 props.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		 props.put(Context.PROVIDER_URL, "jnp://localhost:1099");
		 
		
		Context initContext = new InitialContext(props);
		//Context envContext  = (Context)initContext.lookup("java:/comp/env");
		
		DataSource ds = (DataSource) initContext.lookup("jav:/mysqlDatasource");
		Connection con = ds.getConnection();
		///java:comp/env/jdbc/MySQLDB
		
		PreparedStatement preparedStatement=con.prepareStatement("select * from actor");
		preparedStatement.execute();
		
		System.out.println("Connection is : " + con);

		
		
	}

}
