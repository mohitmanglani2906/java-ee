
package com.mohit.hibe;

import com.mohit.dao.StudentProfile;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Component;

@Component
public class CreateSession
{
    
    public Session getSession()
    {
        Configuration con = new Configuration().configure().addAnnotatedClass(StudentProfile.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory factory = con.buildSessionFactory(reg);
        Session session  = factory.openSession();
        return session;
        
    }
    
    
    
    
}
