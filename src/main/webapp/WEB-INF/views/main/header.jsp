<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

	<header class="row">
		<!-- Fixed navbar -->
		<nav class="navbar navbar-inverse navbar-fixed-top">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar" aria-expanded="true">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="javascript:;">G-COACHEE</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse" aria-expanded="true">
					<ul class="nav navbar-nav">
						<li class="active"><a href="index.html">Home</a></li>
						<li><a href="${pageContext.request.contextPath}/coachee/register">Cadastrar Coachee</a></li>
						<li><a href="pesquisarcoachee.html">Pesquisar Coachee</a></li>
						<li><a href="agenda.html">Agenda</a></li>
						<li><a href="preferencias.html">Preferências</a></li>
						<li><a href="contato.html">Contato</a></li>
						<li><a href="sobre.html">Sobre</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
					</ul>
				</div><!--/.nav-collapse -->
			</div>
		</nav>
	</header>
