
package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.faces.bean.ManagedBean;


@ManagedBean(name = "delete")
public class DeleteData 
{
   int result=0;
   public int deleteAccount(String phone)
    {
        String url="jdbc:mysql://localhost:3306/jsfemp";
        String uname="root";
        String pass="";
        String query = "Delete from userinfo where mobile_no=?";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1,phone);
            result = preparedStatement.executeUpdate();
            System.out.println(result  +  "Delete java hereeeeeeeeeeeeeee   ");
            return result;
            
            
        
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
