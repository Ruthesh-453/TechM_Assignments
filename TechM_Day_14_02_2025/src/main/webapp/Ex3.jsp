<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@page language="java" %>

<%!
double radius=6.0;
private double getRadius(){
	return radius;
}
private double getDiameter(){
	return(radius*2);
}
private double getArea(){
	return(3.1415 * radius * radius);
}
private double getCircum(){
	return (3.1415*(radius*2));
}
%>

<title>Insert title here</title>
</head>
<body>
<h3 align="center">Computing the Area and Circumference</h3>
<b>Radius of Circle is</b><%=radius%>cm<br/>
<b>Diameter is</b><%=getDiameter()%>cm<br/>
<b>Area of a Circle is</b><%=getArea() %>cm<sup>2</sup><br/>
<b>Circumference is</b><%=getCircum() %><br/>


</body>
</html>