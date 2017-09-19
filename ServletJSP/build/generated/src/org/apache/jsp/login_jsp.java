package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("    body{\n");
      out.write("    background-image:url(ab.jpg);\n");
      out.write("    background-size:1370px 850px;\n");
      out.write("    background-repeat:no-repeat;\n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<fieldset>\n");
      out.write("    \n");
      out.write("    <legend > Login Page </legend>\n");
      out.write("    <center>\n");
      out.write("        <font color=\"green\">  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("    <form action=\"la\" method=\"post\"  >\n");
      out.write("  <br/><br/>\n");
      out.write("        <h3>USERNAME :<input type=\"text\" name=\"userid\"  > <br/><br/> <br/>\n");
      out.write("    \n");
      out.write("            PASSWORD :<input type=\"password\" name=\"pass\" > <br/><br/> <br/><br/>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" Value=\"SUBMIT\" >      <a href=\"Register.jsp\">  <input type=\"button\" value=\"SIGN IN\" ></a>\n");
      out.write("        </h3>\n");
      out.write("   \n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("    \n");
      out.write("        </fieldset>\n");
      out.write("</body>\n");
      out.write("</html>");
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
