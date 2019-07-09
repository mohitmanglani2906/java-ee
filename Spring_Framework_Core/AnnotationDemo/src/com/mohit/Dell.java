

package com.mohit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dell 
{
    @Autowired
    @Qualifier("i5Processor") // This annotation is used to give specification that which Class we want to work with        
    Processor processor;

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
    
    public void config()
    {
        System.out.println("Dell  : Inspiron 15 " + "I3 6th Generation " + "Intel ");
        processor.showConfig();
    }
}
