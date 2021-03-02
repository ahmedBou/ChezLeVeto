package com.veto.dao;

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
//	Question msg = (Question) session.get(Question.class,3L);
	//modify
	//msg.setChat("heeey baby");
	//delete
//	session.delete(msg);
	}


