
package com.mohit;


import org.springframework.stereotype.Component;

@Component    
public class I3Processor implements Processor
{

    @Override
    public void showConfig()
    {
        System.out.println("Very Good Processor ");
    }
    
}
