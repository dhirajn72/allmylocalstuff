package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Add Customer Details</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/view/addCustomer.jsp(10,1) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction("addCustomerSubmit.do");
      // /WEB-INF/view/addCustomer.jsp(10,1) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setCommandName("customerCommand");
      // /WEB-INF/view/addCustomer.jsp(10,1) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("POST");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t<table>\n");
            out.write("\t\t\t");
            out.write("\n");
            out.write("\t\t\t<tr>\n");
            out.write("\t\t\t\t<td>Cname</td>\n");
            out.write("\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\n");
            out.write("\t\t\t\t<td><font color=\"red\">");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f0.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/addCustomer.jsp(20,26) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f0.setPath("cname");
            int[] _jspx_push_body_count_form_005ferrors_005f0 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f0 = _jspx_th_form_005ferrors_005f0.doStartTag();
              if (_jspx_th_form_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f0.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f0);
            }
            out.write("</font></td>\n");
            out.write("\t\t\t</tr>\n");
            out.write("\t\t\t<tr>\n");
            out.write("\t\t\t\t<td>Email</td>\n");
            out.write("\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\n");
            out.write("\t\t\t\t<td><font color=\"red\">");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f1.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/addCustomer.jsp(25,26) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f1.setPath("email");
            int[] _jspx_push_body_count_form_005ferrors_005f1 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f1 = _jspx_th_form_005ferrors_005f1.doStartTag();
              if (_jspx_th_form_005ferrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f1.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f1);
            }
            out.write("</font></td>\n");
            out.write("\t\t\t</tr>\n");
            out.write("\t\t\t<tr>\n");
            out.write("\t\t\t\t<td>Phone</td>\n");
            out.write("\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\n");
            out.write("\t\t\t\t<td><font color=\"red\">");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f2.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/addCustomer.jsp(30,26) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f2.setPath("phone");
            int[] _jspx_push_body_count_form_005ferrors_005f2 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f2 = _jspx_th_form_005ferrors_005f2.doStartTag();
              if (_jspx_th_form_005ferrors_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f2.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f2);
            }
            out.write("</font></td>\n");
            out.write("\t\t\t</tr>\n");
            out.write("\t\t\t<tr>\n");
            out.write("\t\t\t\t<td>Age</td>\n");
            out.write("\t\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f3(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\n");
            out.write("\t\t\t\t<td><font color=\"red\">");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f3 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f3.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/view/addCustomer.jsp(35,26) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f3.setPath("age");
            int[] _jspx_push_body_count_form_005ferrors_005f3 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f3 = _jspx_th_form_005ferrors_005f3.doStartTag();
              if (_jspx_th_form_005ferrors_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f3[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f3.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f3.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f3);
            }
            out.write("</font></td>\n");
            out.write("\t\t\t</tr>\n");
            out.write("\t\t\t<tr>\n");
            out.write("\t\t\t\t<td colspan=\"2\" align=\"center\"><input type=\"submit\"\n");
            out.write("\t\t\t\t\tvalue=\"Submit\" /></td>\n");
            out.write("\t\t\t</tr>\n");
            out.write("\t\t</table>\n");
            out.write("\t");
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
        _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.reuse(_jspx_th_form_005fform_005f0);
      }
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/addCustomer.jsp(19,8) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setPath("cname");
    int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
      if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/addCustomer.jsp(24,8) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setPath("email");
    int[] _jspx_push_body_count_form_005finput_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f1 = _jspx_th_form_005finput_005f1.doStartTag();
      if (_jspx_th_form_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/addCustomer.jsp(29,8) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setPath("phone");
    int[] _jspx_push_body_count_form_005finput_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f2 = _jspx_th_form_005finput_005f2.doStartTag();
      if (_jspx_th_form_005finput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f2.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f3 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/view/addCustomer.jsp(34,8) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f3.setPath("age");
    int[] _jspx_push_body_count_form_005finput_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f3 = _jspx_th_form_005finput_005f3.doStartTag();
      if (_jspx_th_form_005finput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f3.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f3);
    }
    return false;
  }
}
