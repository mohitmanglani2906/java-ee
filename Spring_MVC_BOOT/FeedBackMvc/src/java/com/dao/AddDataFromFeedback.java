
package com.dao;

import com.mohit.UserData;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Component;

@Component           // this says you will have to add this class into dispatcher-servlet.xml file
public class AddDataFromFeedback
{
//    UserData userdata=null;
    
    @Autowired       // This creates the object of SessionFactory class using dispatcher-servler.xml file
    private SessionFactory sessionFactory;
    
    @Transactional   // This says you want to do transaction with database specified in dispatcher-servler.xml file
    public boolean addUser(UserData userData)
    {
        try
        {
            System.out.println("The User Feedback Data is : " + userData);
            
            Session session = sessionFactory.getCurrentSession();
            session.save(userData);
            return true;
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage() + "Here is a error...........");
        }
        return false;
    }
    
    @Transactional
    public List<UserData> getAllFeedBack()
    {
             List<UserData> l=null;
             
            try
            {
                Session session = sessionFactory.getCurrentSession();
                Query q = session.createQuery("From UserData");
                l = (List<UserData>)q.list();
                return l;
             }
    
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            return l;
            
    }
}
