<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/js/bootstrap-datetimepicker.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/css/bootstrap-datetimepicker.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	
<div class="panel  w3-panel">
		<div class="panel-heading w3-flat-turquoise">Effectuer un Rendez-vous</div>
		<div class="panel-body">
			<div class="row">
				<div class="col-md-6">
					<div class="form-group">
						<label class="control-label">Motif de RDV :</label> <input
							type="text" class="form-control" name="email" id="email">
					</div>
				</div>
				<div class='col-md-6'>
					<div class="form-group">
						<label class="control-label">Date RDV : </label>
						<div class='input-group date' id='datetimepicker1'>
							<input type='text' class="form-control" /> <span
								class="input-group-addon"> <span
								class="glyphicon glyphicon-calendar"></span>
							</span>
						</div>
					</div>
				</div>
			</div>
			<input type="submit" class="btn w3-flat-turquoise" value="Effectuer RDV">
		</div>
	</div>
	
	
	<script>
	$(function() {
		$('#datetimepicker1').datetimepicker();
	});
</script>


</body>
</html>