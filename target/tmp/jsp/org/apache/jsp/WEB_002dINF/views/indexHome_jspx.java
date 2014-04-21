package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexHome_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_spring_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_url_var_value_nobody.release();
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
      out.write("<div class=\"jumbotron\">");
      out.write("<h1>");
      out.write("Jumbotron heading");
      out.write("</h1>");
      out.write("<p class=\"lead\">");
      out.write("Cras justo odio, dapibus ac facilisis in, egestas\n");
      out.write("\t\t\teget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris\n");
      out.write("\t\t\tcondimentum nibh, ut fermentum massa justo sit amet risus.");
      out.write("</p>");
      out.write("<p>");
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write("<a role=\"button\" href=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sign_url}", java.lang.String.class, (PageContext)_jspx_page_context, null) + "\" class=\"btn btn-lg btn-success\">");
      out.write("Sign up\n");
      out.write("\t\t\t\ttoday");
      out.write("</a>");
      out.write("</p>");
      out.write("</div>");
      out.write("<div class=\"row marketing\">");
      out.write("<div class=\"col-lg-6\">");
      out.write("<h4>");
      out.write("Subheading");
      out.write("</h4>");
      out.write("<p>");
      out.write("Donec id elit non mi porta gravida at eget metus. Maecenas\n");
      out.write("\t\t\t\tfaucibus mollis interdum.");
      out.write("</p>");
      out.write("<h4>");
      out.write("Subheading");
      out.write("</h4>");
      out.write("<p>");
      out.write("Morbi leo risus, porta ac consectetur ac, vestibulum at eros.\n");
      out.write("\t\t\t\tCras mattis consectetur purus sit amet fermentum.");
      out.write("</p>");
      out.write("<h4>");
      out.write("Subheading");
      out.write("</h4>");
      out.write("<p>");
      out.write("Maecenas sed diam eget risus varius blandit sit amet non\n");
      out.write("\t\t\t\tmagna.");
      out.write("</p>");
      out.write("</div>");
      out.write("<div class=\"col-lg-6\">");
      out.write("<h4>");
      out.write("Subheading");
      out.write("</h4>");
      out.write("<p>");
      out.write("Donec id elit non mi porta gravida at eget metus. Maecenas\n");
      out.write("\t\t\t\tfaucibus mollis interdum.");
      out.write("</p>");
      out.write("<h4>");
      out.write("Subheading");
      out.write("</h4>");
      out.write("<p>");
      out.write("Morbi leo risus, porta ac consectetur ac, vestibulum at eros.\n");
      out.write("\t\t\t\tCras mattis consectetur purus sit amet fermentum.");
      out.write("</p>");
      out.write("<h4>");
      out.write("Subheading");
      out.write("</h4>");
      out.write("<p>");
      out.write("Maecenas sed diam eget risus varius blandit sit amet non\n");
      out.write("\t\t\t\tmagna.");
      out.write("</p>");
      out.write("</div>");
      out.write("</div>");
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

  private boolean _jspx_meth_spring_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent(null);
    _jspx_th_spring_url_0.setVar("sign_url");
    _jspx_th_spring_url_0.setValue("/useraccounts/sign");
    int[] _jspx_push_body_count_spring_url_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_0 = _jspx_th_spring_url_0.doStartTag();
      if (_jspx_th_spring_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_0.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_0);
    }
    return false;
  }
}
