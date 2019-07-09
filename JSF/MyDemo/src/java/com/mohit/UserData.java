package com.mohit;


import java.sql.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



@ManagedBean(name= "user")
@RequestScoped
public class UserData 
{
    String name;
    String email;
    String mobile;
    String address;
    String gender;
    String password;

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String save()
    {
        String url="jdbc:mysql://localhost:3306/jsfemp";
        String uname="root";
        String pass="";
        String query = "INSERT INTO `userinfo`(`mobile_no`,`NAME`,`email`,`password`,`gender`,`address`) VALUES(?,?,?,?,?,?)";
        //UserData userData = new UserData();
        try
        {
           
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection(url,uname,pass);
          
           PreparedStatement preparedStatement = con.prepareStatement(query);
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
           if(result==1) return "response.xhtml";
           
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        return "invalid.xhtml";
    }
}
