/*
Here we will see mapping using hibernate oneTomany manytoone and manyTOmany
Here We can do the mapping between two tables using Annotations
These both the tables should have separate classes
*/
package com.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class AppConfig
{
    public static void main(String[] args) 
    {
        try
        {
            System.out.println("Hey Server Please Enter a data ....."); 
            
            
            Laptop laptop = new Laptop();    // Set variables for Laptop Class
            laptop.setLid("104"); 
            laptop.setLname("Mac");
            
            Student student  = new Student();    // Set variables for Student Class
            student.setSid("4");
            student.setSname("chand");
            student.setMarks(90f);
            student.setLaptop(laptop);
            
            Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class); // Here we can use addAnnotatedClass twice
            ServiceRegistry reg  = new ServiceRegistryBuilder().applySettings(con.getProperties()).build();
            SessionFactory factory = con.buildSessionFactory(reg);
            Session session =  factory.openSession();
            Transaction tx = session.beginTransaction();
            session.save(laptop);
            session.save(student);
            tx.commit();
            
            session.close();
            
            
                     
        }
        catch(Exception e)
        {
            System.out.println( "Here is a Error in your Code Please Check" + e.getMessage());
        }
    }
}
