package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_005fup_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sf_errors_path_id_cssStyle_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sf_input_size_placeholder_path_id_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sf_label_path;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sf_form_method_commandName_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sf_input_placeholder_path_id_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sf_password_placeholder_path_id_cssClass_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sf_errors_path_id_cssStyle_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sf_input_size_placeholder_path_id_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sf_label_path = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sf_form_method_commandName_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sf_input_placeholder_path_id_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sf_password_placeholder_path_id_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sf_errors_path_id_cssStyle_cssClass_nobody.release();
    _jspx_tagPool_sf_input_size_placeholder_path_id_cssClass_nobody.release();
    _jspx_tagPool_sf_label_path.release();
    _jspx_tagPool_spring_url_var_value_nobody.release();
    _jspx_tagPool_sf_form_method_commandName_action.release();
    _jspx_tagPool_sf_input_placeholder_path_id_cssClass_nobody.release();
    _jspx_tagPool_sf_password_placeholder_path_id_cssClass_nobody.release();
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
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      //  sf:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_sf_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_sf_form_method_commandName_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_sf_form_0.setPageContext(_jspx_page_context);
      _jspx_th_sf_form_0.setParent(null);
      _jspx_th_sf_form_0.setCommandName("userAccount");
      _jspx_th_sf_form_0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${create_url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      _jspx_th_sf_form_0.setMethod("post");
      int[] _jspx_push_body_count_sf_form_0 = new int[] { 0 };
      try {
        int _jspx_eval_sf_form_0 = _jspx_th_sf_form_0.doStartTag();
        if (_jspx_eval_sf_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("<fieldset>");
            out.write("<legend>");
            out.write("Sign up");
            out.write("</legend>");
            out.write("<div style=\"color:green;background-color: lavender; padding:3px;font-weight:bold\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</div>");
            out.write("<div class=\"form-group\">");
            if (_jspx_meth_sf_label_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
              return;
            if (_jspx_meth_sf_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
              return;
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_errors_0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_sf_errors_path_id_cssStyle_cssClass_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_errors_0.setPageContext(_jspx_page_context);
            _jspx_th_sf_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
            _jspx_th_sf_errors_0.setId("_userName_error_id");
            _jspx_th_sf_errors_0.setCssClass("has-error");
            _jspx_th_sf_errors_0.setCssStyle("color:red;background-color: #f2dede; padding:3px");
            _jspx_th_sf_errors_0.setPath("userName");
            int[] _jspx_push_body_count_sf_errors_0 = new int[] { 0 };
            try {
              int _jspx_eval_sf_errors_0 = _jspx_th_sf_errors_0.doStartTag();
              if (_jspx_th_sf_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_errors_0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_errors_0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_errors_0.doFinally();
              _jspx_tagPool_sf_errors_path_id_cssStyle_cssClass_nobody.reuse(_jspx_th_sf_errors_0);
            }
            out.write("</div>");
            out.write("<div class=\"form-group\">");
            if (_jspx_meth_sf_label_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
              return;
            if (_jspx_meth_sf_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
              return;
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_errors_1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_sf_errors_path_id_cssStyle_cssClass_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_errors_1.setPageContext(_jspx_page_context);
            _jspx_th_sf_errors_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
            _jspx_th_sf_errors_1.setCssClass("errors");
            _jspx_th_sf_errors_1.setCssStyle("color:red;background-color: #f2dede; padding:3px");
            _jspx_th_sf_errors_1.setId("_password_error_id");
            _jspx_th_sf_errors_1.setPath("password");
            int[] _jspx_push_body_count_sf_errors_1 = new int[] { 0 };
            try {
              int _jspx_eval_sf_errors_1 = _jspx_th_sf_errors_1.doStartTag();
              if (_jspx_th_sf_errors_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_errors_1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_errors_1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_errors_1.doFinally();
              _jspx_tagPool_sf_errors_path_id_cssStyle_cssClass_nobody.reuse(_jspx_th_sf_errors_1);
            }
            out.write("</div>");
            out.write("<div class=\"form-group\">");
            if (_jspx_meth_sf_label_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
              return;
            if (_jspx_meth_sf_password_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
              return;
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_errors_2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_sf_errors_path_id_cssStyle_cssClass_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_errors_2.setPageContext(_jspx_page_context);
            _jspx_th_sf_errors_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
            _jspx_th_sf_errors_2.setCssClass("has-error");
            _jspx_th_sf_errors_2.setCssStyle("color:red;background-color: #f2dede; padding:3px");
            _jspx_th_sf_errors_2.setId("_confirmPassword_error_id");
            _jspx_th_sf_errors_2.setPath("confirmPassword");
            int[] _jspx_push_body_count_sf_errors_2 = new int[] { 0 };
            try {
              int _jspx_eval_sf_errors_2 = _jspx_th_sf_errors_2.doStartTag();
              if (_jspx_th_sf_errors_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_errors_2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_errors_2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_errors_2.doFinally();
              _jspx_tagPool_sf_errors_path_id_cssStyle_cssClass_nobody.reuse(_jspx_th_sf_errors_2);
            }
            out.write("</div>");
            out.write("<div class=\"form-group\">");
            if (_jspx_meth_sf_label_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
              return;
            if (_jspx_meth_sf_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
              return;
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_errors_3 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_sf_errors_path_id_cssStyle_cssClass_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_errors_3.setPageContext(_jspx_page_context);
            _jspx_th_sf_errors_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
            _jspx_th_sf_errors_3.setId("_email_error_id");
            _jspx_th_sf_errors_3.setCssClass("has-error");
            _jspx_th_sf_errors_3.setCssStyle("color:red;background-color: #f2dede; padding:3px");
            _jspx_th_sf_errors_3.setPath("email");
            int[] _jspx_push_body_count_sf_errors_3 = new int[] { 0 };
            try {
              int _jspx_eval_sf_errors_3 = _jspx_th_sf_errors_3.doStartTag();
              if (_jspx_th_sf_errors_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_errors_3[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_errors_3.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_errors_3.doFinally();
              _jspx_tagPool_sf_errors_path_id_cssStyle_cssClass_nobody.reuse(_jspx_th_sf_errors_3);
            }
            out.write("</div>");
            out.write("<input value=\"Creer\" class=\"btn btn-info\" type=\"submit\" />");
            out.write("</fieldset>");
            int evalDoAfterBody = _jspx_th_sf_form_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_sf_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_form_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_form_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_form_0.doFinally();
        _jspx_tagPool_sf_form_method_commandName_action.reuse(_jspx_th_sf_form_0);
      }
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
    _jspx_th_spring_url_0.setVar("create_url");
    _jspx_th_spring_url_0.setValue("/useraccounts/creer");
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

  private boolean _jspx_meth_sf_label_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_sf_label_0 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_sf_label_path.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_sf_label_0.setPageContext(_jspx_page_context);
    _jspx_th_sf_label_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_sf_label_0.setPath("userName");
    int[] _jspx_push_body_count_sf_label_0 = new int[] { 0 };
    try {
      int _jspx_eval_sf_label_0 = _jspx_th_sf_label_0.doStartTag();
      if (_jspx_eval_sf_label_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Login :");
          int evalDoAfterBody = _jspx_th_sf_label_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sf_label_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_label_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_label_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_label_0.doFinally();
      _jspx_tagPool_sf_label_path.reuse(_jspx_th_sf_label_0);
    }
    return false;
  }

  private boolean _jspx_meth_sf_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_sf_input_size_placeholder_path_id_cssClass_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_input_0.setPageContext(_jspx_page_context);
    _jspx_th_sf_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_sf_input_0.setDynamicAttribute(null, "placeholder", new String("Enter login"));
    _jspx_th_sf_input_0.setId("login");
    _jspx_th_sf_input_0.setPath("userName");
    _jspx_th_sf_input_0.setSize("30");
    _jspx_th_sf_input_0.setCssClass("form-control");
    int[] _jspx_push_body_count_sf_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_sf_input_0 = _jspx_th_sf_input_0.doStartTag();
      if (_jspx_th_sf_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_input_0.doFinally();
      _jspx_tagPool_sf_input_size_placeholder_path_id_cssClass_nobody.reuse(_jspx_th_sf_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_sf_label_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_sf_label_1 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_sf_label_path.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_sf_label_1.setPageContext(_jspx_page_context);
    _jspx_th_sf_label_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_sf_label_1.setPath("password");
    int[] _jspx_push_body_count_sf_label_1 = new int[] { 0 };
    try {
      int _jspx_eval_sf_label_1 = _jspx_th_sf_label_1.doStartTag();
      if (_jspx_eval_sf_label_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Password :");
          int evalDoAfterBody = _jspx_th_sf_label_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sf_label_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_label_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_label_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_label_1.doFinally();
      _jspx_tagPool_sf_label_path.reuse(_jspx_th_sf_label_1);
    }
    return false;
  }

  private boolean _jspx_meth_sf_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:password
    org.springframework.web.servlet.tags.form.PasswordInputTag _jspx_th_sf_password_0 = (org.springframework.web.servlet.tags.form.PasswordInputTag) _jspx_tagPool_sf_password_placeholder_path_id_cssClass_nobody.get(org.springframework.web.servlet.tags.form.PasswordInputTag.class);
    _jspx_th_sf_password_0.setPageContext(_jspx_page_context);
    _jspx_th_sf_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_sf_password_0.setDynamicAttribute(null, "placeholder", new String("Password"));
    _jspx_th_sf_password_0.setId("password");
    _jspx_th_sf_password_0.setPath("password");
    _jspx_th_sf_password_0.setCssClass("form-control");
    int[] _jspx_push_body_count_sf_password_0 = new int[] { 0 };
    try {
      int _jspx_eval_sf_password_0 = _jspx_th_sf_password_0.doStartTag();
      if (_jspx_th_sf_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_password_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_password_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_password_0.doFinally();
      _jspx_tagPool_sf_password_placeholder_path_id_cssClass_nobody.reuse(_jspx_th_sf_password_0);
    }
    return false;
  }

  private boolean _jspx_meth_sf_label_2(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_sf_label_2 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_sf_label_path.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_sf_label_2.setPageContext(_jspx_page_context);
    _jspx_th_sf_label_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_sf_label_2.setPath("confirmPassword");
    int[] _jspx_push_body_count_sf_label_2 = new int[] { 0 };
    try {
      int _jspx_eval_sf_label_2 = _jspx_th_sf_label_2.doStartTag();
      if (_jspx_eval_sf_label_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Confirm password");
          int evalDoAfterBody = _jspx_th_sf_label_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sf_label_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_label_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_label_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_label_2.doFinally();
      _jspx_tagPool_sf_label_path.reuse(_jspx_th_sf_label_2);
    }
    return false;
  }

  private boolean _jspx_meth_sf_password_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:password
    org.springframework.web.servlet.tags.form.PasswordInputTag _jspx_th_sf_password_1 = (org.springframework.web.servlet.tags.form.PasswordInputTag) _jspx_tagPool_sf_password_placeholder_path_id_cssClass_nobody.get(org.springframework.web.servlet.tags.form.PasswordInputTag.class);
    _jspx_th_sf_password_1.setPageContext(_jspx_page_context);
    _jspx_th_sf_password_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_sf_password_1.setDynamicAttribute(null, "placeholder", new String("Confirm password"));
    _jspx_th_sf_password_1.setId("confPassword");
    _jspx_th_sf_password_1.setPath("confirmPassword");
    _jspx_th_sf_password_1.setCssClass("form-control");
    int[] _jspx_push_body_count_sf_password_1 = new int[] { 0 };
    try {
      int _jspx_eval_sf_password_1 = _jspx_th_sf_password_1.doStartTag();
      if (_jspx_th_sf_password_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_password_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_password_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_password_1.doFinally();
      _jspx_tagPool_sf_password_placeholder_path_id_cssClass_nobody.reuse(_jspx_th_sf_password_1);
    }
    return false;
  }

  private boolean _jspx_meth_sf_label_3(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_sf_label_3 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_sf_label_path.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_sf_label_3.setPageContext(_jspx_page_context);
    _jspx_th_sf_label_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_sf_label_3.setPath("email");
    int[] _jspx_push_body_count_sf_label_3 = new int[] { 0 };
    try {
      int _jspx_eval_sf_label_3 = _jspx_th_sf_label_3.doStartTag();
      if (_jspx_eval_sf_label_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Email address");
          int evalDoAfterBody = _jspx_th_sf_label_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sf_label_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_label_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_label_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_label_3.doFinally();
      _jspx_tagPool_sf_label_path.reuse(_jspx_th_sf_label_3);
    }
    return false;
  }

  private boolean _jspx_meth_sf_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_sf_input_placeholder_path_id_cssClass_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_input_1.setPageContext(_jspx_page_context);
    _jspx_th_sf_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_sf_input_1.setDynamicAttribute(null, "placeholder", new String("Enter email"));
    _jspx_th_sf_input_1.setId("email");
    _jspx_th_sf_input_1.setPath("email");
    _jspx_th_sf_input_1.setCssClass("form-control");
    int[] _jspx_push_body_count_sf_input_1 = new int[] { 0 };
    try {
      int _jspx_eval_sf_input_1 = _jspx_th_sf_input_1.doStartTag();
      if (_jspx_th_sf_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_input_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_input_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_input_1.doFinally();
      _jspx_tagPool_sf_input_placeholder_path_id_cssClass_nobody.reuse(_jspx_th_sf_input_1);
    }
    return false;
  }
}
