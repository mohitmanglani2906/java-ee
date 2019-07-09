/*
Here I have created a java class in which we ca see that there is a something different
Here we have to create a persistance.xml file in Source Package/resource/META-INF/persistance.xml

Why we need a JPA?

Because suppose we want to migrate from hibernate to Ibites (ORM tool for database) then JPA comes into the picture and for that we only need
to change configuration of JPA and that is the beauty of JPA 
Thank you!!!11111

*/

package com.mohit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class FetchJPADemo
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Laptop l  = em.find(Laptop.class,51); 
        System.out.println(l);
        em.getTransaction().commit();
    }
}
