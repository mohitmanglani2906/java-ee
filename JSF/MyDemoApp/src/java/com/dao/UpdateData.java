
package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "update")
@RequestScoped
@SessionScoped
@ApplicationScoped
public class UpdateData 
{
    String name,mobile,password,email,gender,address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
      public String updateTable(String phone)
      {
          String url="jdbc:mysql://localhost:3306/jsfemp";
          String uname="root";
          String pass="";
          String query = "UPDATE `userinfo` SET mobile_no=?,NAME=?,email=?,address=?,gender=?,password=? Where mobile_no=?";
          try
          {
              
              Class.forName("com.mysql.jdbc.Driver");
              Connection con = DriverManager.getConnection(url,uname,pass);
              PreparedStatement preparedStatement = con.prepareStatement(query);
              preparedStatement.setString(1,mobile);    System.out.println(mobile);
              preparedStatement.setString(2,name);      System.out.println(name);
              preparedStatement.setString(3,email);     System.out.println(email);
              preparedStatement.setString(4,address);   System.out.println(address);
              
              if(gender.equals("M")) {gender="MALE";}
              else {gender="FEMALE";}
              preparedStatement.setString(5,gender);     System.out.println(gender);
               
              preparedStatement.setString(6,password);   System.out.println(password);
              preparedStatement.setString(7,phone);      System.out.println(phone);
              
              int result=preparedStatement.executeUpdate();
              System.out.println(result + "In Update.Java");
              
              if(result==1)
              {
                  return "showchanges.xhtml";
                          
              }
                      
          }
          
          catch(Exception e)
          {
              System.out.println(e.getMessage());
          }
          return "/welcome.xhtml";
      }
}
