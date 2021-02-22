package com.veto.model;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
       Person user = new Person();
       user.setId(1);
       user.setNom("mary");
       user.setPrenom("jackson");
       user.setEmail("mary@gmail.com");
       user.setPswd("user");
       user.setRole(2);
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Person.class);
       
       ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
       
       SessionFactory sf = con.buildSessionFactory(reg);
       Session session = sf.openSession();
       
       Transaction tx = session.beginTransaction();
       
       session.save(user);
       tx.commit();
       
    }
}


