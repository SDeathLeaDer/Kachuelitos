<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login de Usuario</title>
<link rel="stylesheet" href="styles/page.css" type="text/css"
	media="screen" title="no title" charset="utf-8">
	
<script type="text/javascript">
	$(document).ready(function() {
		$('#submit').click(function(event) {
			var vdni = $('#idni').val();
			var vpassword = $('#ipassword').val();

			$.post('UserIdentification', {
				cdni : vdni,
				cpassword : vpassword,
			}, function(responseText) {
				if (responseText == '1') {
					window.location = "Kachuelitos/UserAccount.java";
				} else {					
					var message = $('#imessage');
					message.value = responseText;					
				}
			});
		});
	});
</script>

</head>
<body>

	<div id="header" align="center">
		<img id='mainlogo' alt='logo' src='images/logo.jpg' width='300px'>
	</div>

	<div id='main' align='center'>

		<form>
			<fieldset style='width: 300px'>
				<legend align='left'>Login</legend>
				<p class='maincontent'>
					DNI <input name='idni' type='number' />
				</p>
				Password <input name='ipassword' type='password' />
				</p>
				<p class='maincontent'>
					<input type="button" id="submit" value="Iniciar Sesi�n" />
				</p>
				<p><div id="imessage"></div>

			</fieldset>
		</form>
		<form action='/Kachuelitos/UserRegister' method='get'>
			<p class='maincontent2'>
				�Quiere ser parte de la red de trabajadores de 101 Kachuelitos?
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