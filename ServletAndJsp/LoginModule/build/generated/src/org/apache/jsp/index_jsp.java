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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Sign up</title>\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\t*{\n");
      out.write("\t\t\tpadding:0;\n");
      out.write("\t\t\tmargin:0;\n");
      out.write("\t\t}\n");
      out.write("\t\t.header{\n");
      out.write("\t\t\twidth:98.7vw;\n");
      out.write("\t\t\theight:10vh;\n");
      out.write("\t\t\tbackground-color: white;\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t\tbox-shadow: 0 2px 5px 0 rgba(0,0,0,0.16), 0 2px 10px 0 rgba(0,0,0,0.12);\n");
      out.write("\t\t\tposition: fixed;\n");
      out.write("                        z-index: 1000;\n");
      out.write("\t\t\ttop: 0px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.h1{\n");
      out.write("\t\t\tmargin-right:15px;\n");
      out.write("\t\t}\n");
      out.write("\t\ta{\n");
      out.write("\t\t\ttext-decoration:none;\n");
      out.write("\t\t\twidth: 100px;\n");
      out.write("\t\t\tpadding: 8px 16px;\n");
      out.write("\t\t\tcolor: black; \n");
      out.write("\t\t}\n");
      out.write("\t\t.h1 li{\n");
      out.write("\t\t\tfloat:right;\n");
      out.write("\t\t\tdisplay:block;\n");
      out.write("\t\t\twidth:60px;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tpadding: 8px 16px;\n");
      out.write("\t\t\tmargin-top: 15px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.h1 a:hover{\n");
      out.write("\t\t\tbackground-color:#ccc;\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t\tfont-weight: bold;\n");
      out.write("\t\t\tborder-radius: 20px;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.middle{\n");
      out.write("\t\t\twidth:98.7vw;\n");
      out.write("\t\t\theight:95vh;\n");
      out.write("                        margin-top: 100px;\n");
      out.write("                        background-color: #f1f1f1;\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t.login{\n");
      out.write("\t\t\twidth:49vw;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\theight: 100vh;\n");
      out.write("\t\t\tfloat: left;\n");
      out.write("\t\t}\n");
      out.write("\t\t.signup{\n");
      out.write("\t\t\twidth:49.7vw;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\theight:100vh;\n");
      out.write("\t\t\tfloat: left;\n");
      out.write("\t\t}\n");
      out.write("\t\t.formfill{\n");
      out.write("\t\t\twidth:70%;\n");
      out.write("\t\t\theight:70%;\n");
      out.write("\t\t\tbackground-color:white;\n");
      out.write("\t\t\tmargin-left: 50px;\n");
      out.write("\t\t\tmargin-top: -50px;\n");
      out.write("\t\t\tbackground-color:coral;\n");
      out.write("\t\t\tborder-radius:40px;\n");
      out.write("                        box-shadow: 0 2px 5px 0 rgba(0,0,0,0.16), 0 2px 10px 0 rgba(0,0,0,0.12);\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t.signup_input{\n");
      out.write("\t\t\t\twidth:calc(200px-8px);\n");
      out.write("\t\t\t\theight:3vh;\n");
      out.write("\t\t\t\tpadding: 8px; \n");
      out.write("\t\t\t\tborder:1px solid black;\n");
      out.write("\t\t\t\tmargin-top: 40px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.signupform{\n");
      out.write("\t\t\tmargin-left: 50px;\n");
      out.write("\t\t\tmargin-top: 50px;\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t#btnsubmit{\n");
      out.write("\t\t\twidth:150px;\n");
      out.write("\t\t\theight:50px;\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t\tfont-family: verdana;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t\tfont-weight: 800;\n");
      out.write("\t\t\tfont-size: 15px;\n");
      out.write("\t\t\tborder:0px solid black;\n");
      out.write("\t\t\tbackground-color:#ccc;\n");
      out.write("\t\t}\n");
      out.write("\t\t#btnsubmit:hover\n");
      out.write("\t\t{\n");
      out.write("\t\t\tbackground-color: white;\n");
      out.write("\t\t}\n");
      out.write("\t\t.loginform{\n");
      out.write("\t\t\twidth:50%;\n");
      out.write("\t\t\theight:50%;\n");
      out.write("\t\t\tbackground-color:coral;\n");
      out.write("\t\t\tmargin-left: 100px;\n");
      out.write("\t\t\tmargin-top: 50px;\n");
      out.write("\t\t\tborder-radius: 20px;\n");
      out.write("                        box-shadow: 0 2px 5px 0 rgba(0,0,0,0.16), 0 2px 10px 0 rgba(0,0,0,0.12);\n");
      out.write("\t\t}\n");
      out.write("\t\t.login_input{\n");
      out.write("\t\t\t\twidth:calc(200px-8px);\n");
      out.write("\t\t\t\theight:3vh;\n");
      out.write("\t\t\t\tpadding: 8px; \n");
      out.write("\t\t\t\tborder:1px solid black;\n");
      out.write("\t\t\t\tmargin-top: 40px;\n");
      out.write("\t\t\t\tmargin-left: 50px;\n");
      out.write("\t\t}\n");
      out.write("\t\t#btnlogin{\n");
      out.write("\t\t\twidth:150px;\n");
      out.write("\t\t\theight:50px;\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t\tfont-family: verdana;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t\tfont-weight: 800;\n");
      out.write("\t\t\tfont-size: 15px;\n");
      out.write("\t\t\tborder:0px solid black;\n");
      out.write("\t\t\tbackground-color:#ccc;\n");
      out.write("\t\t\tmargin-top: 15px;\n");
      out.write("\t\t\tmargin-left: 50px;\n");
      out.write("\t\t}\n");
      out.write("\t\t#btnlogin:hover{\n");
      out.write("\t\t\tbackground-color: white;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\t\n");
      out.write("        \n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t<ul class=\"h1\">\n");
      out.write("\t\t\t<li><a href=\"#address\">Address</a></li>\n");
      out.write("\t\t\t<li><a href=\"#contact\">Contact</a></li>\n");
      out.write("\t\t\t<li><a href=\"#about\">About</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"middle\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"login\">\n");
      out.write("\t\t\t<div class=\"loginform\">\n");
      out.write("\t\t\t\t<form action=\"loginadd\" method=\"post\">\n");
      out.write("\t\t\t\t\t<h1 style=\"margin-left: 30px;\">Log in your Account</h1>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"phone\" placeholder=\"Enter Mobile no\" class=\"login_input\"><br>\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"pwd\" placeholder=\"Password\" class=\"login_input\" style=\"margin-top: 15px;\"><br>\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"btnlogin\" value=\"Log In\" id=\"btnlogin\">\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"signup\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"formfill\">\n");
      out.write("\t\t\t\t<form action=\"validate.jsp\" method=\"post\" style=\"margin-top: 100px;\" class=\"signupform\">\n");
      out.write("\t\t\t\t\t<h1>Create An Account Free!!</h1>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"fname\" placeholder=\"First Name\" class=\"signup_input\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"lname\" placeholder=\"Last Name \" class=\"signup_input\">\n");
      out.write("\t\t\t\t\t<input type=\"email\" name=\"email\" placeholder=\"Enter Email\" class=\"signup_input\" style=\"margin-top: 15px;width:360px\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"phone\" placeholder=\"Enter Mobile no\" class=\"signup_input\" style=\"margin-top: 15px;\">\n");
      out.write("\t\t\t\t\t<input type=\"date\" name=\"dob\" placeholder=\"Date of Birth \" class=\"signup_input\" style=\"margin-top: 15px;width:170px;\">\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"pwd\" placeholder=\"Enter password \" class=\"signup_input\" style=\"margin-top: 15px;\">\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"repwd\" placeholder=\"ReEnter password \" class=\"signup_input\" style=\"margin-top: 15px;\">\n");
      out.write("\t\t\t\t\t<br><br>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"rd1\" value=\"male\"  style=\"margin-top: 0px;padding: 0px;\"> Male\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"rd1\" value=\"female\"  style=\"margin-top: 0px;padding: 0px;\"> Female\n");
      out.write("\t\t\t\t\t<br><br>\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"btn\" value=\"Create Account\"  id=\"btnsubmit\" \n");
      out.write("                                                                                               \n");
      out.write("\t\t\t\t\t>\t\t\t\t\t\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("       \n");
      out.write("</body>\n");
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
