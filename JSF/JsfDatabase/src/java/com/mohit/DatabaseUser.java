
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;





@ManagedBean(name= "user")
@RequestScoped
public class DatabaseUser
{

    @NotNull(message = "Name can't be empty")
    String name;
     
    @NotNull(message = "Email can't be empty")
    @Pattern(regexp = "(.*)@gmail.com")        
    String email;
   

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
  
    public boolean save() throws ClassNotFoundException, SQLException
    {
            String url = "jdbc:mysql://localhost:3306/jsfemp";
            String uname="root";
            String pass="";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        PreparedStatement st = con.prepareStatement("Insert into userdata(name,email) values (?,?)");
        st.setString(1, this.getName());
        st.setString(2,this.getEmail());
        int i = st.executeUpdate();
        if(i==1) return true;
       
        return false;
        
    }
    
    public String submit() throws ClassNotFoundException, SQLException
    {
        if(this.save())
        {
            return "response.xhtml";
        }
        else
        {
            return "index.xhtml";
        }
    }
}
