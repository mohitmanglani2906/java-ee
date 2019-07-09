
package com.mohit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // This annotation declares Car class as a bean in com.mohit package
public class Car implements Vehicle
{
    @Autowired    // It will take automatically From Tyre Class if values are assigned
    private Tyre tyre;

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
    
    @Override
    public void drive()
    {
        System.out.println("Chal Raha hai " + tyre);
    }
}
