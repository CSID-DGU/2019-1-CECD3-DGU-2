/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.45
 * Generated at: 2019-08-20 00:24:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.views.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_005ftemplate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1473314262000L));
    _jspx_dependants.put("jar:file:/D:/icipFrameWork/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/icip.app/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/tlds/taglib.tld", Long.valueOf(1554282802000L));
    _jspx_dependants.put("/WEB-INF/lib/tiles-jsp-3.0.5.jar", Long.valueOf(1473314260000L));
    _jspx_dependants.put("jar:file:/D:/icipFrameWork/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/icip.app/WEB-INF/lib/tiles-jsp-3.0.5.jar!/META-INF/tld/tiles-jsp.tld", Long.valueOf(1411309930000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    response.setHeader("Cache-Control", "no-store");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);
    if (request.getProtocol().equals("HTTP/1.1")) response.setHeader("Cache-Control", "no-cache");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">  \r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"/images/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("<link rel=\"icon\" href=\"/images/favicon.ico\" type=\"image/x-icon\"> \r\n");
      out.write("<!-- csrf 방지 소스 적용 -->\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<title>");
      if (_jspx_meth_tiles_005finsertAttribute_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      if (_jspx_meth_tiles_005finsertAttribute_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--/Contents Area Start/-->\r\n");
      out.write("\t<div id=\"wrap\">\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_tiles_005finsertAttribute_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_tiles_005finsertAttribute_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t<div style=\"width:1200px;margin:0 auto;padding-top:2px\">\r\n");
      out.write("\t\t\t<!--/Core Start/-->\r\n");
      out.write("\t\t\t<div id=\"contents\">\r\n");
      out.write("\t\t\t\t\t<div id=\"core\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_tiles_005finsertAttribute_005f4(_jspx_page_context))
        return;
      out.write("   \r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div><!-- contents -->\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      if (_jspx_meth_tiles_005finsertAttribute_005f5(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_tiles_005finsertAttribute_005f6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!-- 로딩이미지\r\n");
      out.write("<div id=\"loading\" style='position:absolute;left:40%;top:50%;background:#ffffff;display:none;'>\t\r\n");
      out.write("<table width=\"290\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" >\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td class=\"blue_box1\"></td>\r\n");
      out.write("    <td class=\"blue_dot1\"></td>\r\n");
      out.write("    <td class=\"blue_box2\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr> \r\n");
      out.write("    <td class=\"blue_dot2\"></td>\r\n");
      out.write("    <td class=\"data_none_c\"><img SRC='/images/loading/ajax_loding.gif'>\r\n");
      out.write("    <br>\r\n");
      out.write("  <font color=\"blue\">검색 데이터양에 따라 로딩시간이 지연될수있습니다.</font>\r\n");
      out.write("    </td>\r\n");
      out.write("    <td class=\"blue_dot3\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td class=\"blue_box3\"></td>\r\n");
      out.write("    <td class=\"blue_dot4\"></td>\r\n");
      out.write("    <td class=\"blue_box4\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("로딩이미지-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/jsp/views/layouts/main_template.jsp(20,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty _csrf.headerName }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t<meta name = \"_csrf_header\" content = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.headerName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" />\r\n");
          out.write("\t<meta name = \"_csrf\" content = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" />\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f0 = new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tiles_005finsertAttribute_005f0);
    try {
      _jspx_th_tiles_005finsertAttribute_005f0.setJspContext(_jspx_page_context);
      // /WEB-INF/jsp/views/layouts/main_template.jsp(24,7) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_tiles_005finsertAttribute_005f0.setName("title");
      _jspx_th_tiles_005finsertAttribute_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tiles_005finsertAttribute_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f1 = new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tiles_005finsertAttribute_005f1);
    try {
      _jspx_th_tiles_005finsertAttribute_005f1.setJspContext(_jspx_page_context);
      // /WEB-INF/jsp/views/layouts/main_template.jsp(25,0) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_tiles_005finsertAttribute_005f1.setName("include");
      _jspx_th_tiles_005finsertAttribute_005f1.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tiles_005finsertAttribute_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f2 = new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tiles_005finsertAttribute_005f2);
    try {
      _jspx_th_tiles_005finsertAttribute_005f2.setJspContext(_jspx_page_context);
      // /WEB-INF/jsp/views/layouts/main_template.jsp(30,3) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_tiles_005finsertAttribute_005f2.setName("top");
      _jspx_th_tiles_005finsertAttribute_005f2.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tiles_005finsertAttribute_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f3 = new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tiles_005finsertAttribute_005f3);
    try {
      _jspx_th_tiles_005finsertAttribute_005f3.setJspContext(_jspx_page_context);
      // /WEB-INF/jsp/views/layouts/main_template.jsp(31,3) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_tiles_005finsertAttribute_005f3.setName("left");
      _jspx_th_tiles_005finsertAttribute_005f3.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tiles_005finsertAttribute_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f4 = new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tiles_005finsertAttribute_005f4);
    try {
      _jspx_th_tiles_005finsertAttribute_005f4.setJspContext(_jspx_page_context);
      // /WEB-INF/jsp/views/layouts/main_template.jsp(36,6) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_tiles_005finsertAttribute_005f4.setName("body");
      _jspx_th_tiles_005finsertAttribute_005f4.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tiles_005finsertAttribute_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f5 = new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tiles_005finsertAttribute_005f5);
    try {
      _jspx_th_tiles_005finsertAttribute_005f5.setJspContext(_jspx_page_context);
      // /WEB-INF/jsp/views/layouts/main_template.jsp(41,1) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_tiles_005finsertAttribute_005f5.setName("footer");
      _jspx_th_tiles_005finsertAttribute_005f5.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tiles_005finsertAttribute_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f6(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f6 = new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tiles_005finsertAttribute_005f6);
    try {
      _jspx_th_tiles_005finsertAttribute_005f6.setJspContext(_jspx_page_context);
      // /WEB-INF/jsp/views/layouts/main_template.jsp(42,0) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_tiles_005finsertAttribute_005f6.setName("layerpop");
      _jspx_th_tiles_005finsertAttribute_005f6.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tiles_005finsertAttribute_005f6);
    }
    return false;
  }
}
