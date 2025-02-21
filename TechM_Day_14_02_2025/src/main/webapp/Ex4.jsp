<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="gold">
<center>
<h1 align="center">Parameter Passing</h1>
<b>
<%
String name=request.getParameter("usrName");
if(name.length()==0) {
%>
<%@include file="NoData.jsp"%>
<%
}
else {
%>
<br>
<font face="Arial,Helvitica" size="+2">
<%= "Good Morning," + name + "!!!" %>
<% }
%>


</b>

	

</body>
</html>