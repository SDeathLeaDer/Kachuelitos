<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mi cuenta</title>

<link rel="stylesheet" href="styles/tab.css" type="text/css"
	media="screen" title="no title" charset="utf-8">

<link rel="stylesheet" href="styles/page.css" type="text/css"
	media="screen" title="no title" charset="utf-8">
</head>
<body>

	<div id='header'>
		<img id='logo' src='images/logo.jpg' width='250px' />
		<form action='actionLogOut' method='post'>

			<div id='buttonTop'>
				Bienvenido
				<s:property value="#session.user.nombreUser" />
				<s:property value="#session.user.apellidoUser" />

				<button>Cerrar Sesion</button>
			</div>
		</form>
	</div>


	<div id='tabContainer'>
		<ul id='topTab'>
			<li><a href='useraccount.jsp' title='Home' class='current'>Mi
					Cuenta</a></li>
			<li><a href='userservices.jsp' title='Home'>Servicios</a></li>
			<li><a href='userworks.jsp' title='Home'>Mis Trabajos</a></li>
			<%--  <li><a href='usercv.jsp' title='Home' >Mi CV</a></li> --%>
		</ul>
	</div>
	<div id='content' align='center'>

		<br> <br> <br>

		<form>

			<p class="maincontent">
				Nombre <input id="iname" name="iname" onchange="validation('iname')"
					value=<s:property value="#session.user.nombreUser"/> /> <img
					id="name_check" />
			</p>
			<p class="maincontent">
				Apellidos <input id="ilastname" name="ilastname"
					onchange="validation('ilastname')"
					value=<s:property value="#session.user.apellidoUser"/> /> <img
					id="lastname_check" />
			</p>
			<p class="maincontent">
				Correo <input id="iemail" name="iemail"
					onchange="validation('iemail')"
					value=<s:property value="#session.user.correoUser"/> /> <img
					id="email_check" />
			</p>
			<p class="maincontent">
				Ubigeo <input id="iubigeo" name="iubigeo"
					onchange="validation('iubigeo')"
					value=<s:property value="#session.user.ubigeoIdUbigeo1"/> /> <img
					id="ubigeo_check" />
			</p>
			<p class="maincontent">
				Telefono <input id="itelefono" name="itelefono"
					onchange="validation('itelefono')"
					value=<s:property value="#session.user.telefonoUser"/> /> <img
					id="dni_check">
			</p>

			<p class="maincontent">
				Direccion <input id="idireccion" name="idireccion"
					onchange="validation('idireccion')"
					value=<s:property value="#session.user.direccionUser"/> /> <img
					id="password_check" />
			</p>

			<p class="maincontent">
				Eres trabajador <input type=checkbox name=trab>
			</p>
			<p class="maincontent">
				<button>Guardar</button>
			</p>

		</form>
	</div>
	<footer>
	<div align='center'>
		<hr width='50%'></hr>
		<p>Derechos Reserv@dos 101 Kachuelitos 2014</p>
	</div>
	</footer>
</body>
</html>