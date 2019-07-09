
package com.ManyToMany;

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
            
            
            Laptop2 laptop = new Laptop2();
            laptop.setLid("101");
            laptop.setLname("Macbook");
            
            
            Student2 student  = new Student2();
            student.setSid("1");
            student.setSname("Mohit");
            student.setMarks(90f);
            student.getLaptop().add(laptop);            // Here we have to add a laptop object to student class
            laptop.getStudent().add(student);           // Here we have to add a student object to laptop class
            
            Configuration con = new Configuration().configure().addAnnotatedClass(Student2.class).addAnnotatedClass(Laptop2.class);
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
