package com.veto.Hutility;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.veto.model.Person;

public class Hutility {
	
	private static SessionFactory sf;

	public static SessionFactory getSessionFactory() {
		if (sf == null) {
			try {
				Configuration con = new Configuration().configure().addAnnotatedClass(Person.class);

				ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
				 sf = con.buildSessionFactory(reg);
				return sf;

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sf;
	}

}
