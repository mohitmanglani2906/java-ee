/*This is Tyre Class with getter and setter method which is used for getting and setting the properties of the Tyre class*/




package com.mohit;

import org.springframework.stereotype.Component;

@Component
public class Tyre 
{
    private String brand;
    
//    public Tyre(String brand)
//    {
//        this.brand=brand;          // Constructor Injection
//    }
    
    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand) {  // Setter Injection
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tyre{" + "brand=" + brand + '}' + " Its working ";
    }
    
    
}
