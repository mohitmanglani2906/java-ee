
package com.mohit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationDemo {

    
    public static void main(String[] args) 
    {
      ApplicationContext factory = new AnnotationConfigApplicationContext(LaptopConfig.class);
      
      Dell d = (Dell)factory.getBean(Dell.class);
      d.config();
    }
    
}
