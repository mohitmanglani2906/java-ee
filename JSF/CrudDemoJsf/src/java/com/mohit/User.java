
package com.mohit;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class User 
{
    String name,email,mobile,password,address,gender;
    ArrayList userList;
    private Map<String,Object> sessionMap =  FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
    Connection connection;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    
    public Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/3306/jsfemp","root","");   
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
         return connection;
    }
    
    
    public ArrayList userList()
    {
        try
        {
            userList = new ArrayList();
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from userinfo");
            
            while(rs.next())
            {
                User user = new User();
                user.setName(rs.getString("NAME"));
                user.setEmail(rs.getString("email"));
                user.setMobile(rs.getString("mobile_no"));
                user.setAddress(rs.getString("address"));
                user.setPassword(rs.getString("password"));
                user.setGender(rs.getString("gender"));
                userList.add("user");
            }
            getConnection().close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return userList;
    }
    
    public String save()
    {
        int result=0;
        try
        {
            PreparedStatement stmt = getConnection().prepareStatement("insert into userinfo(mobile_no,NAME,email,passsword,gender,address) values(?,?,?,?,?,?)");
            stmt.setString(1,mobile);
            stmt.setString(2,name);
            stmt.setString(3,email);
            stmt.setString(4,password);
            stmt.setString(5,gender);
            stmt.setString(6,address);
            result = stmt.executeUpdate();
            getConnection().close();
            
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        if(result!=0)
        {
            return "index.xhtml?faces-redirect=true";
        }
      
            return "create.xhtml?faces=redirect=true";
    }    
    
    public String edit(String mobile)
    {
        User user = null;
        try
        {
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("select * from userinfo where mobile_no ="+(mobile));
            rs.next();
            user  = new User();
            user.setName(rs.getString("NAME"));
            user.setEmail(rs.getString("email"));
            user.setMobile(rs.getString("mobile_no"));
            user.setPassword(rs.getString("password"));
            user.setGender(rs.getString("gender"));
            user.setAddress(rs.getString("address"));
            sessionMap.put("editUser",user);
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return "/edit.xhtml?faces-redirect=true";
    }
    
    public String update(User u) throws SQLException
    {
        try
        {
            PreparedStatement stmt = getConnection().prepareStatement("update userinfo set NAME=?,email=?,password=?,gender=?,address=? where mobile_no=?");
            stmt.setString(1,u.getName());
            stmt.setString(2,u.getEmail());
            stmt.setString(3,u.getPassword());
            stmt.setString(4,u.getGender());
            stmt.setString(5,u.getAddress());
            stmt.setString(6,u.getMobile());
        }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
        
        return "/index.xhtml/faces-redirect=true";
    }
    
    
    public void delete(String mobile)
    {
        try
        {
            PreparedStatement stmt =  getConnection().prepareStatement("delete from userinfo where mobile_no = "+mobile);
            stmt.executeUpdate();
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public String getGenderName(char gender)
    {
        if(gender=='M') return "Male";
        else return "Female";
    }
}


