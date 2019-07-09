
package com.springdemo;


public class Samsung implements Phone
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
    public void showDetails()
    {
        System.out.println("Samsung{" + "price=" + price + ", model=" + model + '}');
    }    
}
