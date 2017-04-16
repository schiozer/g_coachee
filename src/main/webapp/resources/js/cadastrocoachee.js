/*
Script Específico para o cadastro de coachee
*/

/*
	Realiza as verificações do formulário ao clicar em submit
*/
function submitButtonOnClick() {
	
	var inputName = document.getElementById('inputName').value;
	var inputAddress = document.getElementById('inputAddress').value;
	var inputEmail = document.getElementById('inputEmail').value;
	var inputBirthDate = document.getElementById('inputBirthDate').value;
	var inputTelephone = document.getElementById('inputTelephone').value;
	var inputRG = document.getElementById('inputRG').value;
	var inputCPF = document.getElementById('inputCPF').value;
	var textComments = document.getElementById('textComments').value;

	var errorMessage = [];

	if (!ValidateName(inputName)) {

		errorMessage.push("Nome");
		document.getElementById('divName').className = "form-group has-error has-feedback";
		/*document.getElementById('iconName').style.display = "block";
		document.getElementById('helperName').style.display = "block";*/

	} else {
		document.getElementById('divName').className = "form-group";
		/*document.getElementById('iconName').style.display = "none";
		document.getElementById('helperName').style.display = "none";	*/	
	}

	if (!ValidateAddress(inputAddress)) {

		errorMessage.push("Endereço");
		document.getElementById('divAddress').className = "form-group has-error has-feedback";
		/*document.getElementById('iconAddress').style.display = "block";
		document.getElementById('helperAddress').style.display = "block";*/
	} else {
		document.getElementById('divAddress').className = "form-group";
		/*document.getElementById('iconAddress').style.display = "none";
		document.getElementById('helperAddress').style.display = "none";*/
	} 
	
	if (!ValidateEmail(inputEmail)) {

		errorMessage.push("e-mail");
		document.getElementById('divEmail').className = "form-group has-error has-feedback";
		document.getElementById('iconEmail').style.display = "block";
		document.getElementById('helperEmail').style.display = "block";
	} else {
		document.getElementById('divEmail').className = "form-group";
		document.getElementById('iconEmail').style.display = "none";
		document.getElementById('helperEmail').style.display = "none";
	} 

	if (!ValidateName(inputBirthDate)) {

		errorMessage.push("Data de Nascimento");
		document.getElementById('divBirthDate').className = "form-group has-error has-feedback";
		document.getElementById('iconBirthDate').style.display = "block";
		document.getElementById('helperBirthDate').style.display = "block";

	} else {
		document.getElementById('divBirthDate').className = "form-group";
		document.getElementById('iconBirthDate').style.display = "none";
		document.getElementById('helperBirthDate').style.display = "none";
	} 

	if (!ValidateMobileNumber(inputTelephone)) {

		errorMessage.push("Telefone celular");
		document.getElementById('divTelephone').className = "form-group has-error has-feedback";
		document.getElementById('iconTelephone').style.display = "block";
		document.getElementById('helperTelephone').style.display = "block";
	} else {
		document.getElementById('divTelephone').className = "form-group";
		document.getElementById('iconTelephone').style.display = "none";
		document.getElementById('helperTelephone').style.display = "none";
	} 

	if (!ValidateName(inputRG)) {

		errorMessage.push("RG");
		document.getElementById('divRG').className = "form-group has-error has-feedback";
		document.getElementById('iconRG').style.display = "block";
		document.getElementById('helperRG').style.display = "block";

	} else {
		document.getElementById('divRG').className = "form-group";
		document.getElementById('iconRG').style.display = "none";
		document.getElementById('helperRG').style.display = "none";
	} 

	if (!ValidateCPF(inputCPF)) {

		errorMessage.push("CPF");
		document.getElementById('divCPF').className = "form-group has-error has-feedback";
		document.getElementById('iconCPF').style.display = "block";
		document.getElementById('helperCPF').style.display = "block";
	} else {
		document.getElementById('divCPF').className = "form-group";
		document.getElementById('iconCPF').style.display = "none";
		document.getElementById('helperCPF').style.display = "none";
	} 

	if (!ValidateName(textComments)) {

		errorMessage.push("Comentários");
		document.getElementById('divComments').className = "form-group has-error has-feedback";
		document.getElementById('iconComments').style.display = "block";
		document.getElementById('helperComments').style.display = "block";
	} else {
		document.getElementById('divComments').className = "form-group";
		document.getElementById('iconComments').style.display = "none";
		document.getElementById('helperComments').style.display = "none";
	} 

	if (errorMessage.length) {

		var alertaCampos = document.getElementById('alertaCampos');

		alertaCampos.innerHTML = "<strong>Erro ao salvar Coachee!</strong> Favor informar corretamente os campos: " + errorMessage.join(" - ");
		alertaCampos.style.display = "block";

		return false;

	} else {

		return true;
	}
}

