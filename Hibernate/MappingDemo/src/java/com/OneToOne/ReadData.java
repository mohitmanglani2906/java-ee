
package com.OneToOne;


import java.util.List;
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
            Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
            ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).build();
            SessionFactory factory  = con.buildSessionFactory(reg);
            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();
            List<Laptop> values = session.createCriteria(Laptop.class).list();
                    
//            Student student  = (Student)session.get(Student.class,"1");    /*Below four lines are used for getting a data of a particular user by its Roll no*/
//            
//            Laptop laptop = student.getLaptop();        // This is a Lazy approach that will only get the data what you have asked 
//            System.out.println(student);                // For all the data you need a Eager Approach To see this consider OneToMany Example in com.OneToMany Package
//            System.out.println(laptop);

            tx.commit();
            
            values.stream().forEach(System.out::println);
            
            session.close();
            
                    
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
