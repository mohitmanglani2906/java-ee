
package com.mohit;

import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
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
            Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
            ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).build();
            SessionFactory factory  = con.buildSessionFactory(reg);
            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();
            float b=60f;
            Query q1  = session.createQuery("from Student where marks > 50");      // Here Student is a entity name not a table name
            List<Student> student = q1.list();
            student.stream().forEach(System.out::println);   // Lamda Expression  // with stream() 
            
            System.out.println("***********************Break*****************************");
            
            Query q2 = session.createQuery("from Student where rollno=1");
            Student student1=(Student)q2.uniqueResult();
            System.out.println(student1);
            
            System.out.println("***********************Break*******************************");
            
            Query q3 = session.createQuery("Select sname,marks,rollno from Student where rollno=1");
            Object o[]= (Object[])q3.uniqueResult();   // Here I have taken object of array because query result willl store int String and float value
                                                      //  So in General we can take array of Object  
            for(Object o1 : o)
            {
                System.out.println("hereeeeeee");
                System.out.println(o1);
            }
            
            System.out.println("***********************Break*******************************");
            
            Query q4  = session.createQuery("Select sname,marks,rollno from Student");
            List<Object[]> students = (List<Object[]>)q4.list();
            for(Object[] o2 : students)
            {
                System.out.println(o2[0] + " : " + o2[1] +  " : " + o2[2]);
            }
            
            System.out.println("***********************Break*******************************");
            
            Query q5 = session.createQuery("Select sum(marks) from Student s where marks > :b");    // PreparedStatement
            try
            {
                q5.setParameter("b", b);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            
            try
            {
                Double marks = (Double) q5.uniqueResult();
                System.out.println("Total marks are : " + marks);
            }
            catch(Exception e)
            {
                System.out.println( "Casting" + e.getMessage());
            }
            
            
            System.out.println("***********************Break*********************************");
            System.out.println("**********************Native SQL Query***********************");
            
            SQLQuery query = session.createSQLQuery("Select * from studentdata where marks > 60");
            query.addEntity(Student.class);         // Add Entity Because there is a need of whole table
            List<Student> stu = query.list();
            
            stu.forEach(System.out::println);
            
            System.out.println("***********************Break*********************************** ");
            
            SQLQuery query1 = session.createSQLQuery("Select sname,marks from studentdata where marks > 60");
            query1.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List student9 = query1.list();
            for(Object oo : student9)
            {
                Map m = (Map)oo;
                        
                System.out.println(m.get("sname") + " : " + m.get("marks"));
                
            }
            
            
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
