<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cerrar sessión</title>

<link rel="stylesheet" href="styles/page.css" type="text/css"
	media="screen" title="no title" charset="utf-8">
	

<script type="text/javascript" src="js/validationLogin.js"></script>

</head>
<body>

	<div id="header" align="center">
		<img id='mainlogo' alt='logo' src='images/logo.jpg' width='300px'>
	</div>

	<div id='main' align='center'>
		<form action="actionUserIdentification" method="post"
			onsubmit="return validationSubmit();">
			<p> Se cerro de manera satifactoria !!!</p>
		</form>

		<form action='login.jsp' method='get'>
			<p class='maincontent2' >
			<%  %>
				Regresar a la pagina de inicio de =)
				<button>Regresar</button>
			</p>
		</form>
	</div>
	<footer>
	<div align='center'>
		<hr width='50%'>
		<p>Derechos Reserv@dos 101 Kachuelitos 2014</p>
	</div>
	</footer>
</body>
</html>