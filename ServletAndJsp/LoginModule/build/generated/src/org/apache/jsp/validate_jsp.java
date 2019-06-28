package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.catalina.filters.RequestDumperFilter;

public final class validate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Validating</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String first_name = request.getParameter("fname");
            String last_name=request.getParameter("lname");
            String email_id = request.getParameter("email");
            String phone  = request.getParameter("phone");
            String dob = request.getParameter("dob");
            String pwd= request.getParameter("pwd");
            String pwd2 = request.getParameter("repwd");
            String gender = request.getParameter("rd1");

            String regex = "(.*)@gmail.com";
           
            if(email_id.matches(regex))
            {
                try{
                    out.println(email_id);
                }
                catch(Exception e)
                {
                    out.println(e.getMessage());
                }
                
            }
            
          /*  if(first_name=="" || last_name=="" || email_id=="" || phone=="" || dob=="" || pwd=="" || pwd2=="")
            {
                    try{
                        response.sendRedirect("index.jsp");
                    }
                    catch(Exception e)
                    {
                        out.println(e.getMessage());
                    }
                
            }
           
           if(!pwd.equals(pwd2))
           {
               try{
                    response.sendRedirect("index.jsp");
               }
               catch(Exception e)
               {
                   out.println(e.getMessage());
               }
               
           }
           
           if(!email_id.matches(regex))
           {
                response.sendRedirect("index.jsp");
           }
            
          
                
                   
                         RequestDispatcher rd = request.getRequestDispatcher("adddata");
                         rd.forward(request,response);   */
                      
                    
                   
            
               
                
           
           
          
            
           
               
            
                
            
        
           
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
