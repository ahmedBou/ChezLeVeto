<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		
		<link rel="stylesheet"
			href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
			integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
			crossorigin="anonymous">
	</head>

	<body>
		<div class="container">
		<div class="row text-center" style="color: tomato;">
			<h2>Enregistrez vous</h2>
		</div>
		<hr>
			<div class="row col-md-10 col-md-offset-3">	
				
				<div class="card card-body">
				
					<h2>Entrez vos coordonnée</h2>
					
					<div class="col-md-8 col-md-offset-3">
	
						<form action="<%=request.getContextPath()%>/register" method="post">
	
							<div class="form-group">
								<label for="uname">Nom:</label> <input type="text"
									class="form-control" id="nom" placeholder="Entrez votre nom"
									name="nom" required>
							</div>
							<div class="form-group">
								<label for="uname">Prenom:</label> <input type="text"
									class="form-control" id="prenom" placeholder="Entrez votre prenom"
									name="prenom" required>
							</div>
							<div class="form-group">
								<label for="uname">Email:</label> <input type="text"
									class="form-control" id="email" placeholder="Entrez votre email"
									name="email" required>
							</div>
	
							<div class="form-group">
								<label for="uname">Role:</label> <input type="text"
									class="form-control" id="role" placeholder="entrez 2 si vous etes patient"
									name="role" required>
							</div>
	
							<div class="form-group">
								<label for="uname">Password:</label> <input type="password"
									class="form-control" id="pswd" placeholder="Entrez votre password"
									name="pswd" required>
							</div>
	
							<button type="submit" class="btn btn-primary">Submit</button>
	
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>