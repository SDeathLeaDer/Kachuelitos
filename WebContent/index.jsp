<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenidos a Kachuelitos</title>
<link rel="stylesheet" href="resources/style/page.css" type="text/css"
	media="screen" title="no title" charset="utf-8">
</head>
<body>

<div id="login">
	<form action="login.jsp" method="post">
		<button id="buttonTop">Iniciar Sesión</button>
	</form>
</div>

<div id="header" align="center">
	<img id="mainlogo" src="images/logo.jpg" width="300px">
</div>

<div align="center" id="main">
	<form action="/Kachuelitos/EmployeeSearch" method="get">
		<p class="maincontent">¿Qué tipo de trabajador esta buscando?</p>
		<p class="maincontent">
			<input name="typework">
		</p>
		<button>Buscar</button>
	</form>
	<form action="registration.jsp">
		<p class="maincontent2">
			¿Quiere ser parte de la red de trabajadores de 101 Kachuelitos o
			quieres contratar a alguien?
			<button >Unete</button>
		</p>
	</form>
</div>
<footer>
<div align="center">
	<hr width="50%">
	<p>Derechos Reserv@dos 101 Kachuelitos 2014</p>
</div>
</footer>

</body>
</html>