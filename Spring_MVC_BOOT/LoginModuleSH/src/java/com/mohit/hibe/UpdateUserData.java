
package com.mohit.hibe;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class UpdateUserData 
{
    private final String email_update;
    private final String fname_update;
    private final String lname_update;
    private final String phone_update;
    private final String address_update;
    private final String gender_update;
    private final String password_update;
    
    // Don't use @Autowired for the same base Class
    CreateSession cs = new CreateSession();

    public UpdateUserData(String email_update, String fname_update, String lname_update, String phone_update, String address_update, String gender_update, String password_update) 
    {
        this.email_update = email_update;
        this.fname_update = fname_update;
        this.lname_update = lname_update;
        this.phone_update = phone_update;
        this.address_update = address_update;
        this.gender_update = gender_update;
        this.password_update = password_update;
    }
    
    public boolean updateUserByEmail(String email_session)
    {
        try
        {
           System.out.println("in userUpdateClass");
           Session session = cs.getSession();
           Query query = session.createQuery("Update StudentProfile Set email = :email_update,fname = :fname_update,lname = :lname_update,phone_no = :phone_update,address = :address_update,gender =:gender_update,password = :password_update Where email = :email_session");
           System.out.println("After Query : ");
           Transaction tx = session.beginTransaction();
           System.out.println("in UpdateuserData  : " + email_session);
           query.setParameter("email_update", email_update);
           query.setParameter("fname_update",fname_update);
           query.setParameter("lname_update",lname_update);
           query.setParameter("phone_update",phone_update);
           query.setParameter("address_update",address_update);
           query.setParameter("gender_update",gender_update);
           query.setParameter("password_update",password_update);
           query.setParameter("email_session",email_session);
           int i = query.executeUpdate();
           tx.commit();
           session.close();
           if(i==1) return true;
           
           
                   
           
        }
        
        catch(HibernateException e)
        {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
}
