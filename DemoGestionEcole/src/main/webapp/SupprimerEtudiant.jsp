<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
  <%@include file="css/style.css" %>
</style>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Suppression etudiant</title>
</head>
<body>
<form action ="SupprimerEtudiantServlet" method="post">
<label for="site-search">Supprimer un �tudiant:</label>
<input type="number"  id="idetudiant" name="idetudiant"
       aria-label="Rechercher un �tudiant" placeholder="idetudiant">
<input type="search" id="nom" name="nom"
       aria-label="Rechercher un �tudiant" placeholder="nom">
<input type="search" id="prenom" name="prenom" placeholder="prenom"
aria-label="Rechercher un �tudiant">
       <input type="submit" value="SUPPRIMER" name="button1" onclick="callServlet();">
</form>
</ul>
</body>
</html>