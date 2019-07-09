
package com.mohit;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "update")
@SessionScoped
public class UpdateData 
{
    String mobile,password,name,email,gender,address;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
    public String updateTable(String phone)
    {
        String url = "jdbc:mysql://localhost:3306/jsfemp";
        String uname="root";
        String pass="";
        String query = "UPDATE `userinfo` SET mobile_no=?,NAME=?,email=?,password=?,gender=?,address=? WHERE mobile_no=?";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1,mobile);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,email);
            preparedStatement.setString(4,password);
            preparedStatement.setString(5,gender);
            preparedStatement.setString(6,address);
            preparedStatement.setString(7,phone);
       
            int result =  preparedStatement.executeUpdate();
            if(result==1) return "response.xhtml";
           
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage()); 
        }
        return "invalid.xhtml";
    }
}
