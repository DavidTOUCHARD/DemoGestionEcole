# DemoGestionEcole

Installer XAMPP, créer la base de données "gestionecole" et y importer le fichier gestionecole.sql

Installer TomcatServer 9.0 : http://objis.com/tutoriel-tomcat-n1-installation-tomcat-8/

Configurer le fichier persistence.xml situé dans DemoGestionEcole/DemoGestionEcole/src/main/resources/META-INF/ : URL de la base, login du SGBD , mot de passe du SGDB.

Generation du fichier WAR :

A la racine du projet DemoGestionEcole executer la commande suivante dans l'invite de commande :

$ mvn package

Une fois que l'invite de commande affiche "BUILD SUCCESS", vous pouvez aller dans le dossier "target" et récuperer le fichier WAR.

Déploiement de l'application sur le serveur Tomcat :

1-Deplacer le fichier DemoGestionEcole.war dans le dossier webapps de Tomcat (Le fichier .war peut etre renomé)

2-Executer startup.bat situé dans le dossier bin de tomcat

3-Dans l'url du navigateur internet, entrer la commande suivante : http://localhost:8080/DemoGestionEcole (DemoGestionEcole étant le nom du fichier WAR déplacé dans le dossier webapps)

Technologies :

Servlet
HTML
JSP
JPA


Vous pouvez vous connecter avec le compte admin :
id : admin
password : admin
