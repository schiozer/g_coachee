<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="customTags"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>

<customTags:page bodyClass="cart" title="${title}">

	<jsp:attribute name="extraScripts">
	</jsp:attribute>
	<jsp:body>
	
			<div class="row">

				<div class="container theme-showcase" role="main">
					<div class="page-header">
						<h2>Cadastrar Coachee</h2>
					</div>
				</div>
		
				<form id="coacheeDataForm" role="form">

				    <div id="alertaCampos" class="alert alert-danger myAlerts" role="alert">
				        <strong>Erro ao enviar dados!</strong> Alguns campos estão com problema. Favor informar corretamente.
				    </div>
					
					<!-- it must include classes has-error has-feedback when an error happens -->
					<div id="divName" class="form-group">
						<label for="inputName">Nome:</label>

						<input id="inputName" type="text" class="form-control" placeholder="Digite seu nome do coachee (campo obrigatório)" autofocus required/>
						<span class="glyphicon glyphicon-remove form-control-feedback"></span>
					</div>

					<div id="divAddress" class="form-group">
						<label for="inputAddress">Endereço:</label>
						<input id="inputAddress" type="text" class="form-control" placeholder="Digite o endereço do coachee (campo opcional)"/>
						<span class="glyphicon glyphicon-remove form-control-feedback"></span>
					</div>

					<div class="row">

						<div class="col-md-4">
							<div id="divEmail" class="form-group" >
								<label for="inputEmail">Email:</label>
								<input id="inputEmail" type="email" class="form-control" placeholder="Digite o e-mail do coachee (campo obrigatório)" required />
								<span id="iconEmail" class="glyphicon glyphicon-remove form-control-feedback myAlerts"></span>
								<div id="helperEmail" class="help-block with-errors myAlerts">Digite um e-mail no formato abcd@efg</div>
							</div>
						</div>

						<div class="col-md-4">
							<div id="divGender" class="form-group">
								<label for="optGender">Sexo:</label><br>
								<label class="radio-inline">
								  <input type="radio" name="optGender" checked>Masculino</input>
								</label>
								<label class="radio-inline">
								  <input type="radio" name="optGender">Feminino</input>
								</label>
							</div>
						</div>

						<div class="col-md-4">
							<div id="divBirthDate" class="form-group">
								<label for="inputBirthDate">Data de Nascimento:</label>
								<input id="inputBirthDate" type="date" class="form-control date-field"/>
								<span class="glyphicon glyphicon-remove form-control-feedback"></span>
								<span id="iconBirthDate" class="glyphicon glyphicon-remove form-control-feedback myAlerts"></span>
								<div id="helperBirthDate" class="help-block with-errors myAlerts">Digite uma data válida</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div id="divTelephone" class="form-group col-md-4">
							<label for="inputTelephone" class="control-label">Telefone Celular:</label>
							<input id="inputTelephone" type="number" class="form-control telephone-field" placeholder="Digite o celular (campo obrigatório)" required>
								<span class="glyphicon glyphicon-remove form-control-feedback"></span>
							</input>
						</div>

						<div id="divRG" class="form-group col-md-4">
							<label for="inputRG" class="control-label">RG:</label>
							<input id="inputRG" type="text" class="form-control rg-field"/>
							<span class="glyphicon glyphicon-remove form-control-feedback"></span>
						</div>
						
						<div id="divCPF" class="form-group col-md-4">
							<label for="inputCPF" class="control-label">CPF:</label>
							<input id="inputCPF" type="text" class="form-control cpf-field"/>
							<span class="glyphicon glyphicon-remove form-control-feedback"></span>
						</div>
					</div>
					
					<div id="divComments" class="form-group">
						<label for="textComments">Comentários</label>
						<textarea id="textComments" class="form-control" rows="10" placeholder="Digite comentários sobre o coachee (campo opcional)"></textarea>
						<span class="glyphicon glyphicon-remove form-control-feedback"></span>
					</div>

					<button id="okbutton" type="submit" class="btn btn-primary" onclick="return submitButtonOnClick()">Salvar Coachee</button>
					<!--
					<button id="cancelbutton" type="button" class="btn btn-default" onclick="cancelbuttonOnClick2()">Cancelar</button>
					-->
					
				</form>
				
			</div>
			
	</jsp:body>	
</customTags:page>