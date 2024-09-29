# Compte Rendu Activité Pratique N°2 : Développement d'un micro service

## 1ère étape : 
Création d'un projet Spring Boot avec les dépendances Web, Spring Data JPA, H2, Lombok en utilisant Spring Initializr.

## 2ème étape : 
Création de l'entité JPA "Compte".
![Capture1](assets/CompteClass.png)

## 3ème étape :
Création de l'interface `CompteRepository`.
![Capture2](assets/compteRep.png)

## 4ème étape - Test :
Accéder à la base de données via le lien configuré dans le fichier `.properties`.
![Capture3](assets/TestConsole.png)
![Capture3](assets/Test1.png)
![Capture3](assets/Testdb.png)

## 5ème étape :
Création du Web Service Rest qui permet de gérer des Comptes.
![Capture5](assets/screenshot1.png)

## 6ème étape - Test des API :
Tester le micro-service en utilisant un client REST comme Postman.
![Capture6](assets/testpostman.png)
![Capture6](assets/testpostman2.png)

## 7ème étape :
Documentation Swagger.
![Capture7](assets/swagger.png)

## 8ème étape :
Utilisation de Spring Data Rest en exploitant des projections.
![Capture8](assets/datarest.png)
![Capture8](assets/annotRest.png)
![Capture8](assets/resultdatarest.png)

## 9ème étape :
Création des DTO, Mappers et la couche service.
![Capture9](assets/test3.png)
![Capture9](assets/test4.png)

## 10ème étape :
Création d'un web service GraphQL.
![Capture10](assets/graphqltest.png)
![Capture10](assets/graphqltest2.png)
