<%@ page import="java.io.*,java.sql.*" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
 <%@ page import="javax.naming.*,java.sql.*,javax.sql.*"%>
 
<%
String listType =request.getParameter("list");
String Projects=request.getParameter("ver");
String doctype=request.getParameter("ver");
%>
<input type = "hidden" id = ListType value = <%=listType%>>
<%
System.out.println("document changed="+doctype);
Connection conn = null;
Statement stmt = null;
ResultSet rs = null, rs1 = null, rs3 = null,rs4=null,rs5=null,rs12=null,rs13=null,rs14=null;
PreparedStatement ps1 = null, ps3 = null;
 
Context initCtx = new InitialContext();
Context envCtx = (Context) initCtx.lookup("java:comp/env");
DataSource ds = (DataSource) envCtx.lookup("jdbc/MySQLDB");

conn = ds.getConnection();


                 String query = "select * from xx_documentattributes_master where Document_Type='"+doctype+"'"; 
                 System.out.println("query="+query);
                 ps3 = conn.prepareStatement(query);
					rs3 = ps3.executeQuery();
                    if(rs3.next())
                    {   
                    	out.println("<INPUT TYPE='HIDDEN' NAME='exist' ID='exist' value='true'>");
                        out.println("<font color=red>");
                        out.println("Document Type already Exist");
                        out.println("</font>");
 
                    }else {
 
                       out.println("<font color=green>");
                      out.println(" Available");
                        out.println("</font>");
 
                    }


rs3.close();
ps3.close();
conn.close();
 
%>
