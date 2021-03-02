package com.veto.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.veto.dao.PersonDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		PersonDao PersD = new PersonDao();
//		Person person = new Veto();
//		person.setNom("mary");
//		person.setPrenom("jackson");
//		person.setEmail("mary@gmail.com");
//		person.setPswd("user");

		//PersD.savePerson(person);

//       Configuration con = new Configuration().configure().addAnnotatedClass(Person.class);
//       
//       ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
//       
//       SessionFactory sf = con.buildSessionFactory(reg);
//       Session session = sf.openSession();
//       
//       Transaction tx = session.beginTransaction();
//       
//       session.save(person);
//       tx.commit();
//       
//    }
	}
}
