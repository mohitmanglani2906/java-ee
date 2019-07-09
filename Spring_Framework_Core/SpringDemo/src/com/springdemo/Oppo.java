
package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class Oppo implements Phone
{
    @Autowired
    private Property2 p2;

    public Property2 getP2() {
        return p2;
    }

    public void setP2(Property2 p2) {
        this.p2 = p2;
    }

    @Override
    public void showDetails() 
    {
        System.out.println("Proprety2  " + p2);
    }
    
    
}
