<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><style type="text/css">
  <%@include file="css/style.css" %>
</style>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <form method="post" action="CreationEtudiantServlet">
            <fieldset>
                <legend>Ajout Etudiant</legend>
                <p>Vous pouvez vous inscrire via ce formulaire.</p>

                <label for="email">Adresse email <span class="requis">*</span></label>
                <input type="text" id="email" name="email" value="" size="20" maxlength="60" />
                <br />

 				<label for="telephone">telephone <span class="requis">*</span></label>
                <input type="text" id="telephone" name="telephone" value="" size="20" maxlength="60" />
                <br />
                 <label for="datenaissance">datenaissance <span class="requis">*</span></label>
                <input type="text" id="datenaissance" name="datenaissance" value="" size="20" maxlength="60" />
                <br />

 				<label for="adresse">adresse <span class="requis">*</span></label>
                <input type="text" id="adresse" name="adresse" value="" size="20" maxlength="60" />
                <br />
                <label for="nom">Nom de l'étudiant</label>
                <input type="text" id="nom" name="nom" value="" size="20" maxlength="20" />
                <br />
                <label for="prenom">prenom de l'étudiant</label>
                <input type="text" id="prenom" name="prenom" value="" size="20" maxlength="20" />
                <br />

                <input type="submit" value="Ajout" name="button1" class="sansLabel" />
                <br />
            </fieldset>
        </form>
    </body>
</html>