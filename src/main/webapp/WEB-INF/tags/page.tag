<%@attribute name="title" required="true" %>
<%@attribute name="bodyClass" required="true" %>
<%@attribute name="extraScripts" fragment="true" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!doctype html>
<!--[if lt IE 7]>
<html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="pt">
<![endif]-->
<!--[if IE 7]>
<html class="no-js lt-ie9 lt-ie8" lang="pt">
<![endif]-->
<!--[if IE 8]><html class="no-js lt-ie9" lang="pt"><![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js" lang="pt">
<!--<![endif]-->
    <head>
    
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    
		<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
		<meta name="Gerenciamento de Coachees" content="">
		<meta name="Fabio Schiozer" content="">
		<link rel="icon" href="http://getbootstrap.com/favicon.ico">

		<title>${title}</title>

		<!-- Bootstrap core CSS -->
		<link href="${pageContext.request.contextPath}/resources/bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
		<!-- Bootstrap theme -->
		<link href="${pageContext.request.contextPath}/resources/bootstrap-3.3.6-dist/css/bootstrap-theme.min.css" rel="stylesheet">
		<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
		<link href="${pageContext.request.contextPath}/resources/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
		
		<!-- Custom styles for this project -->
		<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">

		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
    </head>

    <body class="${bodyClass}" role="document">
    
    	<div class="container" role="main">
    
	        <%@include file="/WEB-INF/views/main/header.jsp" %>
	    
	        <jsp:doBody/>
	        
	        <%@include file="/WEB-INF/views/main/footer.jsp" %>
		
		</div>
		        
        <jsp:invoke fragment="extraScripts"/>
        
	 	<!-- Bootstrap core JavaScript
		================================================== -->
		<!-- Placed at the end of the document so the pages load faster -->
		<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
		<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
		<script src="${pageContext.request.contextPath}/resources/bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/js/docs.min.js"></script>
		<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
		<script src="${pageContext.request.contextPath}/resources/js/ie10-viewport-bug-workaround.js"></script>
	
    </body>
</html>
