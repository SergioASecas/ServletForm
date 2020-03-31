/***
 *
 * @param Formulario
 * @returns
 */
function validarForma(Formulario){
	var usuario = Formulario.usuario;
	if (usuario.value == "" ||usuario.value=="Escribir usuario") {
		alert("Debe proporcionar un nombre de usuario");
		usuario.focus();
		usuario.select();
		return false;
	}

	var Password = Formulario.password;
	if (Password.value == "" || Password.value.length < 3)  {
		alert("Debe proporcionar un password de al menos 3 caracteres")
		Password.focus();
		Password.select();
		return false;
	}


	var tecnologiasDeInt = Formulario.tecnologia;
	var checkSeleccionado = false;

	for (var i = 0; i < tecnologiasDeInt.length; i++) {
		if (tecnologiasDeInt[i].checked) {
			checkSeleccionado = true;
		}
	}

	if (!checkSeleccionado) {
		alert("Debe Seleccionar una tecnología ");
		return false;
	}

	var Genero = Formulario.genero;
	var radioSeleccionado = false;
	
	for (var i = 0; i < Genero.length; i++) {
		if (Genero[i].checked) {
			radioSeleccionado = true;
		}
	}
	
	if (!radioSeleccionado) {
		alert("Debes proporcionar un genero");
		return false;
	}

	var ocupacion = Formulario.ocupacion;
	if (ocupacion.value=="") {
		alert("Debes proporcionar una ocupación");
		return false;
	}

	var musica = Formulario.Musica;
	if (musica.value!="1" || musica.value!="2" || musica.value!="3" || musica.value!="4") {
		alert("Debes proporcionar musica")
		return false;
	}

	
	alert("Formulario válido, enviando datos al servidor");
	return true;

}
