
package com.mohit;

import javax.validation.constraints.NotNull;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@ManagedBean(name = "user")
@RequestScoped
public class User 
{
    @NotNull(message = "Name can't be Empty")
    String uname;
    
    @NotNull(message = "Email can't be Empty")
    @Pattern(regexp = "(.*)@gmail.com")        
    String email;
    
    @Min(18)
    int age;
    
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    public int getAge()
    {
        return age;
    }
    
    public void setAge(int age)
    {
        this.age=age;
    }
    
    public String response()
    {
        return "response.xhtml";
    }
    
    
}
