
package com.mohit;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo
{
    public static void main(String[] args) 
    {
        try
        {
            ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // This is used to pass the xml file to a perticular java class 
            Vehicle obj = (Vehicle)context.getBean("bike");  // this is used to get a bean from anywhere in the application that should be defined in a xml file
                                                           // Vehicle interface is used because it remains common to all the vehicles
                                                           
            Truck t = (Truck)context.getBean("truck");     // Truck is a class that can be also be used as a bean
            t.drive();
            obj.drive();
            
            Tyre t1 = (Tyre)context.getBean("tyre");    // I have used a bean tag for the values of the brand of the Tyre Class 
            System.out.println(t1);
            
            Car c = (Car)context.getBean("car");    // This is used to learn Autowired Annotation
            c.drive();
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
     
   
    }
}
