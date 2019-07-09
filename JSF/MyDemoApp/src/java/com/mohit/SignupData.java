
package com.mohit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;


@ManagedBean(name="user")
@RequestScoped
@ViewScoped
@SessionScoped
@ApplicationScoped
public class SignupData
{
    
    String mobile,password,email,address,name;
    
    String gender;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public String save()
    {
        String url="jdbc:mysql://localhost:3306/jsfemp";
        String uname="root";
        String pass="";
        String query = "INSERT INTO `userinfo`(`mobile_no`,`NAME`,`email`,`password`,`gender`,`address`) VALUES(?,?,?,?,?,?)";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,uname,pass);
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            
            preparedStatement.setString(1,mobile);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,email);
            preparedStatement.setString(4,password);

            if(gender.equals("M")) gender="MALE";
            else gender="FEMALE";
            preparedStatement.setString(5,gender);

            preparedStatement.setString(6,address);

            int result = preparedStatement.executeUpdate();
            System.out.println(result);
            if(result==1) return "login.xhtml?faces-redirect=true";
            
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return "index.xhtml";
    }
    
    
    
}
