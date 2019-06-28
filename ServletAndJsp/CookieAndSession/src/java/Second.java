import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Second extends HttpServlet {
public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException

{
    res.setContentType("text/html");
    PrintWriter out =res.getWriter();
    HttpSession session=req.getSession(false);
    String name=(String)session.getAttribute("username");
    out.print("Hello "+name);
    out.close();
}
}