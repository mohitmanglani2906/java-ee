
package com.mohit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App
{
    public static void main(String[] args)
    {
        System.out.println("Hey Server");
        
        AlienName aname= new AlienName();
        aname.setFname("Harshil");
        aname.setLname("Jesdiya");
        aname.setMname("xyz");
        
        
        Alien an = new Alien();       // Create an Object of Alien Class that is to be saved in Database and table name is Alien
        an.setAid(102);
        an.setAlienname(aname);
        an.setColor("blue");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory factory = con.buildSessionFactory(reg);                                                                                   
        Session session =  factory.openSession();     // Session is an interface and openSession is an method  of SessionFactory  interface
        Transaction tx= session.beginTransaction() ;  // Here Transaction is an interface and beginTransaction is a method of ShredSessionContract
        session.save(an);                            // Here I just pass an object of class Alien 
        tx.commit();                                // Here commit is requiered to save the data into database

//       
        session.close();                            // Close the session for security purpose
        
        /*SessionFactory factory = new Configuration().configure().addAnnotatedClass(Alien.class).buildSessionFactory(); Here SessionFactory is an inetrface and
         that's why we create an object of Configuration class and in addAnnotatedClass mention an class of which you want to create an object */ 

        
        
    }
}
