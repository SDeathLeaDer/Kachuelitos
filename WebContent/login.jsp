<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login de Usuario</title>
</head>
<body>
	<div id='main' align='center'>
		<img id='mainlogo' alt='logo' src='images/logo.jpg' width='300px'>
		<form action='/Kachuelitos/UserIdentification' method='post'>
			<fieldset style='width: 300px'>
				<legend align='left'>Login</legend>
				<p class='maincontent'>
					DNI <input name='idni' type='number' />
				</p>
				Password <input name='ipassword' type='password' />
				</p>
				<p class='maincontent'>
					<button>Iniciar Sesión</button>
				</p>
			</fieldset>
		</form>
		<form action='/Kachuelitos/UserRegister' method='get'>
			<p class='maincontent2'>
				¿Quiere ser parte de la red de trabajadores de 101 Kachuelitos?
				<button>Unete</button>
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