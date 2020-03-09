# DemoGestionEcole

Installer XAMPP et créer la base demojpa.

Installer TomcatServer 9.0 : http://objis.com/tutoriel-tomcat-n1-installation-tomcat-8/

Avant de générer le fichier .war vous pouvez configurer le fichier persistence.xml a votre convenance. (identifiant de la base de données, mot de passe...)

Generation du fichier WAR :

A la racine du projet, où se trouve le dossier target executer la commande suivante :

$ mvn package

Une fois que l'invite de commande affiche "BUILD SUCCESS", vous pouvez aller dans le dossier "target" et récuperer le fichier WAR.

Déploiement de l'application sur le serveur Tomcat :

1-Deplacer le fichier DemoGestionEcole.war dans le dossier webapp de Tomcat (Le fichier .war peut etre renomé)

2-Executer startup.bat situé dans le dossier bin de tomcat

3-Dans l'url du navigateur internet, entrer la commande suivante : http://localhost:8080/DemoGestionEcole (DemoGestionEcole étant le nom du fichier WAR déplacé dans le dossier webapp)

Fonctionnalités :

Insertion en base de données d'une formation
Technologies :

Servlet
HTML
JSP
JPA


Vous pouvez vous connecter avec le compte admin :
id : admin
password : admin
