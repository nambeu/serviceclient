package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_005fup_jspx extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<legend>");
      out.write("Sign up");
      out.write("</legend>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"login\">");
      out.write("Login :");
      out.write("</label>");
      out.write("<input placeholder=\"Enter login\" id=\"login\" class=\"form-control\" type=\"text\" />");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"password\">");
      out.write("Password :");
      out.write("</label>");
      out.write("<input placeholder=\"Password\" id=\"password\" class=\"form-control\" type=\"password\" />");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"confPassword\">");
      out.write("Confirm password");
      out.write("</label>");
      out.write("<input placeholder=\"Confirm password\" id=\"confPassword\" class=\"form-control\" type=\"password\" />");
      out.write("</div>");
      out.write("<div class=\"form-group\">");
      out.write("<label for=\"email\">");
      out.write("Email address");
      out.write("</label>");
      out.write("<input placeholder=\"Enter email\" id=\"email\" class=\"form-control\" type=\"email\" />");
      out.write("</div>");
      out.write("<button class=\"btn btn-info\" type=\"submit\">");
      out.write("Submit");
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
