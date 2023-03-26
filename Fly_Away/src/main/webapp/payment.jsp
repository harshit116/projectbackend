<%@ page import="com.flyaway.controller.RegisterPage" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int price=RegisterPage.flightPrice;
int person=Integer.parseInt(request.getParameter("person"));
out.println("Number Of persons entered= "+person+"<br>");
out.println("Price of flight per person= "+price+"<br>");
out.println("Amount to Pay= "+price*person+"<br>");
out.println("<br>");
%>
<form action="final.html" method="post">
<table>

			<tr>
				<td>Card No</td>
				<td><input name="cardno" type="text" /></td>
			</tr>
			<tr>
				<td>Name On Card</td>
				<td><input name="nameoncard" type ="text"/></td>
			</tr>
			<tr>
				<td>Date Of Expiry</td>
				<td><input name="expiry" type="date"/></td>
			</tr>
			<tr>
				<td>Cvv</td>
				<td><input name="cvv" type="text"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Pay" /></td>
			</tr>
		</table>
		</form>
</body>
</html>