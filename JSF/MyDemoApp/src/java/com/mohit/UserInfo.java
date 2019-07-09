
package com.mohit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.RequestScoped;


@ManagedBean(name="userinfo")
@RequestScoped
public class UserInfo 
{
    List<UserData> s; 
    public List<UserData> getUsers() throws Exception
    {
        String url ="jdbc:mysql://localhost:3306/jsfemp";
        String uname="root";
        String pass="";
        int i=0;
        s= new ArrayList<>();
     
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            PreparedStatement preparedStatement = con.prepareStatement("Select * From userinfo");
            ResultSet rs = preparedStatement.executeQuery();
            
//            while(rs.next())
//            {
//                System.out.println(rs.getString("NAME") + " " + rs.getString("email") + " " + rs.getString("gender")  + " " + rs.getString("address"));
//                
//            }
//            System.out.println("\n\n\n\n\n");
//            
            
            while(rs.next())
            {                

               s.add(new UserData(rs.getString("NAME"),rs.getString("email"),rs.getString("gender"),rs.getString("address")));
            }
            
            rs.close();
            preparedStatement.close();
            con.close();
            return s;            
    }
}
