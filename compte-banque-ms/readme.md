# Compte Rendu Activité Pratique N°2 : Développement d'un micro service

## 1ère étape : 
Création d'un projet Spring Boot avec les dépendances Web, Spring Data JPA, H2, Lombok en utilisant Spring Initializr.

## 2ème étape : 
Création de l'entité JPA "Compte".
![Capture1](assets/CompteClass.png)

## 3ème étape :
Création de l'interface `CompteRepository`.
![Capture2](assets/CompteRep.png)

## 4ème étape - Test :
Accéder à la base de données via le lien configuré dans le fichier `.properties`.
![Capture3](assets/TestConsole.png)
![Capture4](assets/Test2.png)
![Capture5](assets/testdb.png)

## 5ème étape :
Création du Web Service Rest qui permet de gérer des Comptes.
![Capture6](assets/controller.png)

## 6ème étape - Test des API :
Tester le micro-service en utilisant un client REST comme Postman.
![Capture7](assets/testpostman.png)
![Capture8](assets/testpostman2.png)

## 7ème étape :
Documentation Swagger.
![Capture9](assets/swagger.png)

## 8ème étape :
Utilisation de Spring Data Rest en exploitant des projections.
![Capture10](assets/datarest.png)
![Capture11](assets/annotRest.png)
![Capture12](assets/resultdatarest.png)

## 9ème étape :
Création des DTO, Mappers et la couche service.
![Capture13](assets/test3.png)
![Capture14](assets/test4.png)

## 10ème étape :
Création d'un web service GraphQL.
![Capture15](assets/graphqltest.png)
![Capture16](assets/graphqltest2.png)
