/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.86
 * Generated at: 2018-05-29 06:27:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import javax.script.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.text.DateFormat;
import javax.naming.*;
import java.sql.*;
import javax.sql.*;
import org.apache.taglibs.standard.tag.common.sql.ResultImpl;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.lang.Integer;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import javax.naming.*;
import java.sql.*;
import javax.sql.*;

public final class helpadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/Admin/included/NewHeader.jsp", Long.valueOf(1527076887650L));
    _jspx_dependants.put("/WEB-INF/sessionCheck1.jspf", Long.valueOf(1524567358000L));
    _jspx_dependants.put("/Admin/included/Newfooter.jsp", Long.valueOf(1526628672412L));
    _jspx_dependants.put("/Admin/sessionCheck.jsp", Long.valueOf(1524567356000L));
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");

 String theme3 = (String) pageContext.getAttribute("myTheme", PageContext.SESSION_SCOPE);
if (theme3!=null) {
if (theme3.equalsIgnoreCase("brown") ) { 
      out.write("\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/ThmBrown.css\">\r\n");
      out.write("\t\t");
 } else if (theme3.equalsIgnoreCase("blue")) { 
      out.write(" \r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/ThmBlue.css\">\r\n");
      out.write("\t\t");
} else if (theme3.equalsIgnoreCase("green")) { 
      out.write(" \r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/ThmGreen.css\">\r\n");
      out.write("\t\t");
} else if (theme3.equalsIgnoreCase("magenta")) { 
      out.write(" \r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/Thmmagenta.css\">\r\n");
      out.write("\t\t");
}
} else {
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/ThmBrown.css\">\r\n");
      out.write("\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>PDAMS</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write(".white-marquee {\r\n");
      out.write("   font-family:   arial, serif, \"Times New Roman\", calibri, Times;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tcolor:  white;\r\n");
      out.write("\t//margin-left:50px;\r\n");
      out.write("\tfont-weight:bold;\r\n");
      out.write("\tpadding:10px;\r\n");
      out.write("\tpadding-bottom:5px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>   \r\n");

//String mailstatus=(String)session.getAttribute("MailStatus"); 
//String user = (String) session.getAttribute("user_name");
String user_code = (String) session.getAttribute("User_Code");
if (user_code!=null) {} else {user_code="0";}
 String mq=null, mqLaunch=null, mqMaint=null, mqOther=null, mqRly=null, mqRVNL=null;					
 //System.out.println("code="+user_code);	
  Connection conn7 = null;
     			PreparedStatement ps777=null;
     			ResultSet  rs777=null;
     						//Statement stmt7 = null;
     						try {
     							Context initCtx = new InitialContext();
     							Context envCtx = (Context) initCtx.lookup("java:comp/env");
     							DataSource ds = (DataSource) envCtx.lookup("jdbc/MySQLDB");

     							conn7 = ds.getConnection();
     							String sql35 = "select item, description from xx_maintenance";
     									
    								ps777 = conn7.prepareStatement(sql35);
    								rs777 = ps777.executeQuery();
    								while (rs777.next()) {
    									String item=rs777.getString(1);
    									 String desc=rs777.getString(2);
    									if (item.equalsIgnoreCase("marquee-launch")) {
    										mqLaunch=desc;
    									} else if (item.equalsIgnoreCase("marquee-maint")) {
    										mqMaint=desc;
    									} else if (item.equalsIgnoreCase("marquee-other")) {
    										mqOther=desc;
    									} else if (item.equalsIgnoreCase("marquee-Rly")) {
    										mqRly=desc;
    									} else if (item.equalsIgnoreCase("marquee-RVNL")) {
    										mqRVNL=desc;
    									} 
    								}
    								if (user_code.equalsIgnoreCase("2")) {
    									mq= mqLaunch+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+mqMaint+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+mqOther+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+mqRly;
    								} else if (user_code.equalsIgnoreCase("5")) {
    									mq= mqLaunch+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+mqMaint+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+mqOther+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+mqRVNL;
    								} else {
    								mq= mqLaunch+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+mqMaint+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+mqOther;
    								}		 
    				    				//System.out.println("marquee="+mq);
     						}catch(Exception e){
    							
    							e.printStackTrace();
    						} finally {
    						    try { rs777.close(); } catch (Exception e) { /* ignored */ }
    						    try { ps777.close(); } catch (Exception e) { /* ignored */ }
    						    try { conn7.close(); } catch (Exception e) { /* ignored */ }
    						}



      out.write("\r\n");
      out.write("<input type=\"hidden\" id=\"menu1\" value='");
      out.print(session.getAttribute("user_name") );
      out.write("'>\r\n");
      out.write("     \t   <div class=\"header\">\r\n");
      out.write("   \r\n");
      out.write(" \t\t   <table width=\"100%\"><tr><th width=15%>\r\n");
      out.write("    \t\t  <img src=\"images/Rail_logo.png\"  class=\"img-responsive\" style=\"float:left;height:80px;margin-left:10px;\">\r\n");
      out.write("    \t\t  \r\n");
      out.write("   </td>\r\n");
      out.write("   <th width=60%>\r\n");
      out.write("      \t\t <h2 style=\" margin-left:5px;\"><i>Project Documents Approval Monitoring System (PDAMS)</i></h2>\t\r\n");
      out.write("   \r\n");
      out.write("   </th><th width=25%>\r\n");
      out.write("\t  <img src=\"images/RVNL_LOGO.jpg\"  class=\"img-responsive\" style=\"float:left;height:80px;margin-left:10px;\">\r\n");
      out.write(" \t\t  </table>\t\r\n");
      out.write("   </div>\r\n");
      out.write("\t   <div class=\"topmenu\" id=\"menu\">\r\n");
      out.write("\t  <div id=\"menu1\"  style=\"float:left;\"> \r\n");
      out.write("\t  \t\t<ul>\r\n");
      out.write("\t  \t\t\r\n");
      out.write("\t  \t\t<!-- <li><a href=\"user_index.jsp\">Add/Modify Docs</a></li>\r\n");
      out.write("\t   \t\t\t\t\t<li><a href=\"user_Project.jsp\">My Projects</a></li>\r\n");
      out.write("\t   \t\t\t\t\t<li><a href=\"Reportpiuinitiate.jsp\">My Reports</a></li>\r\n");
      out.write("\t   \t\t\t\t\t<li><a href=\"MoreInfo.jsp\">Returned Tasks</a></li>\r\n");
      out.write("\t   \t\t\t\t\t<li><a href=\"PullBack.jsp\">PullBack Doc</a></li>\r\n");
      out.write("\t   \t\t\t\t\t<li><a href=\"FinalApproval.jsp\">Docs under Approval</a></li>\r\n");
      out.write("\t   \t\t\t\t\t<li><a href=\"FinallyApprovedShow.jsp\">Approved Docs</a></li>\r\n");
      out.write("\t   \t\t\t\t\t<li><a href=\"ManualMail.jsp\">Reminders</a></li>\r\n");
      out.write("\t   \t\t\t\t\t<li><a href=\"User_List.jsp\">User List</a></li>\r\n");
      out.write("\t   \t\t\t\t\t<li><a href=\"changepasswordlocaladmin.jsp\">Change Password</a></li>\r\n");
      out.write("\t   \t\t\t\t\t<li><a href=\"helpmain.jsp\">Help</a></li>\r\n");
      out.write("\t   \t\t\t\t\t<li><a href=\"admn_logout.jsp\">Logout</a></li>  -->\r\n");
      out.write("\t   \t\t\t\t\t<li><a href=\"NewIndex.jsp\">Home</a></li>\r\n");
      out.write("\t   \t\t\t\t\t\r\n");
      out.write("\t   \t\t\t\t\t</ul>\t \r\n");
      out.write("\t   \t\t\t\t\t</div>  \r\n");
      out.write("\t   \t\t\t\t\t");

	   					if (!mq.equalsIgnoreCase("") && mq!=null) {
	   					
      out.write("\t\r\n");
      out.write("\t   \t<div id=\"menu11\" ></div>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t   <div id=\"menu2\"  style=\"width:70%; float:left;\">     \t\t\t\t\t\r\n");
      out.write("\t   <marquee><span class=\"white-marquee\" id=\"white-marquee\" style=\"float:right; width:100%\">");
      out.print(mq );
      out.write("</span></marquee>  </div>\r\n");
      out.write("\t  ");

	  	}
	   	
      out.write("\t\r\n");
      out.write("\t   \t\r\n");
      out.write("\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" ");
 

int timeout1 = session.getMaxInactiveInterval();
response.setHeader("Refresh", timeout1 + "; URL = admn_login.jsp");

if(((String)session.getAttribute("user_name"))==null)
       {
           
	response.sendRedirect("admn_login.jsp");
           
       }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"http://ajax.aspnetcdn.com/ajax/jquery.ui/1.8.9/jquery-ui.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"resources/JS/Approval_wf230.js\"></script>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"http://ajax.aspnetcdn.com/ajax/jquery.ui/1.8.9/themes/blitzer/jquery-ui.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>RVNL Document Portal </title>\r\n");
      out.write("<link href=\"resources/css/main.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">    \r\n");
      out.write("<link href=\"resources/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<link href=\"resources/bootstrap/css/bootstrap.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<script src=\"resources/JS/backButton.js\"></script>\r\n");
      out.write("<script src=\"resources/JS/validate230.js\"></script>\r\n");
      out.write("<script src=\"resources/JS/PIU_depend230.js\"></script>\r\n");
      out.write("<script src=\"resources/jQuery/jquery-1.12.3.min.js\"></script> \r\n");
      out.write("<style>\r\n");
      out.write("textarea {\r\n");
      out.write("   resize: none;\r\n");
      out.write("}\r\n");
      out.write("td.test{\r\n");
      out.write("\t\t\tbackground-color:#ffe6e6;  \r\n");
      out.write("\t\t\theight: 30px;\r\n");
      out.write("\t\t\tfont-size: large;\r\n");
      out.write("            font-weight:bold;\r\n");
      out.write("            color:black;\r\n");
      out.write("        \r\n");
      out.write("}\r\n");
      out.write("   \r\n");
      out.write("td.two {\r\n");
      out.write("color: black;\r\n");
      out.write("font-size:medium;\r\n");
      out.write("background-color: white;\r\n");
      out.write("}\r\n");
      out.write("div.test{\r\n");
      out.write("border: 3px double #ff4d4d;\r\n");
      out.write("    background-color:#ffe6e6;\r\n");
      out.write("    width: auto;\r\n");
      out.write("    height: 30px;\r\n");
      out.write("  padding: 15 px;\r\n");
      out.write("}\r\n");
      out.write("div.absolute {\r\n");
      out.write("   \tposition:absolute;\r\n");
      out.write("   \tmargin-top: 5px;\r\n");
      out.write("   \tmargin-left: 37px;\r\n");
      out.write("   \tmargin-bottom: 20px;\r\n");
      out.write(" \tpadding: 15 px;\r\n");
      out.write("    width: auto;\r\n");
      out.write("    height: 30px;\r\n");
      out.write("    border: 3px double #ff4d4d;\r\n");
      out.write("    background-color:#ffe6e6;\r\n");
      out.write("        }\r\n");
      out.write("    table.center {\r\n");
      out.write("    margin-left:auto; \r\n");
      out.write("    margin-right:auto;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"resources/jQuery/jquery-ui.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
String user = (String)session.getAttribute("user_name");
//System.out.println("UZER:"+user);

      out.write('\r');
      out.write('\n');

/*String role1=(String)session.getAttribute("role");
String role=(String)session.getAttribute("Type");
String zone_id1=(String)session.getAttribute("zone_id"); 
String piu_id1=(String)session.getAttribute("piu_id"); 
String div_id1=(String)session.getAttribute("Division_Id");
*/

      out.write("\r\n");
      out.write("<div class=\"absolute\" style=\"font-weight:bold\" ><h8>&nbsp;&nbsp;&nbsp;[Help] &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h8>\r\n");
      out.write("<h8><font style=\"color:red; font-weight:normal\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Welcome&nbsp;</font><font style=\"color:#3333cc; font-weight:normal\">:&nbsp;");
      out.print((String)session.getAttribute("user_name") );
      out.write("&nbsp;&nbsp;&nbsp;</font></h8>\r\n");
      out.write("</div><br>\r\n");
      out.write("<div style=\"float:right;text-decoration:underline;\"><button class=\"btn btn-primary\" onclick=\"window.open('processflow.jsp')\">More Information</button></div>\r\n");
      out.write("<br><br>\r\n");
      out.write(" \r\n");
      out.write("<div class=\"container\" style=\"text-align:justify;\">\r\n");
      out.write("<Table class =\"table\"><tr ><td class=\"test\" style=\"font-weight:bold\" colspan=\"2\"> <h8 >General </h8></td></tr><tr ><td class=\"two\"> 1)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">This Website is designed, tested & found compatible to Mozilla Firefox & Google Chrome browsers. For better look, feel and complete functionality, please use these browsers only.</td></tr><tr ><td class=\"two\"> 2)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">In case of forget password, contact your technical support team for this portal.</td></tr><tr ><td class=\"two\"> 3)&nbsp;&nbsp;&nbsp;</td><td class=\"two\"><b>Data Entry Restrictions:</b> Special characters & ' ? ! < > \" \\  are not allowed in general in any input field. Any blank space is not allowed but & character is allowed in 'user id' input field. <br><br></td></tr><tr ><td class=\"test\" style=\"font-weight:bold\" colspan=\"2\"> <h8 >Manage Users </h8></td></tr><tr ><td class=\"two\"> 1)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">Users (Local-Admin, users of RVNL, Railway & Organization) can be created and modified with this tab.</td></tr><tr ><td class=\"two\"> 2)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">Basic task of System-Admin is to create/update Local-Admins for different PIUs and also assign Railway Zones to them or update. In case a new project is given to a PIU concerning to a zone which was not earlier assigned to that PIU. Such changes can be done by changing zones assigned to the Local-Admin of that PIU.  </td></tr><tr ><td class=\"two\"> 3)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">Information like name, email id and contact number in case of transfer of the officer from the post may be updated with current information.  Passwords of users can also be reset.</td></tr><tr ><td class=\"two\"> 4)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">User-Id for a user should be complete Designation along with place of posting without any space in between (For example-SrDEN/E/WAT) so that the User-Id is unique. User-Id should be written in proper letter (combination of capital/small) as is written in normal correspondence as this user Id will be used in all reports and mail alerts.</td></tr><tr ><td class=\"two\"> 5)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">DRM of division and GM of zone should invariably be created with complete details like email id and mobile numbers as weekly positions of delayed documents shall be sent by email/SMS to the Railway users automatically by the system.  </td></tr><tr ><td class=\"two\"> 6)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">Correct email id and mobile numbers should be entered as alerts and reminders will be sent to all Railway users. In case of change of email /mobile of a user, the details should be modified accordingly by Local-Admin of that PIU.</td></tr><tr ><td class=\"two\"> 7)&nbsp;&nbsp;&nbsp;</td><td class=\"two\"><b>RVNL Users:</b> Only users like CPM/SC, GM/S&T/SC and GM/Elec/SC should be created as these users will only be forwarding documents/drawings for approvals of Railway Users and alerts will be initiated from their side to such users, DRMs and GMs. <br><br>UserId of RVNL users should include organization name i.e. CPM/Chennai/RVNL or GM(S&T)/Bangalore/RVNL for easy identification by Railway officials.<br><br> Separate User_Ids for RVNL officers like GM/Elec or GM/S&T who are looking after projects in more than one PIU should be created for each PIU duly suffixing PIU name in the User_Id e.g. User_Ids for GM/S&T/Delhi who looks after projects of Delhi and Kanpur may be 'GM/S&T/DLI/Delhi' for  Delhi PIU and 'GM/S&T/DLI/Kanpur' for Kanpur PIU so that he can log in with User_Ids of respective PIUs to create and forward documents of that PIU.  </td></tr><tr ><td class=\"two\"> 8)&nbsp;&nbsp;&nbsp;</td><td class=\"two\"><b>Railway Users:</b> For division level users, only branch officer/JAG level users be created so that document is shown pending against his name in case it is pending with some officers/staff working under him. Normally, users required to approve/sign the document /drawing should be created. For HQ level users, only SAG level officers who normally sign such document be created.</td></tr><tr ><td class=\"two\"> 9)&nbsp;&nbsp;&nbsp;</td><td class=\"two\"><b>Users of Other Organizations:</b> In order to log the movement and for showing in reports, documents pending with users of organizations like NHAI, Forest, NTPC, MCL, SECL etc can also be created by local admin. Normally such users are created with organization name and user id only and no other details for such users are required to be filled as such users will not be using this portal. The RVNL user only will make entries for forwarding the document and registering receipt of approved document as and when it is approved by that user.<br><br></td></tr><tr ><td class=\"test\" style=\"font-weight:bold\" colspan=\"2\"> <h8 >Master List </h8></td></tr><tr ><td class=\"two\"> 1)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">It is the master data base where basic data like PIU, Zone, Division, Department, Designation, Document Type, Project Type & Organizations can be added & Modified.</td></tr><tr ><td class=\"two\"> 2)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">Basic task of System-Admin is to create/update the master data. <br><br></td></tr><tr ><td class=\"test\" style=\"font-weight:bold\" colspan=\"2\"> <h8 >Create Projects</h8></td></tr><tr ><td class=\"two\"> 1)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">System-Admin/Local-Admin can create a new project and can also update information of an existing project, if no document has been created in that particular project. However, details like jurisdiction details and package wise nos. of drawings/documents required to be created/approved can be updated later also without any restrictions.</td></tr><tr ><td class=\"two\"> 2)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">Jurisdiction details for a project are entered in form of Major section, from km & to km details of the project jurisdiction. In case project is spread over more than one major section, add major section button can be used to add a new row. Similarly major section wise Station Details (name and km) are also to be entered to show all the stations in the jurisdictions of the project. Add Station button can be used to add a new station row. Upto 10 major section rows and 50 station rows can be created.</td></tr><tr ><td class=\"two\"> 3)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">Along with details like zone, division, project director, the nos. of documents/drawing required to be created/approved for each document type (i.e. ESP, Bridge GAD etc) for each package is to be entered. </td></tr><tr ><td class=\"two\"> 4)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">System Admin/Local Admin can only update information of any project, he can also change zone if document within that package is not created.</td></tr><tr ><td class=\"two\"> 5)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">System Admin/Local Admin can add and remove packages. A project can have maximum 15 packages. A package can only be removed, if no document of that particular package has been forwarded for approval of Railway.<br><br></td></tr><tr ><td class=\"test\" style=\"font-weight:bold\" colspan=\"2\"> <h8 >Document Reports </h8></td></tr><tr ><td class=\"two\"> 1)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">Filters for Zone, Division, PIU, Projects and Railway User show the options available in your jurisdictions only thereby meaning that you see only your PIU and zones, divisions and Railway users and projects related to your PIU.   </td></tr><tr ><td class=\"two\"> 2)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">Different types of Reports based on selected filters can be generated. The reports can then be printed or exported to local machine in PDF and Excel formats also. For each document shown in the detailed report, log details for particular document can also be seen/printed/exported. The reports also have provision of sorting, search and record display control etc for fast and better retrieval of the required information.</td></tr><tr ><td class=\"two\"> 3)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">The reports can be filtered for 'Zone', 'Division', 'PIU', 'Project Type', 'Project', 'Document Type', 'documents submitted between  two dates', 'approved/ pending status', 'pending with particular Railway user', 'pending for more than a predefined number of days', 'pending with users of other organizations'. In addition, documents of a project can also be filtered for 'Km wise' or 'Station wise' stretch of location.</td></tr><tr ><td class=\"two\"> 4)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">There are basically five different types of reports generated by the system as given below;</td></tr><tr ><td class=\"two\"> &nbsp;&nbsp;a.&nbsp;&nbsp;&nbsp;</td><td class=\"two\"><b>Detailed Reports - </b> All filters are available for this report including filters for location wise details.</td></tr><tr ><td class=\"two\"> &nbsp;&nbsp;b.&nbsp;&nbsp;&nbsp;</td><td class=\"two\"><b>Summary Reports</b></td></tr><tr ><td class=\"two\"> &nbsp;&nbsp;&nbsp;&nbsp;i.&nbsp;&nbsp;&nbsp;</td><td class=\"two\"><b>Project Wise Summary Report -</b> Please enter 'x' and 'y' variables of time periods as per your choice. Default values are 30 and 60 days. Filter for location wise details and Organization (other than Railway/RVNL) are available for this report but filters for Document 'Status', 'Railway User' and 'Under Approval for more than' specified period are not available for this report type.</td></tr><tr ><td class=\"two\"> &nbsp;&nbsp;&nbsp;&nbsp;ii.&nbsp;&nbsp;&nbsp;</td><td class=\"two\"><b>Department Wise Summary Report - </b> Please enter 'x' and 'y' variables of time periods as per your choice in the time periods panel. Default values are 30 and 60 days. Filter for location wise details and Organization (other than Railway/RVNL) are available for this report but filters for Document 'Status', 'Railway User' and 'Under Approval for more than' specified period are not available for this report type.</td></tr><tr ><td class=\"two\"> &nbsp;&nbsp;&nbsp;&nbsp;iii.&nbsp;&nbsp;&nbsp;</td><td class=\"two\"><b>Project Specific Status Report - </b> Please select a particular project to view this report. Filter for location wise details, Document 'Status', 'Railway User' and 'Under Approval for more than' specified period and Organization (other than Railway/RVNL) are not available for this report type.</td></tr><tr ><td class=\"two\"> &nbsp;&nbsp;&nbsp;&nbsp;iv.&nbsp;&nbsp;&nbsp;</td><td class=\"two\"><b>Monthwise Summary Report - </b> Report shows monthwise position for documents submitted and approved for last 12 months including the current month. Filter for location wise details, Document 'Status', 'Railway User' and 'Under Approval for more than' specified period and Organization (other than Railway/RVNL) are not available for this report type.</td></tr><tr ><td class=\"two\"> 5)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">For further details please see 'More information'.<br><br></td></tr><tr ><td class=\"test\" style=\"font-weight:bold\" colspan=\"2\"> <h8 >Public View Report</h8></td></tr><tr ><td class=\"two\"> 1)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">This is a special link for PIU and Project Specific drill-down reports which are also be available for public view on RVNL website. You can view details pertaining to any PIU or Project. </td></tr><tr ><td class=\"two\"> 2)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">This report is combination of Project Specific document type wise summary report with hyper-links to Project wise Summary and Detailed Reports. <br><br></td></tr><tr ><td class=\"test\" style=\"font-weight:bold\" colspan=\"2\"> <h8 >User List </h8></td></tr><tr ><td class=\"two\"> 1)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">This tab shows the information of all users of RVNL and Railways. </td></tr><tr ><td class=\"two\"> 2)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">A complete list of users of other organizations is also available.<br><br></td></tr><tr ><td class=\"test\" style=\"font-weight:bold\" colspan=\"2\"> <h8 >Data Entry Progress Report</h8></td></tr><tr ><td class=\"two\"> 1)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">This tab shows the information regarding progress of data entry i.e. zone, division wise Railway users created, PIU wise  RVNL users created, project and package created, documents created and forwarded to Railways till date. <br><br></td></tr><tr ><td class=\"test\" style=\"font-weight:bold\" colspan=\"2\"> <h8 >Reopen a Finally Approved/Closed Document </h8></td></tr><tr ><td class=\"two\"> 1)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">This tab shows the list of documents which are marked as finally approved.</td></tr><tr ><td class=\"two\"> 2)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">System-Admin can reopen a closed/finally approved document on request from PIU level RVNL user for resubmission of modified document for approval of Railway, if required in any case. <br><br></td></tr><tr ><td class=\"test\" style=\"font-weight:bold\" colspan=\"2\"> <h8 >Settings </h8></td></tr><tr ><td class=\"two\"> 1)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">You can set user/local admin profile change/password resetting alerts (sms/email) to be triggered on/off. </td></tr><tr ><td class=\"two\"> 2)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">You can switch from 'user fed date' setting to 'Real time date setting' where document forward and approval dates will be automatically taken as the date when entry to that effect is made on the portal. </td></tr><tr ><td class=\"two\"> 3)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">Alerts to railway users/DRMs/GMs can also be switched on/off for a particular PIU from this tab. <br><br></td></tr><tr ><td class=\"test\" style=\"font-weight:bold\" colspan=\"2\"> <h8 >Message/Picture Display or Relay of Messages to Users </h8></td></tr><tr ><td class=\"two\"> 1)&nbsp;&nbsp;&nbsp;</td><td class=\"two\"> In this table, you can enter upto three marquee messages (marquee-launch, marquee-maint, marquee-other) for relaying on the portal to all users.</td></tr><tr ><td class=\"two\"> 2)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">You can also display upto three messages from high officials (msg-1, msg-2, msg-3) alongwith thier pictures (pic-1, pic-2, pic-3) on the Login page of the portal. <br><br></td></tr><tr ><td class=\"test\" style=\"font-weight:bold\" colspan=\"2\"> <h8 >Log Details </h8></td></tr><tr ><td class=\"two\"> 1)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">Logs are used to get the current status and movement log of particular document.</td></tr><tr ><td class=\"two\"> 2)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">Flow status of particular document from start to finish will be available in the log details.</td></tr><tr ><td class=\"two\"> 3)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">Document logs can be seen/accessed from 'Documents' tab.</td></tr><tr ><td class=\"two\"> 4)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">Logs can also be generated for each document shown in Detailed Reports generated from 'My Reports' tab. <br><br></td></tr><tr ><td class=\"test\" style=\"font-weight:bold\" colspan=\"2\"> <h8 >Change Password </h8></td></tr><tr ><td class=\"two\"> 1)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">This tab is used to change password by entering current password & new password of minimum five alphanumeric characters.</td></tr><tr ><td class=\"two\"> 2)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">In case you forget your password, please contact Technical Support Team for the Portal.<br><br></td></tr><tr ><td class=\"test\" style=\"font-weight:bold\" colspan=\"2\"> <h8 >Log Out </h8></td></tr><tr ><td class=\"two\"> 1)&nbsp;&nbsp;&nbsp;</td><td class=\"two\">It will get you out from the system.</td></tr></table>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write(" \r\n");
      out.write("<br><br><br><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t      ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("@import url('http://fonts.googleapis.com/css?family=Open+Sans:400,700');\r\n");
      out.write("\r\n");
      out.write("footer{\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\tmargin-top:150px;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- \r\n");
      out.write("<footer>\r\n");
      out.write("<div class=\"city\">\r\n");
      out.write("  <ul class=\" nav navbar-nav\">\r\n");
      out.write("  \r\n");
      out.write("    <li class=\"footerli\">Rail Vikas Nigam Limited.</li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul   class=\"nav navabar-nav\" style=\"float:right;\">\r\n");
      out.write("   <li class=\"footerli\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Design & Developed By<a href=\"http://www.awcsoftware.net\" style=\"text-decoration:none;\">AWC SOFTWARE PVT LTD</a></li>\r\n");
      out.write("    \r\n");
      out.write("  </ul>\r\n");
      out.write(" </div>\r\n");
      out.write("\r\n");
      out.write("</footer> -->\r\n");
      out.write("\r\n");
      out.write("<footer class=\"footer-basic-centered\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<p class=\"footer-company-motto\" style=\"float:left;\">Rail Vikas Nigam Limited</p>\r\n");
      out.write("\t\t\t<p class=\"footer-company-motto\" style=\"float:center; font-family:serif; font-size:14px; font-style:italic; margin-top:5px;\">Ver:2.30.pks</p>\r\n");
      out.write("\t\t\t<p class=\"footer-company-name\" style=\"float:right; margin-top:-20px;\"> Design & Developed By<a href=\"http://www.awcsoftware.net\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;AWC SOFTWARE PVT LTD</a></p>\r\n");
      out.write("\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("</body>");
      out.write("\r\n");
      out.write("\r\n");
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