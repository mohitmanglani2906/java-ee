
package com.mohit;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mohit")    // This will work as a <context:component-scan/> as worked in xml file 
                                                // base package is for for all the classes in same package it is valid
public class LaptopConfig
{
    
}
