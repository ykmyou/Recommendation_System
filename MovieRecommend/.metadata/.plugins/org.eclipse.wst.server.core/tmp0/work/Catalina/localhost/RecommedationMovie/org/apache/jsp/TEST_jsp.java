/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M10
 * Generated at: 2016-12-03 10:52:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TEST_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">\r\n");
      out.write("<script>\r\n");
      out.write("function sendToDBReview(){\r\n");
      out.write("\t//여기에 DB로 후기 보내는 쿼리 작성\r\n");
      out.write("\talert('저장되셨습니다')\r\n");
      out.write("}\r\n");
      out.write("function sendToDBRate(){\r\n");
      out.write("\t//여기에 DB로 평점 보내는 쿼리 작성\r\n");
      out.write("\talert('저장되셨습니다')\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body><div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t<h2>모달</h2>\r\n");
      out.write("\t<div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("                    <div class=\"thumbnail\">\r\n");
      out.write("                        <img src=\"...\" alt=\"...\">\r\n");
      out.write("                        <div class=\"caption\">\r\n");
      out.write("                            <h3>Thumbnail label</h3>\r\n");
      out.write("                            <p>...</p>\r\n");
      out.write("                            <p><button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#RateModal1\" >평점\t</button>\r\n");
      out.write("                            <button type=\"button\" class=\"btn\" data-toggle=\"modal\" data-target=\"#ReviewModal1\" >후기\t</button></p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <!-- 모달 팝업 -->\r\n");
      out.write("\t<!-- 평점 -->\r\n");
      out.write("\t<div class=\"modal fade bs-example-modal-sm\" id=\"RateModal1\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\" >\r\n");
      out.write("\t  <div class=\"modal-dialog modal-sm\">\r\n");
      out.write("\t    <div class=\"modal-content\">\r\n");
      out.write("\t      <div class=\"modal-header\">\r\n");
      out.write("\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">×종료</span><span class=\"sr-only\">Close</span></button>\r\n");
      out.write("\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">평점</h4>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      <div class=\"modal-body\">\r\n");
      out.write("\t\t\t<input type=\"number\" name=RATE style=\"width: 30px\"> / 5.0\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      <div class=\"modal-footer\">\r\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">종료</button>\r\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-primary\" onclick=sendToDBRate()>저장</button>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 후기남기기 -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"ReviewModal1\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\" >\r\n");
      out.write("\t  <div class=\"modal-dialog\">\r\n");
      out.write("\t    <div class=\"modal-content\">\r\n");
      out.write("\t      <div class=\"modal-header\">\r\n");
      out.write("\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">×종료</span><span class=\"sr-only\">Close</span></button>\r\n");
      out.write("\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">후기</h4>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      <div class=\"modal-body\">\r\n");
      out.write("\t\t\t<textarea rows=\"5\" cols=\"70\"></textarea>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      <div class=\"modal-footer\">\r\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">종료</button>\r\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-primary\" onclick=sendToDBReview()>저장</button>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("                    <div class=\"thumbnail\">\r\n");
      out.write("                        <img src=\"...\" alt=\"...\">\r\n");
      out.write("                        <div class=\"caption\">\r\n");
      out.write("                            <h3>Thumbnail label</h3>\r\n");
      out.write("                            <p>...</p>\r\n");
      out.write("                            <p><button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#RateModal2\" >평점\t</button> \r\n");
      out.write("                            <button type=\"button\" class=\"btn\" data-toggle=\"modal\" data-target=\"#ReviewModal2\" >후기\t</button></p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <!-- 모달 팝업 -->\r\n");
      out.write("\t<!-- 평점 -->\r\n");
      out.write("\t<div class=\"modal fade bs-example-modal-sm\" id=\"RateModal2\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\" >\r\n");
      out.write("\t  <div class=\"modal-dialog modal-sm\">\r\n");
      out.write("\t    <div class=\"modal-content\">\r\n");
      out.write("\t      <div class=\"modal-header\">\r\n");
      out.write("\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">×종료</span><span class=\"sr-only\">Close</span></button>\r\n");
      out.write("\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">평점2</h4>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      <div class=\"modal-body\">\r\n");
      out.write("\t\t\t<input type=\"number\" name=RATE style=\"width: 30px\"> / 5.0\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      <div class=\"modal-footer\">\r\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">종료</button>\r\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-primary\" onclick=sendToDBRate()>저장</button>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 후기남기기 -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"ReviewModal2\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\" >\r\n");
      out.write("\t  <div class=\"modal-dialog\">\r\n");
      out.write("\t    <div class=\"modal-content\">\r\n");
      out.write("\t      <div class=\"modal-header\">\r\n");
      out.write("\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">×종료</span><span class=\"sr-only\">Close</span></button>\r\n");
      out.write("\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">후기2</h4>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      <div class=\"modal-body\">\r\n");
      out.write("\t\t\t<textarea rows=\"5\" cols=\"70\"></textarea>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      <div class=\"modal-footer\">\r\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">종료</button>\r\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-primary\" onclick=sendToDBReview()>저장</button>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("<script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"http://googledrive.com/host/0B-QKv6rUoIcGREtrRTljTlQ3OTg\"></script><!-- ie10-viewport-bug-workaround.js -->\r\n");
      out.write("<script src=\"http://googledrive.com/host/0B-QKv6rUoIcGeHd6VV9JczlHUjg\"></script><!-- holder.js -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
}
