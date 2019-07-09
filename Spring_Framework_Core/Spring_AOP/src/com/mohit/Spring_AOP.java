/*
    Spring AOP stands for Aspect Oriented Programming that referes Cross Cuting Platform
    In this Programmer no need to make any Object to call a method a class that refers Object Oriented Programming(OOP)
    To use this we are only required to use annotation using given by jar files 
*/



package com.mohit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Spring_AOP 
{


    public static void main(String[] args) 
    {
      ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      Starting st =context.getBean(Starting.class);
      st.show();
      
    }
    
}
