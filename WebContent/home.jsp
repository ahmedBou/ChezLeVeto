<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

	<body>
		
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
		  <a class="navbar-brand" href="#">Navbar</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		  <div class="collapse navbar-collapse" id="navbarNav">
		    <ul class="navbar-nav">
		      <li class="nav-item active">
		        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="#">Rendez Vous</a>
		      </li>
	
		    </ul>
		  </div>
		</nav>
		
		<form action="<%=request.getContextPath()%>/home"  method="post" class="form-group">
		    <label for="Question">Posez Vos Question</label>
		    <textarea name="question" class="form-control" id="Question" rows="3" required></textarea>
    	  	<button type="submit" class="btn btn-primary">Submit</button>     
	  	</form>
	  	
	  	<c:forEach items="${data}" var="d">
		    
	       <span >Question: <b>${d.getQuestion()}</b> </span>

				  
		</c:forEach>
		
	 	<c:forEach items="${dataResp}" var="dr">
		    
	       <span >Response: <b>${dr.getResponse()}</b> </span>

				  
		</c:forEach>
 
	</body>
</html>