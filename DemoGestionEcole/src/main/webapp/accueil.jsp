<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="eu.ensup.demogestionecole.domaine.Responsable"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="#" onclick="document.location.href='creationEtudiant.jsp';">Ajouter un étudiant</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="#" onclick="document.location.href='SupprimerEtudiant.jsp';">SupprimerEtudiant</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="#" onclick="document.location.href='LectureEtudiant.jsp';">LectureEtudiant</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="liste-etudiants" >Liste etudiant</a>
      </li>
    </ul>
  </div>
</nav>		
		<table class="table table-striped table-dark">
		  	<thead>
			    <tr>
					<!-- <th scope="col">#</th> -->
					<th scope="col">Nom</th>
					<th scope="col">Prenom</th>
					<th scope="col">Mail</th>
					<th scope="col">Téléphone</th>
					<th scope="col">Date de naissance</th>
			    </tr>
			</thead>
			<tbody>
				<c:forEach items="${listeEtudiants}" var="etudiant">
					<tr>
						<!-- <th scope="row"><%-- out.println(i); --%></th>  -->
						<td>${etudiant.nom}</td>
						<td>${etudiant.prenom}</td>
						<td>${etudiant.mail}</td>
						<td>${etudiant.telephone}</td>
						<td>${etudiant.dateNaissance}</td>
					</tr>
				</c:forEach>
		    </tbody>
		</table>
	</div>
</body>
</html>