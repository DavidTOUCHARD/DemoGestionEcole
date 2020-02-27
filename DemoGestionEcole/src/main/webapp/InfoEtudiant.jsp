<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="eu.ensup.demogestionecole.domaine.Etudiant"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
  <%@include file="css/style.css" %>
</style>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Info Etudiant</title>
</head>
<body>
<%
Etudiant etu = (Etudiant) session.getAttribute("etudiant");
%>
<ul>
<li>Nom : <%=etu.getNom()%></li>
<li>Prenom : <%=etu.getPrenom()%></li>
<li>Email : <%=etu.getMail()%></li>
<li>Adresse : <%=etu.getAdresse()%></li>
<li>Date de naissance : <%=etu.getDatenaissance() %></li>
<li>Telephone : <%=etu.getTel() %></li>
</body>
</html>