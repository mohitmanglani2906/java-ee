import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class First extends HttpServlet {
public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException

{
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        String uname=req.getParameter("uname");
        String passwd=req.getParameter("passwd");
        
        if(uname.equals("Mohit Manglani") && passwd.equals("mohit2906"))
        {
            out.print("Welcome " +uname);
            HttpSession session=req.getSession();
            session.setAttribute("username",uname);
            out.print("<html><body>");
            out.print("<form action='second' method='post'>");
            out.print("<input type='submit' value='Go'>");
            out.print("</form>");
            out.print("</body></html>");
        }
        else
        {
            out.print("Sorry, Username or Password is incorrect");
            RequestDispatcher rd=req.getRequestDispatcher("index.html");
            rd.include(req, res);
        }
        
        out.close();
}
}