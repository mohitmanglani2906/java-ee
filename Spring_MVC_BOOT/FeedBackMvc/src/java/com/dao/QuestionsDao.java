
package com.dao;

import com.mohit.Questions;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class QuestionsDao
{
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void saveQuestions(Questions questions) 
    {
           Session session = sessionFactory.getCurrentSession();
           session.save(questions);
    }
    
        @Transactional
	public List<Questions> getQuestions() {
		
		Session session = sessionFactory.getCurrentSession();
		// not sql... it is Hql
		Query q = session.createQuery("from Questions");
		List<Questions> questions = q.list();
		
			
		return questions;
	}
        
        @Transactional
        public List<Questions> gettestQuestions()
        {
            Session session = sessionFactory.getCurrentSession();
            SQLQuery query = session.createSQLQuery("Select * from Questions order by rand() limit 4");
            query.addEntity(Questions.class);
            List<Questions> l = query.list();
            System.out.println(l + "Hereeeeeeeee");
            return l;
        }

        

        
    
}
