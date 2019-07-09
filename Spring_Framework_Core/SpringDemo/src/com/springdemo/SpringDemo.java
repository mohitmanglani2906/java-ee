
package com.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringDemo 
{
    public static void main(String[] args)
    {
        try
        {
            ApplicationContext context =  new ClassPathXmlApplicationContext("springdemo.xml");
       
            Phone ph;
            ph = (Phone)context.getBean("lenovo");
            ph.showDetails();

            ph=(Phone)context.getBean("samsung");
            ph.showDetails();
            
            //Property1 p = ()
            
            Vivo v= (Vivo)context.getBean("vivo");
            v.showDetails();
            
            Oppo o = (Oppo)context.getBean("oppo");
            o.showDetails();
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
    }   
}
