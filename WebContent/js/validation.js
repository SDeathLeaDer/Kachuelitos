
var isCorrect = 1;

var isCorrectDni = 1;
var isCorrectUbigeo = 1;
var isCorrectName = 1;
var isCorrectLastName = 1;
var isCorrectEmail = 1;
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

	if (element == 'iubigeo') {
		var vubigeo = document.getElementById('iubigeo').value;
		var image = document.getElementById("ubigeo_check");
		var erubigeo = /^[0-9^A-Z]{6,6}$/;

		if (erubigeo.test(vubigeo)) {
			image.src = "images/yes_check.png";
			isCorrectUbigeo = 1;
		} else {
			image.src = "images/no_check.png";
			isCorrectUbigeo = 0;
		}
	}

	if (element == 'iname') {
		var vname = document.getElementById('iname').value;
		var image = document.getElementById("name_check");
		var ername = /^[A-Z|a-z]{2,40}$/;

		if (ername.test(vname)) {
			image.src = "images/yes_check.png";
			isCorrectName = 1;
		} else {
			image.src = "images/no_check.png";
			isCorrectName = 0;
		}
	}

	if (element == 'ilastname') {
		var vlastname = document.getElementById('ilastname').value;
		var image = document.getElementById("lastname_check");
		var erlastname = /^[A-Z|a-z]{2,40}$/;

		if (erlastname.test(vlastname)) {
			image.src = "images/yes_check.png";
			isCorrectLastName = 1;
		} else {
			image.src = "images/no_check.png";
			isCorrectLastName = 0;
		}
	}

	if (element == 'iemail') {
		var vemail = document.getElementById('iemail').value;
		var image = document.getElementById("email_check");
		var eremail = /^[^@\s]+@[^@\.\s]+(\.[^@\.\s]+)+$/;

		if (eremail.test(vemail)) {
			image.src = "images/yes_check.png";
			isCorrectEmail = 1;
		} else {
			image.src = "images/no_check.png";
			isCorrectEmail = 0;
		}
	}
	
	
	if (element == 'ipassword') {
		var vpassword = document.getElementById('ipassword').value;
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

	
	if(isCorrectDni && isCorrectUbigeo && isCorrectName && isCorrectLastName && isCorrectEmail && isCorrectPassword){
		messageAlert.innerHTML = " ";
		isCorrect= 1;
	}
	else{
		messageAlert.innerHTML = "Existen campos invalidados, llene de manera correcta !!";	
		isCorrect= 0;
	}
}

function validationSubmit() {
	
	var isCorrectSubmit = 0;
	if ((document.getElementById('idni').value.length == 0)
			|| (document.getElementById('iubigeo').value.length == 0)
			|| (document.getElementById('iname').value.length == 0)
			|| (document.getElementById('ilastname').value.length == 0)
			|| (document.getElementById('iemail').value.length == 0)
			|| (document.getElementById('ipassword').value.length == 0)) {
		
		var messageAlert = document.getElementById('imessage');
		messageAlert.innerHTML = "Existen campos vacios, intento nuevamente !!!";
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
		messageAlert.innerHTML = "No se pudo enviar el formulario, revise los campos  !!";

		return false;
	}
}
