
package com.mohit;

import org.springframework.beans.factory.annotation.Autowired;


public class Samsung 
{
    @Autowired   // This Annotation is used for getting the set values from Class else it will get Null
    MobileProcessor mobileProcessor;

    public MobileProcessor getMobileProcessor()
    {
       return mobileProcessor;
    }
    
    public void setMobileProcessor(MobileProcessor mobileProcessor) 
    {
       this.mobileProcessor = mobileProcessor;
    }
    
    public void config()
    {
        System.out.println("Samsung : S7 " + " 4GB " + " 5.6 inch ");
        mobileProcessor.showprocessor();
    }
}
