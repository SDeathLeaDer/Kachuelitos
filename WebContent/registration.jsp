z
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro de Usuario</title>
<link rel="stylesheet" href="resources/style/page.css" type="text/css"
	media="screen" title="no title" charset="utf-8">
	
<script type="text/javascript" src="js/validationRegister.js"></script>

</head>
<body>
	<div id="header" align="center">
		<img id="mainlogo" alt="logo" src="images/logo.jpg" width="300px">
	</div>
	<div id="main2" align="center">

		<br> <br>
		<form action="/Kachuelitos/UserValidation" method="post" onsubmit="return validationSubmit();">
			<fieldset style="width: 400px; padding: 10px">

				<legend align="left">Formulario de registro</legend>
				<p class="maincontent">
					DNI <input id="idni" name="idni" type="text"  onchange="validation('idni')"  /> <img
						id="dni_check">
				</p>
				<p class="maincontent">
					Ubigeo <input id="iubigeo"  name="iubigeo"  onchange="validation('iubigeo')" /> <img
						id="ubigeo_check" />
				</p>
				<p class="maincontent">
					Nombre <input id="iname"  name="iname"  onchange="validation('iname')" /> <img
						id="name_check" />
				</p>
				<p class="maincontent">
					Apellidos <input id="ilastname"  name="ilastname" onchange="validation('ilastname')" />
					<img id="lastname_check" />
				</p>
				<p class="maincontent">
					Correo <input id="iemail" name="iemail" onchange="validation('iemail')" /> <img
						id="email_check" />
				</p>
				<p class="maincontent">
					Password <input id="ipassword" name="ipassword" type="password"
						onchange="validation('ipassword')" /> <img id="password_check" />
				</p>
				<br>
				<p class="maincontent">Nota: La contraseña debe ser entre 8 y 10
					caracteres, por lo menos 1 digito y un alfanumérico.</p>

				<p class="maincontent">
					<button>Registrarse</button>
				</p>
				<div id="imessage"></div>

			</fieldset>
		</form>
	</div>
	<footer>
	<div align="center">
		<hr width="50%">
		<p>Derechos Reserv@dos 101 Kachuelitos 2014</p>
	</div>
	</footer>
</body>