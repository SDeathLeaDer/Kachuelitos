<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trabajos</title>
</head>
<body>
<div id="main" align="center">
		<img id="mainlogo" alt="logo" src="images/logo.jpg" width="300px"></img>
		<s:form action="UserValidation" method="get">
			<fieldset style="width: 300px">
				<legend align="left">Formulario de registro</legend>
				<s:textfield  name="dni" type="number" size="8" label="DNI" />
				</p>
				<s:textfield name="ubigeo" type="number" size="6" label="Ubigeo"/>
				</p>
				<s:textfield name="email" type="email" label="Correo"/>
				</p>
				<s:textfield name="password" type="password" label="Password"/>
				</p>
				<s:submit value="validateUser" />
					<button>Registrarse</button>
				</p>
			</fieldset>
		</s:form>
	</div>
	<div class ="footer" align="center">
		<hr width="50%"></hr>
		<p>Derechos Reserv@dos 101 Kachuelitos 2014</p>
	</div>
</body>
</html>