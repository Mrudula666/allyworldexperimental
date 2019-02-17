<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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

	<div id="fullContainer">
		<div class="col-xs-6 col-md-6 col-lg-5 mLeft0">
			<!-- for the status update -->
			<div class="col-xs-12 col-md-12 col-lg-12 " id="postStatus">
				<div>
					<h4>Enter your Status Here</h4>
					<textarea class="ashFont col-xs-12 col-md-12 col-lg-12 "
						id="postTextArea" value="What's on your mind?"
						placeholder="What's On Your Mind!!!"></textarea>
				</div>
			</div>
			<div class="col-xs-12 col-md-12 col-lg-12 dispInLine postBottom "
				id="showPostBottomBar">
				<div class="iconImage1 camera  "></div>
				<div class="iconImage1 user   "></div>
				<div class="iconImage1 smiley   "></div>
				<div class="iconImage1 location   "></div>
				<div class="btn floatRight" id="btnPost" role="group"
					aria-label="...">
					<div class="btn-group  " role="group">
						<button type="button"
							class="btn btn-default dropdown-toggle  postdropdown"
							data-toggle="dropdown" aria-expanded="false">
							<span class="glyphicon glyphicon-globe mTop1"></span> Public <span
								class="caret"></span>
						</button>
						<ul class="dropdown-menu" role="menu">
							<div class="stlylingDiv mTop0">Who should see this ?</div>
							<li class="mTop10"><a href="#"><span
									class="glyphicon glyphicon-globe mRight5"></span>Public</a></li>
							<li><a href="#"><span
									class="glyphicon glyphicon-user mRight5"></span>Friends</a></li>

							<li><a href="#"><span
									class="glyphicon glyphicon-lock mRight5"></span>Only Me</a></li>
							<li><a href="#"><span
									class="glyphicon glyphicon-cog mRight5"></span>Custom</a></li>
						</ul>
						</ul>
					</div>
					<button type="button" class="button1">Post</button>
				</div>
			</div>
			<!--  for the posts -->
			<div class="col-xs-12 col-md-12 col-lg-12 individualsection mTop10">
				<div class="col-xs-12 col-md-12 col-lg-12 individualsection mTop10">
				</div>
			</div>
		</div>


		<style>
@
-webkit-keyframes placeHolderShimmer { 0% {
	background-position: -468px 0
}

100%
{
background-position






:






468
px



 



0
}
}
@
keyframes placeHolderShimmer { 0% {
	background-position: -468px 0
}

100%
{
background-position






:






468
px



 



0
}
}
.timeline-item {
	background: scrollbar;
	border: 1px solid;
	border-color: #e5e6e9 #dfe0e4 #d0d1d5;
	border-radius: 3px;
	padding: 12px;
	margin: 0 auto;
	max-width: 60%;
	min-height: 200px;
}

.fa {
	font-size: 50px;
	cursor: pointer;
	user-select: none;
}

.fa:hover {
	color: darkblue;
}

hr.new {
	border: 10px solid blue;
	border-radius: 5px;
}
</style>
		<div class="timeline-wrapper">
			<div class="timeline-item">
				<spring:form>
					<jstl:forEach var="post" items="${posts}">

						<p>
							<b>Status</b>: ${post.status}
						</p>
						<p>
							<b>Date</b>: ${post.date}
						</p>
						<p>
							<b>Image</b>: <img src=${post.url}>
						</p>
						<p>

							<a href="updatelikes?postId=${post.postId}"
								class="btn btn-block btn-primary"> <i
								class="fa fa-thumbs-up">Like</i>
								${fn:length(post.likes.likesProfileId)}
							</a>
							<%-- <b>Likes</b>: ${fn:length(post.likes.likesProfileId)} --%>
						</p>
						<p>

							<!-- <button type="submit" class="btn btn-default"
								onclick="location.href='\search.php?search='+ document.getElementById('search').value+'&search2='+document.getElementById('search2').value;">
								Search</button> -->
								<!--  -->
							<a onclick="location.href='comment?postId=${post.postId}&comment='+document.getElementById('com').value;" 
							class="btn btn-blockbtn-primary" > <i class="fa fa-comments">Comments</i>
</a> <i
								class="fa">&#xf086;</i> 
								<input type="text" name="comment" id="com" > 
							<b>Comments:</b>: ${post.comments.comment}
						</p>

						<hr class="new">
					</jstl:forEach>




				</spring:form>
			</div>
		</div>
		
		<script type="text/javascript">
		function aa(){
			alert();
		}
		</script>
</body>
</html>