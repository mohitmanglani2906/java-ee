
package com.mohit;

import org.springframework.stereotype.Component;
 
@Component  // This annotation declares Bus class as a bean in com.mohit package
public class Bike implements Vehicle
{
    @Override
    public void drive()
    {
        System.out.println("Bhagg Raha hai");
    }
}
