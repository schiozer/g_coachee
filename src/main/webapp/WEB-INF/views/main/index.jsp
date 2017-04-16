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
			
				<!-- Main jumbotron for a primary marketing message or call to action -->
				<div class="jumbotron">
					<h2>G-COACHEE - Gerenciamento de Coachees</h2>
					<p>Sistema para Gerenciar os seus Coachees com facilidade. Cadastre seus Coachees, controle as agendas das sessões bem como as sessões propriamente ditas</p>
				</div>

				<div id="main-carousel" class="carousel slide" data-interval="3000" data-ride="carousel">
					<ol class="carousel-indicators">
						<li data-target="#main-carousel" data-slide-to="0" class="active"></li>
						<li data-target="#main-carousel" data-slide-to="1" class=""></li>
					</ol>
					<div class="carousel-inner" role="listbox">

						<div class="item active">
							<img data-src="${pageContext.request.contextPath}/resources/images/coaching.jpg" class="img-responsive center-block" alt="First slide [1140x500]" src="${pageContext.request.contextPath}/resources/images/coaching.jpg" data-holder-rendered="true">
							<div class="carousel-caption" color="black">
								<h3>Coaching</h3>
							</div>
						</div>
					
						<div class="item">
							<a href="http://www.ibccoaching.com.br">
								<img data-src="${pageContext.request.contextPath}/resources/images/logo-ibc.png" class="img-responsive center-block" alt="Second slide [1140x500]" src="${pageContext.request.contextPath}/resources/images/logo-ibc.png" data-holder-rendered="true">
								<div class="carousel-caption">
									<h3>Quer saber mais ?</h3>
									<p>Consulte o site do IBC</p>
								</div>
							</a>
						</div>
					</div>
					<a class="left carousel-control" href="#main-carousel" role="button" data-slide="prev">
					  <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					  <span class="sr-only">Previous</span>
					</a>
					<a class="right carousel-control" href="#main-carousel" role="button" data-slide="next">
					  <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					  <span class="sr-only">Next</span>
					</a>
				</div>
			</div>

	</jsp:body>	
</customTags:page>