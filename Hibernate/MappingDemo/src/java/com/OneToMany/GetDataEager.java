
package com.OneToMany;

import java.util.Collection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class GetDataEager 
{
    public static void main(String[] args) 
    {
        try
        {
            Configuration con = new Configuration().configure().addAnnotatedClass(Laptop1.class).addAnnotatedClass(Student1.class);
            ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).build();
            SessionFactory factory  = con.buildSessionFactory(reg);
            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();
            
            Student1 student = (Student1)session.get(Student1.class,"1");
            System.out.println(student.getSid() + " "  + student.getSname() + " "+ student.getMarks());
            
            Collection<Laptop1> laps  = student.getLaptop();
            
            for(Laptop1 l:laps)
            {
                System.out.println(l.getLname());
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
