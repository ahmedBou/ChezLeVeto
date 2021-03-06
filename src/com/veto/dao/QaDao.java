package com.veto.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.veto.Hutility.Hutility;
import com.veto.model.Question;



public class QaDao {
	
	public void saveQuestion(Question q) {
		Session session= Hutility.getSessionFactory().openSession();
		Transaction tx = session.getTransaction();
//		System.out.println("the question is "+q);
		try{
			tx.begin();
		
			session.save(q);

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
	
		}
	
	public List<Question> getQuestion() {
		List<Question> listOfQuest = null;
		Session session= Hutility.getSessionFactory().openSession();
		Transaction tx = session.getTransaction();
//		System.out.println("the question is "+q);
		try{
			tx.begin();

			 listOfQuest = session.createQuery("FROM Question", Question.class).list();
			 //System.out.println(listOfQuest.get(0).getQuestion());
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
		return listOfQuest;
	}

	}


