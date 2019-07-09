
package com.mohit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class FetchData 
{
    public static void main(String[] args) 
    {
        try
        {
            Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class);
            ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).build();
            SessionFactory factory  = con.buildSessionFactory(reg);
            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();
            
            Laptop lap = null;
            lap = (Laptop)session.get(Laptop.class,51);
            System.out.println(lap);
            
            Laptop laptop = null;
            laptop = (Laptop)session.load(Laptop.class, 51);  // Here we can see that if we use load method then it makes a proxy object that means fake object
            System.out.println(laptop);                      //  If you remove this line then load method will not fire a query
        } 
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
            
    }
}
