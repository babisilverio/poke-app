<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="pokeApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/angular-material/1.1.1/angular-material.css">

<title>PokeApp</title>
</head>
<body ng-controller="pokeCtrl">
	<h2>PokeApp</h2> 
	-
	<h4>Seja bem-vindo treinador</h4>
	
	<h4>Login</h4>
	<form action="loginTreinador" method="post">
		<p>Nome: <input type="text" name="nome" /></p>
		<p>Senha: <input type="password" name="senha" /> </p>
		<input type="submit" value="Login">
	</form>
	
		
	<!-- scripts -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular-resource.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular-route.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/angular_material/1.1.4/angular-material.min.js"></script>
	<script type="assets/script.js"></script>
</body>
</html>