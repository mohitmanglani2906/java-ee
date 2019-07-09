
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;





@ManagedBean
@SessionScoped
@RequestScoped
@ApplicationScoped
public class UserInfo
{
     public List<UserData> getUsers() throws Exception
    {
        String url ="jdbc:mysql://localhost:3306/stu";
        String uname="root";
        String pass="";
        int i=0;
        List<UserData> s = new ArrayList<>();
     
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            PreparedStatement preparedStatement = con.prepareStatement("Select * From student");
            ResultSet rs = preparedStatement.executeQuery();
            

            System.out.println("\n\n\n\n\n");
            
            UserData sd1 = new UserData();
            while(rs.next())
            {                

                sd1.setName(rs.getString("Name"));
                sd1.setRollno(rs.getInt("Roll"));
                s.add(sd1);
            }
            
            rs.close();
            preparedStatement.close();
            con.close();
            return s;            
    }
}
