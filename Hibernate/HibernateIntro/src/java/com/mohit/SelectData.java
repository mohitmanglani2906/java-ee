
package com.mohit;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class SelectData 
{
    public static void main(String[] args) 
    {
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory factory = con.buildSessionFactory(reg);
        Session session  = factory.openSession();
        Transaction tx = session.beginTransaction();
        List<Alien> userList = session.createCriteria(Alien.class).list();
        tx.commit();
        
        
        
       userList.forEach(System.out::println);   // This is a lambda Expression  // Stream Api
       session.close();
       
//        an  = (Alien)session.get(Alien.class, 101);   // Here we are using get method for obtaining the data From class or table Alien
//        System.out.println(an +  "Data From Table");  // Simply print the data from Alien
        
        
        
        
    }
}
