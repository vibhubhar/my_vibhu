/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.86
 * Generated at: 2018-05-03 09:15:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admn_005flogin2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/sessionCheck1.jspf", Long.valueOf(1524567358000L));
  }

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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

 
int timeout = session.getMaxInactiveInterval();
response.setHeader("Refresh", timeout + "; URL = admn_login.jsp");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link href=\"resources/css/main.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<title>PDAMS - Login</title>\r\n");
      out.write("<script src=\"resources/JS/validateSysAdmin230.js\"></script>\r\n");
      out.write("<SCRIPT type=\"text/javascript\">\r\n");
      out.write("    window.history.forward();\r\n");
      out.write("    function noBack() { window.history.forward(); }\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("  #landing-wrapper {\r\n");
      out.write("    display:table;\r\n");
      out.write("    width:100%;\r\n");
      out.write("   // background: linear-gradient( rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5) ), url('images/CPM_CNB.jpg');\r\n");
      out.write("    background-position:center top;\r\n");
      out.write("    height:350px;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write(" //background-image:   URL(\"images/JUBILEE-PINK.jpg\");\r\n");
      out.write(" //background-image:   URL(\"images/CPM_CNB.jpg\");\r\n");
      out.write("// background-image:   URL(\"images/scrapbook.jpg\");\r\n");
      out.write("// background-image:   URL(\"images/asmani.jpg\");\r\n");
      out.write(" background-image:   URL(\"images/CPM_CNB2.jpg\");\r\n");
      out.write(" //  background-size:cover;\r\n");
      out.write("  //  background-blend-mode:screen;\r\n");
      out.write("//   background-color: #cccccc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.10.2.js\"></script> \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<form id=\"loginPage\" name=\"loginPage\" method=\"post\" action=\"login_success.jsp\" >\r\n");
      out.write("    ");

    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
    response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
    response.setHeader("Expires", "0"); // Proxies.
    
    String error=null;
            error=(String)session.getValue("u_error");
            if(error==null)
                {
                     
      out.write("\r\n");
      out.write("                   <!--  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    <font size=\"6\"  style=\"margin: 600px;margin-top:80px;color:Blue; font-family: calibri;\">Welcome</font>  -->\r\n");
      out.write("                   ");

                }
            else if(error.equals("relogin"))
                {
            
      out.write("\r\n");
      out.write("            <font size=\"4\" style=\"color:red;font-family: calibri;\">Try Again</font>\r\n");
      out.write("            \r\n");
      out.write("            ");

                session.putValue("u_error",null);
            }
   
      out.write("     \r\n");
      out.write("   <!-- <div style=\" width:100%; height:200px; background-color:pink; background-image: URL('images/CPM_CNB.jpg');\" >  </div>   \r\n");
      out.write("   <img src=\"images/vallarpadam-rail-bridge-header.jpg\" class=\"img-responsive\" style=\"width:850px;height:300px;\"/> -->\r\n");
      out.write("     <table class=\"table table-bordered\" border=\"1\"   align=\"center\" style=\" width:500px; background-color: pink;//brown; margin-top: 125px; box-shadow: 10px 10px 5px #888888;\">\r\n");
      out.write("   <tr> <td style= \" height:80px; background-color: #8C001A; vertical-align:middle;\" ><img src=\"images/rail.png\" class=\"img-responsive\" style=\"float:left;height:80px;margin-left:0px;\"> \r\n");
      out.write("                 <img src=\"images/RVNL_LOGO.jpg\" class=\"img-responsive\" style=\"float:right; height:80px;margin-right:0px;\"> </td></tr>\r\n");
      out.write("          <tr style=\"text-align:center;\"><td style= \"background-color: #C11B17;\" >       <h4 style=\" margin-left:5px; color:white\">Project Documents Approval Monitoring System (PDAMS)</h4>\t</td></tr>\r\n");
      out.write("          <tr>     <td width=\"450\"; height=\"300\" style=\"background-image:   URL('images/scrapbook.jpg'); background-color: pink; vertical-align:top;\">\t\t\r\n");
      out.write("\t\t<br>\r\n");
      out.write("        <h4 style= \"color:brown; text-align:center;\" ><b>User-Login</b></h4>\r\n");
      out.write("        <br><br>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Username:\r\n");
      out.write("  <input name=\"user_name\" type=\"text\" class=\"textfield\" id=\"user_name\">\r\n");
      out.write("  <br><br>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Password:\r\n");
      out.write("  <input name=\"password\" type=\"password\" class=\"textfield\" id=\"password\">\r\n");
      out.write("            <br><br>\r\n");
      out.write("       ");

String error1 = "";
error1 = (String)session.getAttribute("error");
if(error1!=null)
out.println(error1);
session.setAttribute("error", null);

      out.write("\r\n");
      out.write("       <br> <br>\r\n");
      out.write("     \t<button class=\"btn btn-basic\" type=\"button\" name=\"Submit\" value=\"Login\" style=\"margin-left:150px;\" onclick=\"javascript:validateUser();\">Login</button>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<input style=\"margin-left:50px;\" class=\"btn btn-basic\" type=\"reset\" value=\"Reset\" />\r\n");
      out.write("         </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("           </table>  \r\n");
      out.write("<!-- <div style=\" width:100%; height:200px; background-color:pink; background-image: URL('images/CPM_CNB.jpg'); float:left;\" >  </div>  -->\r\n");
      out.write("</form> \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
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
}