/*
Advic ------> What 
When ---------> Before and After a method should be called??
*/



package com.mohit;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper
{
    @Before("execution(public void show())")
    public void log()
    {
        System.out.println("In Log file For Helper Class ");
    }
}
