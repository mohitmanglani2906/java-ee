
package com.mohit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "login")
@RequestScoped
@SessionScoped
@ApplicationScoped
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
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("Select mobile_no,password from userinfo");
            String udata1 = mobile;
            String udata2 = password;
            System.out.println(rs.toString() + "Hrreeeeeeeeeeeeeeee");
            while(rs.next())
            {
                
                if(udata1.equals(rs.getString(1)) && udata2.equals(rs.getString(2)))
                {
                    FacesContext.getCurrentInstance().getExternalContext().addResponseCookie("uname",rs.getString(1),null);
                    FacesContext.getCurrentInstance().getExternalContext().addResponseCookie("pass",rs.getString(2),null);
                    return "welcome.xhtml?faces-redirect=true";
                }
            }
            
            
            
//            PreparedStatement preparedStatement = con.prepareStatement("select mobile_no,password from userinfo");
//            preparedStatement.setString(1,mobile);
//            preparedStatement.setString(2,password);
//            System.out.println("in Login.java " + mobile);
//            System.out.println("In Login Java "+ password);
//            ResultSet result = preparedStatement.executeQuery();
//            
//            while(result.next())
//            {
//               if(mobile.equlas(result.getString(1)))
//               {
//                   
//               }
//            }
//            
            
            
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        return "login.xhtml";
    }
    
    
}
