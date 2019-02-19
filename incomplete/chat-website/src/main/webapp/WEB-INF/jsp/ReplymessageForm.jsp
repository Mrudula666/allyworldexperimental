<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring:form action="reply" modelAttribute="chat">
<table>
<tr>
<td><label>SenderId:</label></td>
<td><input type="text" name="senderId" value=""></td>
</tr>
<tr>
<td><label>receiverId:</label></td>
<td><input type="text" name="receiverId" value=""></td>
</tr>
<tr>
<td><label>Message:</label></td>
<td><input type="text" name="message" value=""></td>
</tr>
<!-- <tr>
<td><label>action:</label></td>
<td><input type="radio" name="action" value="send">send</td>
<td><input type="radio" name="action" value="reply">reply</td>
</tr> -->
<tr>
<td><input type="submit" name="submit" value="reply Message"></td>
</tr>
</table>
</spring:form>
<spring:form action="allChat">
<button>Get Chat</button>
</spring:form>
</body>
</html>