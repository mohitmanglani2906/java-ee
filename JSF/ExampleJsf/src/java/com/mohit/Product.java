
package com.mohit;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="obj",eager=true)
public class Product 
{
    private String name;
    private int qty;
    private double amt;

    public Product() 
    {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }
    
    public String show()
    {
        System.out.println("Name: "  + name + " " + qty + " " + amt);
        
        return "sucess";
    }
    
}
