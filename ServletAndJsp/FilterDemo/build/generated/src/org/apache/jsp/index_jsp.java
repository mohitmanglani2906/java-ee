package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title></title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("        *{\n");
      out.write("            margin:0;\n");
      out.write("            padding:0;\n");
      out.write("        }\n");
      out.write("            #sub1{\n");
      out.write("                width:150px;\n");
      out.write("                height:50px;\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                color:black;\n");
      out.write("                padding:8px;\n");
      out.write("                border:0px solid black;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 20px;\n");
      out.write("                margin-left: 230px;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                box-shadow: 2px 2px grey;\n");
      out.write("            }\n");
      out.write("            #sub1:hover{\n");
      out.write("                background-color: #ccc;\n");
      out.write("            }\n");
      out.write("            .d1{\n");
      out.write("                width:400px;\n");
      out.write("                height:150px;\n");
      out.write("                background-color: coral;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                margin-left: 100px;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                box-shadow: 2px 2px 2px 2px grey;\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                margin-left: 40px;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                height: 25px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            p{\n");
      out.write("                margin-left: 40px;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <h1 style=\"color:red;\">Password and Username should contain more than one word</h1>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"add\" method=\"get\">\n");
      out.write("            <div class=\"d1\">\n");
      out.write("                <p style=\"float: left;\"> Enter Name   :</p><input type=\"text\" name=\"val1\" placeholder=\"Enter name: \" style=\"float: left;margin-left: 60px;\"><br><br>\n");
      out.write("                 \n");
      out.write("                 <p style=\"float: left;\">Enter Password:  </p> <input type=\"password\" name=\"pwd\" placeholder=\"Enter Password:\" style=\"float: left;\">\n");
      out.write("                 <br><br>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <input type=\"submit\" id=\"sub1\">\n");
      out.write("\n");
      out.write("        </form>\n");
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
