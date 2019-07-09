
package com.mohit;

import java.util.Random;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class AppConfig 
{
    public static void main(String[] args) {
        try
        {
            Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
            ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).build();
            SessionFactory factory  = con.buildSessionFactory(reg);
            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();
            Random r = new Random();
            
            
            for(int i=1;i<=50;i++)
            {
                Student student = new Student();
                student.setRollno(i);
                student.setSname("Name is : " + i);
                student.setMarks(r.nextInt(100));
                session.save(student);
            }
            
            tx.commit();
            session.close();
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
