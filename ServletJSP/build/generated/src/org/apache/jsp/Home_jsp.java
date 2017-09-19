package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/Menu.jsp");
    _jspx_dependants.add("/Footer.jsp");
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

      out.write("   <head>\n");
      out.write("        <style>\n");
      out.write("    body{\n");
      out.write("    background-image:url(ab.jpg);\n");
      out.write("    background-size:1370px 850px;\n");
      out.write("    background-repeat:no-repeat;\n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("<center>\n");
      out.write("    <table border=\"1\" width=\"80%\">\n");
      out.write("    <tr bgcolor=\"black\">\n");
      out.write("        <td> <marquee> <font color=\"white\"><h1>User Management System</h1></font></marquee>\n");
      out.write("    </table>\n");
      out.write("</center>");
      out.write('\n');
      out.write("<center>\n");
      out.write("    <table border=\"1\" width=\"80%\">\n");
      out.write("    <tr bgcolor=\"blue\">\n");
      out.write("        <td><center> <a href=\"Home.jsp\"><button type=\"button\">HOME</button></a>\n");
      out.write("            <a href=\"Jstl.jsp\"><button type=\"button\">SHOW</button></a>\n");
      out.write("            <a href=\"Register.jsp\"><button type=\"button\">UPDATE</button></a>\n");
      out.write("            <a href=\"Search.jsp\"><button type=\"button\">SEARCH</button></a>\n");
      out.write("            <a href=\"Register.jsp\"><button type=\"button\">ADD RECORD</button></a>\n");
      out.write("           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"logout.jsp\"><button type=\"button\">LOGOUT</button></a>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("    </table>\n");
      out.write("</center>");
      out.write("\n");
      out.write("<center>\n");
      out.write("    <h1>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        WELCOME TO HOME <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("    </h1>\n");
      out.write("</center>\n");
      out.write("<center>\n");
      out.write("    <table width=\"80%\">\n");
      out.write("        <tr >\n");
      out.write("            <td><center>Copyright@KanchanAssociate.in 2014 </center> </td>\n");
      out.write("    </tr>\n");
      out.write("    </center>");
      out.write("\n");
      out.write("</body>\n");
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
