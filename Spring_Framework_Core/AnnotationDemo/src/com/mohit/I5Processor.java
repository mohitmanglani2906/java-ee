
package com.mohit;

import org.springframework.stereotype.Component;

@Component
//@Primary  This is used to give priority over other Classes like wise I3Processor Class
public class I5Processor implements Processor
{

    @Override
    public void showConfig() 
    {
        System.out.println("Obvious Better than I3 Processor");
    }
    
}
