package com.veto.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.veto.Hutility.Hutility;
import com.veto.model.Person;

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
	
	public boolean validate(String nom, String pswd) {
		Session session= Hutility.getSessionFactory().openSession();
		Transaction tx = session.getTransaction();
		Person user = null;
		
		try{
			 tx = session.beginTransaction();
		       
		       user = (Person) session.createQuery("FROM Person P WHERE P.nom = :ahmed").setParameter("ahmed", nom)
						.uniqueResult();
		       
		       if(user != null && user.getPswd().equals(pswd)) {
					return true;
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
			
		
		return false;  	       
	      
	}

}
