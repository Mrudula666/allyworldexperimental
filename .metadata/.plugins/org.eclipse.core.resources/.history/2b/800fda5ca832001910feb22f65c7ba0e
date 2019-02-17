<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>   
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
  <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<c:form action="updatePostForUpdate"  modelAttribute="post">

	<table class="table table-bordered">
		<tr> 
			<th> PostId </th>
			<th> ProfileId </th>
			<th> Status</th>
			<th> Url </th>
			<th> Date </th>
			<th> Likes </th>
			<th> LikesProfileIds </th>
			<th> CommentsProfileIds </th>
			<th> Comments </th>
			<th> commentTime </th>
			<th> commentLikes </th>
		</tr>
			<jstl:if test="${post !=null}">
				<tr>
				<td><input name="postId" value="${post.postId}" readonly="readonly"></td>
				<td><input name="profileId" value="${post.profileId}" readonly="readonly"></td>
				<td><input type="text" name="status" value="${post.status}" ></td>
				<td><input name="url" value="${post.url}"></td>
				<td><input name="date" value="${post.date}" readonly="readonly"></td>
				<td><input name="likes" value="${fn:length(post.likes.likesProfileId)}" readonly="readonly"></td>
				<td><input type="number" name="likesProfileId" value="${post.likes.likesProfileId}"></td>
				<td><input type="number" name="commentProfileId" value="${post.comments.commentProfileId}"></td>
				<td><input type="text"  name="comment" value="${post.comments.comment}"></td>
				<td><input name="commentTime" value="${post.comments.commentTime}" readonly="readonly"></td>
				<td><input type="number" name="commentLikes" value="${fn:length(post.comments.commentProfileId)}" readonly="readonly"></td>
				</tr>
				</jstl:if>
	</table>
	<input type = "submit" value="Submit"> 	&nbsp &nbsp&nbsp
	<input type = "reset" value="reset"> <br>
	</c:form>
	<div>
		<jsp:include page="HomeLink.html"></jsp:include>
	</div>
</body>
</html>