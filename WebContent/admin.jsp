<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<form action="<%=request.getContextPath()%>/admin"  method="post" class="form-group">
		    <label for="Response">Reponse</label>
		    <textarea name="response" class="form-control" id="Question" rows="3" required></textarea>
    	  	<button type="submit" class="btn btn-primary">Submit</button>     
	  	</form>
	  	
	  	<c:forEach items="${data}" var="d">
		    
	       <span >Question: <b>${d.getResponse()}</b> </span>

				  
		</c:forEach>
 

</body>
</html>