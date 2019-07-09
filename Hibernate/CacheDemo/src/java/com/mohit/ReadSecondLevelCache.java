/*Second Level Cache*/


package com.mohit;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class ReadSecondLevelCache
{
    public static void main(String[] args) 
    {
        try
        {
            Employee employee = null;
            Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class); 
            ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).build();
            SessionFactory factory = con.buildSessionFactory(reg);
            
            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();
            
            Query q1  = session.createQuery("from Employee where e_id=1");    
            q1.setCacheable(true);                          // This should be set true 
            employee = (Employee)q1.uniqueResult();
            System.out.println(employee);
            
            tx.commit();
            session.close();
            
            Session session1 = factory.openSession();
            Transaction tx1 = session1.beginTransaction();
            Query q2  = session1.createQuery("from Employee where e_id=1");
            q2.setCacheable(true);
            employee = (Employee)q2.uniqueResult();
            System.out.println(employee);
            
            tx1.commit();
            session1.close();
            
            
            
            /*
                This is a second level cache for Query query = session.createQuery("write ur query");
                To use this we have add <property name="hibernate.cache.use_query_cache">true</property> in hibernate.cfg.xml file
            */
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
            
    }
}
