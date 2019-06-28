package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                margin:0;\n");
      out.write("                padding:0;\n");
      out.write("            }\n");
      out.write("            .updateform{\n");
      out.write("                /*padding: 10px;*/\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                height:100vh;\n");
      out.write("            }\n");
      out.write("            #headerh1{\n");
      out.write("                letter-spacing: 5px;\n");
      out.write("                 padding:10px;\n");
      out.write("                 margin: 10px;\n");
      out.write("            }\n");
      out.write("            .formupdate{\n");
      out.write("                border:1px soild black;\n");
      out.write("                width:50%;\n");
      out.write("                height:50%;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("            .updateinfo{\n");
      out.write("                /*border: 0px solid black;      */\n");
      out.write("                padding:10px;\n");
      out.write("                margin: 10px;\n");
      out.write("                border:none;\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("            #submitinfo\n");
      out.write("            {\n");
      out.write("                font-weight: bold;\n");
      out.write("                box-shadow: 1px 1px 1px 1px gray;\n");
      out.write("            }\n");
      out.write("            #submitinfo:hover{\n");
      out.write("                background-color: coral;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #previous{\n");
      out.write("                text-decoration: none;\n");
      out.write("                width:100px;\n");
      out.write("                height:20px;\n");
      out.write("                padding: 20px;\n");
      out.write("                margin:10px;                \n");
      out.write("                color:black;\n");
      out.write("                background-color: #ccc;\n");
      out.write("                float:right;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>Update Your Information</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
            String pho="";
            String pa="";
            Cookie cookies[] = request.getCookies();
            for(Cookie c:cookies)
            {
                if(c.equals("pho"))
                {
                    pho = c.getValue();
                    System.out.println(pho);
                }
                else
                {
                    pa = c.getValue();
                    System.out.println(pa);
                }
            }
            if(pho==null && pa==null)
            {
                response.sendRedirect("index.jsp");
            }
        
        
        
      out.write("\n");
      out.write("        <div class=\"updateform\">\n");
      out.write("            <a href=\"welcome.jsp\" id=\"previous\">Previous</a>\n");
      out.write("            <form class=\"formupdate\" action=\"\" method=\"get\">\n");
      out.write("                <h1 id=\"headerh1\">Update</h1>\n");
      out.write("                <input type=\"text\" name=\"ufirst_name\" placeholder=\"Enter your Name:\" class=\"updateinfo\">\n");
      out.write("                <input type=\"text\" name=\"ulast_name\" placeholder=\"Enter your last Name:\" class=\"updateinfo\"><br>\n");
      out.write("                <input type=\"email\" name=\"ueail_id\" placeholder=\"Enter your Email id\" class=\"updateinfo\" style=\"width:\"><br>\n");
      out.write("                <input type=\"text\" name=\"umobile_no\" placeholder=\"Enter mobile no:\" class=\"updateinfo\">\n");
      out.write("                <input type=\"date\" name=\"udob\" class=\"updateinfo\"><br>\n");
      out.write("                <input type=\"password\" name=\"upwd\" placeholder=\"Enter password\" class=\"updateinfo\">\n");
      out.write("                <input type=\"password\" name=\"reupwd\" placeholder=\"Enter password again\" class=\"updateinfo\"><br>\n");
      out.write("                <input type=\"radio\" name=\"rd1\" value=\"male\" class=\"updateinfo\">Male &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <input type=\"radio\" name=\"rd1\" value=\"female\" class=\"updateinfo\">Female<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <input type=\"submit\" value=\"Update\" class=\"updateinfo\" style=\"width:100px;\" id=\"submitinfo\">\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("                \n");
      out.write("        </div>\n");
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
