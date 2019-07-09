package com.mohit;

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
            Employee employee = new Employee();
            employee.setE_id(1);
            employee.setEname("Mohit");
            employee.setSalary(25000);
            
            
            Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
            ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).build();
            SessionFactory factory  = con.buildSessionFactory(reg);
            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();
            session.save(employee);
            tx.commit();
            session.close();
            
            
            
            
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
