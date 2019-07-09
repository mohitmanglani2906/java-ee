
package com.mohit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class ModifyData
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
            
            Laptop l = new Laptop();
            l.setLid(51);
            l.setLname("Dell");
            l.setPrice(36000);
            
            session.save(l);
            l.setPrice(32000);     // Here Laptop object id in persistance state  that's why after save we can update its data
            tx.commit();
            
            session.delete(l);   // After Deting the the Lid we can't save data because now session is in non-persistance
            l.setPrice(35000);
           
            session.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
