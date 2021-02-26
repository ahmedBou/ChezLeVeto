package com.veto.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.veto.Hutility.Hutility;
import com.veto.model.Qa;


public class QaDao {
	
	public void saveQuestion(Qa q) {
		Session session= Hutility.getSessionFactory().openSession();
		Transaction tx = session.getTransaction();
//		System.out.println("the question is "+q);
		try{
			tx.begin();
		
			
			session.save(q);
			Qa msg = (Qa) session.get(Qa.class,3L);
			//modify
			//msg.setChat("heeey baby");
			//delete
//			session.delete(msg);
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
	}


