package com.veto.Hutility;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.veto.model.Person;
import com.veto.model.Question;

public class Hutility {
	
	private static SessionFactory sessionFactory;


		static {
	        try {
	            // Création de la SessionFactory à partir de hibernate.cfg.xml
	            sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        } catch (Throwable ex) {
	            // Make sure you log the exception, as it might be swallowed
	            System.err.println("Initial SessionFactory creation failed." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }

	    // public static final ThreadLocal session = new ThreadLocal();

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }	

}
