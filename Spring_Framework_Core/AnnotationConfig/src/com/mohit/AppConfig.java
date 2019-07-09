/*This file is a replacement of xml file and can be used in Annotation based confirguration*/

package com.mohit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   // To denote that this is a confirgiration file to use Annotation based confirguration
public class AppConfig 
{
    @Bean                      // This represents a data method which can be used for to create a object of a class
    public Samsung getPhone()
    {
        return new Samsung();
    }
    
    @Bean
    public MobileProcessor getprocessor()
    {
        return new SnapDragon();     
    }
            
    
}
