package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Scanner;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

   // this is declarative which is instance variable in servlet
            int coeff=3;
            Scanner s;
          
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/home.jsp");
  }

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
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write(" ");
      out.write(" \n");
      out.write("\n");
      out.write("  <!--This is called directive statement-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Jsp</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"color:black;\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        ");

            out.println(85);
         
      out.write("\n");
      out.write("         <hr>\n");
      out.write("         <p id=\"demo\"> </p> \n");
      out.write("         <script type=\"text/javascript\">\n");
      out.write("             function myFunction(p)\n");
      out.write("             {\n");
      out.write("                 return p; \n");
      out.write("             }\n");
      out.write("             document.getElementById(\"demo\").innerHTML = myFunction(");
      out.print( coeff );
      out.write(");\n");
      out.write("             \n");
      out.write("             </script>\n");
      out.write("             \n");
      out.write("             \n");
      out.write("         \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<!--This will be called first as we have included in header of the current file-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Index jsp</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#ccc\" style=\"color:white;\">\n");
      out.write("         ");
  // delimeter // scriplet
                int i =Integer.parseInt(request.getParameter("num1")); //implicit object i.e request
                int j= Integer.parseInt(request.getParameter("num2"));
                int k = i+j;
                out.println("Output is : " + k);
                
          
      out.write("      \n");
      out.write("                \n");
      out.write("          ");
      out.write("<!--You can call this file here but once in a JSP of the current file-->\n");
      out.write("          \n");
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
