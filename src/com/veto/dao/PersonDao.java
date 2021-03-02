package com.veto.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.veto.Hutility.Hutility;
import com.veto.model.Person;
import com.veto.model.User;

public class PersonDao {
	
	public void savePerson(Person person) {
		Transaction tx = null;
		System.out.println("the name of person is"+person);
		try(Session session = Hutility.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			session.save(person);
		    tx.commit();
		}catch(Exception e) {
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
    
	}
	
	public Person validate(String nom, String pswd) {
		Session session= Hutility.getSessionFactory().openSession();
		Transaction tx = session.getTransaction();
		Person person = null;
		
		try{
			 tx = session.beginTransaction();
		       
		       person = (Person) session.createQuery("FROM Person P WHERE P.nom = :ahmed").setParameter("ahmed", nom)
						.uniqueResult();
		       
		       if(person != null && person.getPswd().equals(pswd)) {
					return person;
				}
		       tx.commit();

		}catch(Exception e) {
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			}finally {
				if(session != null) {
					session.close();
				}
			}
			
		
		return null;  	       
	      
	}
	public Person getpersonbyId(Long id) {
		User user =null;
		Transaction transaction = null;
		Session session = Hutility.getSessionFactory().openSession();
		// start a transaction
		transaction = session.beginTransaction();

		// get Student entity using get() method
		user= session.get(User.class, id );
		
		// commit transaction
		transaction.commit();
		return user;
	}

}
