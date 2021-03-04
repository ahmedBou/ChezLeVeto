package com.veto.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.veto.dao.PersonDao;
import com.veto.dao.QaDao;
import com.veto.dao.RdvDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		
		RdvDao rvs = new RdvDao();
		PersonDao user = new PersonDao();
		User u = (User) user.getpersonbyId(6);
		
		RendezVs rdv = new RendezVs("motif1", u);
		rvs.saveRdv(rdv);
		System.out.println(rdv.toString());
		
//		PersonDao PersD = new PersonDao();
//		Person person = new Veto();
//		person.setNom("mary");
//		person.setPrenom("jackson");
//		person.setEmail("mary@gmail.com");
//		person.setPswd("user");

		//PersD.savePerson(person);
		
//		QaDao listOfQ = new QaDao();
////		listOfQ.getQuestion();
//		List<Question> listQuestions =listOfQ.getQuestion();
//		for(Question question : listQuestions) {
//			System.out.println(question.getQuestion());			
//		}
		
		

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
