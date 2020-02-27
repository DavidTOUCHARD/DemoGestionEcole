<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="eu.ensup.demogestionecole.domaine.Responsable"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><style type="text/css">
  <%@include file="css/style.css" %>
</style>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion de l'école ENSUP</title>
</head>
<body>
<%
Responsable resp = (Responsable) session.getAttribute("responsable");
%>
<h1>Information responsable </h1>
<ul>
<li>Login : <%=resp.getNom()%></li>
<li>Password : <%=resp.getPassword()%> </li>
</ul>
<h1> GESTION DE L'ECOLE ENSUP </h1>
<h1> </h1>
<h1> </h1>
<input name="btn-creation" type="button" value="Créer un étudiant" onclick="document.location.href='creationEtudiant.jsp';">
<h1> </h1>
<input type="button" value="Associer un étudiant à un cours">
<h1> </h1>
<input type="button" value="Lire les informations d'un étudiant" onclick="document.location.href='LectureEtudiant.jsp';">
<h1> </h1>
<input type="button" value="Modifier les informations d'un étudiant">
<h1> </h1>
<input type="button" value="Supprimer un étudiant" onclick="document.location.href='SupprimerEtudiant.jsp';">
<h1> </h1>
<input type="button" value="Lister l'ensemble des étudiants de l'école">
<h1> </h1>
</body>
</html>