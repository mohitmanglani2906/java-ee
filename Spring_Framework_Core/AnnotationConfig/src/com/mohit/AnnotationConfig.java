/*
Here we will see Annotation Based Confirguration that can be use instead of XML based Confirguration
*/


package com.mohit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationConfig {


    public static void main(String[] args) 
    {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);  // For Annotation Based confirguration we have to use this object 
                                                                                               // In which we have to use a java class instead of xml file
        
        Samsung s = (Samsung)factory.getBean(Samsung.class);        // to use object of class samsung we have used here a Samsung.class
        s.config(); 
        
        
    }
    
}
