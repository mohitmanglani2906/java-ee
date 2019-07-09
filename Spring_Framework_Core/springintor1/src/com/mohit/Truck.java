
package com.mohit;

import org.springframework.stereotype.Component;

@Component  // This annotation declares Truck class as a bean in com.mohit package
public class Truck
{
    public void drive()
    {
        System.out.println("Uda raha hai");
    }
}
