
package com.mohit.hibe;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Component;


@Component
public class UserExits
{
    
    
    public boolean userExitsOrNot(String emailid)
    {
        try
        {
            Session session = new CreateSession().getSession();
            Query query = session.createSQLQuery("Select email From StudentProfile Where email = :emailid ");
            query.setString("emailid",emailid);
            String str = (String)query.uniqueResult();
            System.out.println("in User Exits !!" + emailid);
//            System.out.println(str);
            if(str==null)
            {
                System.out.println("Here In the userExits!!!");
                return false;
            }  
            else
            {   
                System.out.println("In Return True!!");
                return true;
            }
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage() + " Error:   ");
        }
        return false;
    }
    
    public boolean checkEmailAndPassword(String email,String password)
    {
        try
        {
            Session session = new CreateSession().getSession();
            Query query = session.createSQLQuery("Select email,password From StudentProfile where email = :email And password = :password");
            query.setParameter("email",email);
            query.setParameter("password",password);
            List<Object[]> result = (List<Object[]>)query.list();
            System.out.println(result);
            for(Object o[] : result)
            {
                if(o[0].equals(email) && o[1].equals(password))
                {
                    return true;
                }
            }
            
            
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
}
