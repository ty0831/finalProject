/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.77
 * Generated at: 2017-04-29 10:57:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h2>index.jsp입니다.</h2>\n");
      out.write("<ul>\n");
      out.write("\t<li><a href=\"hello.do\">SpringMVC</a></li>\n");
      out.write("\t<li><a href=\"memoWrite.do\">메모작성하기</a></li>\n");
      out.write("\t<li><a href=\"memberJoin.do\">회원가입하기</a></li>\n");
      out.write("\t<li><a href=\"kakaOrder.do\">편의점 물품 발주</a></li>\n");
      out.write("\t\n");
      out.write("\t<li><a href=\"paramTest.do?str=spring&idx=3\">파라미터 테스트</a></li>\n");
      out.write("\t<li><a href=\"cookieView.do\">쿠키값 확인하기</a></li>\n");
      out.write("\t<li><a href=\"cookieMake.do\">쿠기값 저장하기</a></li>\n");
      out.write("\t\n");
      out.write("\t<li><a href=\"sessionView.do\">세션 값 확인하기</a></li>\n");
      out.write("\t<li><a href=\"sessionMake.do\">세션 값 저장하기</a></li>\n");
      out.write("\t\n");
      out.write("\t<li><a href=\"memberLoginForm.do\">로그인 페이지로</a></li>\n");
      out.write("\t\n");
      out.write("\t<li><a href=\"viewTest.do\">명시적 뷰 지정방법</a></li>\n");
      out.write("\t<li><a href=\"viewTest2.do\">명시적 뷰 지정방법2</a></li>\n");
      out.write("\t<li><a href=\"view/viewOk.do\">묵시적 뷰 지정방법</a></li>\n");
      out.write("\t<li><a href=\"viewTest3.do\">다른 명령어 호출하기</a></li>\n");
      out.write("\t<li><a href=\"modelTest.do\">모델 테스트1(Map)</a></li>\n");
      out.write("\t<li><a href=\"modelTest2.do\">모델 테스트2(Model)</a></li>\n");
      out.write("\t<li><a href=\"modelTest3.do\">모델 테스트3(ModelMap)</a></li>\n");
      out.write("\t<li><a href=\"model/modelResult.do\">모델 테스트4(묵시적 뷰 지정방식 사용)</a></li>\n");
      out.write("\t<li><a href=\"animeA.do\">애니메이션 정보 검색</a></li>\n");
      out.write("\t\n");
      out.write("\t<li><a href=\"fileUploadForm.do\">파일업로드</a></li>\n");
      out.write("\t<li><a href=\"fileDownList.do\">파일 다운로드</a></li>\n");
      out.write("\t\n");
      out.write("\t<li><a href=\"emp.do\">마지막 사원관리 프로그램</a></li>\n");
      out.write("</ul>\n");
      out.write("</body>\n");
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
