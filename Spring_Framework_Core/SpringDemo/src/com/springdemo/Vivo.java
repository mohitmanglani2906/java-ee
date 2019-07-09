
package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vivo implements Phone
{
 
    @Autowired
    private Property1 p1;
    
    public Property1 getP1() {
        return p1;
    }

    public void setP1(Property1 p1) {
        this.p1 = p1;
    }
    


    @Override
    public void showDetails() 
    {
        System.out.println("Property1 " + p1);
    }

   
    
    
    
    
}
