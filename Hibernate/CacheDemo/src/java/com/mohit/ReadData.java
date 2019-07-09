/*************************1st Level Cache Example*************************************************/
/* Hibernate provides 1st level cache by default we don't need to implement this by ourselves */
/* But DrawBack is for 2 different session 1st level cache generates same query twice*/
/*
    When to use 2nd level cache?
    When Two Different users fires same query which has same result
*/



package com.mohit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class ReadData 
{
    public static void main(String[] args) {
        try
        {
            Employee employee = null;
            Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class); 
            ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).build();
            SessionFactory factory = con.buildSessionFactory(reg);
            
            Session session = factory.openSession();        /*  From Line no 22 to 27 we have used 1st session object and that is 1st level cache*/
            Transaction tx = session.beginTransaction();
            employee = (Employee)session.get(Employee.class,1);
            System.out.println(employee);
            tx.commit();
            session.close();                                //here First level cache is closed
            
            Session session1 = factory.openSession();         /*From Line no 29 to 34 we have used second session */
            Transaction tx1 = session1.beginTransaction();    // Here hibernate generates a query for second time irrespective of that is same as the first session
            employee = (Employee)session1.get(Employee.class,1);
            System.out.println(employee);
            tx1.commit();
            session1.close();
            
            /*Conclusion :   Here question arise that for same query why session generates query 2 times 
                             To overcomoe this situation we have to use 2nd level cache 
            */
            
            /*To use Second level Cache we have to add two lines in hibernate.cfg.xml file */
            /* For that we have to add two jar files in libraries those are ehcache and hibernate-ehcache 
               
            */
            
            /*
                <property name="hibernate.cache.use_second_level_cache">true</property>
               <property name="hibernate.cache.region.factory_class">org.hibernate.cache.ehcache.EhCacheRegionFactory</property>
            
                Add these two lines in hibernate.cfg.xml file But these two lines are applicable only for get method 
            */
            
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
