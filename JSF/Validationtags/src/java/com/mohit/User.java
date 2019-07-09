
package com.mohit;

import javax.faces.bean.ManagedBean;




@ManagedBean(name="user")
public class User 
{
    String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
