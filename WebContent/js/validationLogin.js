
var isCorrect = 1;

var isCorrectDni = 1;
var isCorrectPassword = 1;

function validation(element) {
	
	var messageAlert = document.getElementById('imessage');

	if (element == 'idni') {
		var vdni = document.getElementById('idni').value;
		var image = document.getElementById("dni_check");
		var erdni = /^[0-9^A-Z]{8,8}$/;

		if (erdni.test(vdni)) {
			image.src = "images/yes_check.png";
			isCorrectDni = 1;
		} else {
			image.src = "images/no_check.png";
			isCorrectDni = 0;
		}
	}
	
	if (element == 'spassword') {
		var vpassword = document.getElementById('spassword').value;
		var image = document.getElementById("password_check");
		var erepassword = /(?!^[0-9]*$)(?!^[a-zA-Z]*$)^([a-zA-Z0-9]{8,10})$/;

		if (erepassword.test(vpassword)) {
			image.src = "images/yes_check.png";
			isCorrectPassword = 1;
		} else {
			image.src = "images/no_check.png";
			isCorrectPassword = 0;
		}
	}

	
	if(isCorrectDni && isCorrectPassword){
		messageAlert.innerHTML = " ";
		isCorrect= 1;
	}
	else{
		messageAlert.innerHTML = "Existen campos invalidados, </br> llene de manera correcta !!";	
		isCorrect= 0;
	}
}

function validationSubmit() {
	
	var isCorrectSubmit = 0;
	if ((document.getElementById('idni').value.length == 0)
			|| (document.getElementById('spassword').value.length == 0)) {
		
		var messageAlert = document.getElementById('imessage');
		messageAlert.innerHTML = "Existen campos vacios, </br> intento nuevamente !!!";
		isCorrectSubmit = 0;
	}
	else{
		isCorrectSubmit = 1;
	}
	
	if(isCorrectSubmit == 1 && isCorrect == 1){
		return true;
	}
	else{
		var messageAlert = document.getElementById('imessage');
		messageAlert.innerHTML = "No se pudo enviar el formulario, </br> revise los campos  !!";

		return false;
	}
}
