
package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Property1 
{
    private float price;
    private String model;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Property1{" + "price=" + price + ", model=" + model + '}';
    }
    
    
}