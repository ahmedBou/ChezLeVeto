package com.veto.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.veto.Hutility.Hutility;

import com.veto.model.Response;

public class ResponseDao {

	public ResponseDao() {
		// TODO Auto-generated constructor stub
	}
	public void saveResponse(Response resp) {
		Session session= Hutility.getSessionFactory().openSession();
		Transaction tx = session.getTransaction();
//		System.out.println("the question is "+q);
		try{
			tx.begin();
		
			session.save(resp);

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
	
	public List<Response> getResponse() {
		List<Response> listOfResp = null;
		Session session= Hutility.getSessionFactory().openSession();
		Transaction tx = session.getTransaction();
//		System.out.println("the question is "+q);
		try{
			tx.begin();

			listOfResp = session.createQuery("FROM Response", Response.class).list();
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
		return listOfResp;
	}

}
