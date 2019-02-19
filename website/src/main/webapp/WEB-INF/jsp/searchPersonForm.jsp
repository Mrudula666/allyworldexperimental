<%@ page isELIgnored="false" language="java"
    contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ally_World</title>
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
 

<!-- jQuery library -->
 
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 

<!-- Popper JS -->
 
<script
    src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
 

<!-- Latest compiled JavaScript -->
 
<script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
 

</head>
<style type="text/css">
th, td {
    padding: 1px;
    background-color: lightblue
}
</style>
 
<body>
    <jsp:include page="navigation.jsp" />
 
 
    <style>
.timeline-item {
    background: scrollbar;
    border: 1px solid;
    border-color: #e5e6e9 #dfe0e4 #d0d1d5;
    border-radius: 3px;
    padding: 12px;
    margin: 20px auto;
    max-width: 60%;
    min-height: 200px;
}
 
#send {
    width: 130px;
    height: 30px;
}
 
a {
    text-decoration: none;
}
</style>
    <div class="timeline-wrapper">
        <div class="timeline-item">
            <spring:form action="send" modelAttribute="person">
                <h3>${person.fullName}</h3>
                    <a href="request"><input id="send" type="submit" name="submit"
                        value="Send Request"></a> 
                        <a href="#"><input id="send" type="submit" name="submit" value="Delete Request">
                
                </a>
 

            </spring:form>
        </div>
    </div>
</body>
</html>