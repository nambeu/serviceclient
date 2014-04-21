package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_005fus_jspx extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div version=\"2.0\">");
      out.write("<form name=\"formulaire\">");
      out.write("<fieldset>");
      out.write("<legend class=\"legend\">");
      out.write("Contact us");
      out.write("</legend>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"login\">");
      out.write("FirstName and name:");
      out.write("</label>");
      out.write("<input placeholder=\"Enter name\" id=\"name\" size=\"25\" class=\"form-control\" type=\"text\" />");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"email\">");
      out.write("Email address");
      out.write("</label>");
      out.write("<input placeholder=\"Enter email\" id=\"email\" class=\"form-control\" type=\"email\" />");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"login\">");
      out.write("Object :");
      out.write("</label>");
      out.write("<input placeholder=\"Enter object\" id=\"object\" class=\"form-control\" type=\"text\" />");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"login\">");
      out.write("Message :");
      out.write("</label>");
      out.write("<textarea rows=\"4\" cols=\"40\" id=\"message\" class=\"form-control\">");
      out.write("Enter message");
      out.write("</textarea>");
      out.write("</div>");
      out.write("<button class=\"btn btn-success\" type=\"submit\">");
      out.write("Validated");
      out.write("</button>");
      out.write("</fieldset>");
      out.write("</form>");
      out.write("</div>");
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
