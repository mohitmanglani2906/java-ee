package com.mohit;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "login")
@RequestScoped
@SessionScoped
public class Login 
{
    String mobile,password;

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
    
    public String checkCredentials()
    {
        String url="jdbc:mysql://localhost:3306/jsfemp";
        String uname="root";
        String pass = "";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            PreparedStatement preparedStatement = con.prepareStatement("select mobile_no,password from userinfo where mobile_no=? AND password=?");
            preparedStatement.setString(1,mobile);
            preparedStatement.setString(2,password);
            System.out.println("in Login.java " + mobile);
            boolean result = preparedStatement.execute();
            if(result)
            {
                return "faces/welcome.xhtml?faces-redirect=true";
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        return "index.xhtml";
    }
    
    public String updateData()
    {
        System.out.println("update Called");
        return "update.xhtml?faces-redirect=true";
    }
    
  public String deleteData(String phone)
  {
      
      String url="jdbc:mysql://localhost:3306/jsfemp";
      String uname = "root";
      String pass="";
      String query="Delete from userinfo where mobile_no=?";
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url,uname,pass);
          PreparedStatement preparedStatement = con.prepareStatement(query);
          preparedStatement.setString(1,phone);
          int result = preparedStatement.executeUpdate();
          
          if(result==1) 
          {
              return "index.xhtml";
          }   
      }
      catch(Exception e)
      {
          System.out.println(e.getMessage());
      }
      return "welcome.xhtml";
  }
}
