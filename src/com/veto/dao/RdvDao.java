package com.veto.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.veto.Hutility.Hutility;
import com.veto.model.RendezVs;

public class RdvDao {

	public RdvDao() {
		// TODO Auto-generated constructor stub
	}
	
	public void saveRdv(RendezVs rdv) {
		Session session= Hutility.getSessionFactory().openSession();
		Transaction tx = session.getTransaction();
		try {
			
			tx.begin();
			
			session.save(rdv);
			
			tx.commit();
			session.close();
		} catch(Exception e) {
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


