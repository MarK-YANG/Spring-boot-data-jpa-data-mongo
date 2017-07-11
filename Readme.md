# Spring boot application with Data-jpa & Data-mongo

> This is a demo project based on spring boot framework, which uses data-jpa module to access data from sql database (like MySQL) and uses data-mongo module to retrieve data from mongodb.
  
### Attention
1. The sql database that used in this demo project is embedded h2 database of spring boot framework. The schema and data are contained in file named import.sql under resource folder.
2. The spring boot framework doesn't support embedded mongodb, so this demo project based on a local mongodb server. To run this project correctly, mare sure there is a database called Orange in your local mongodb server. What's more, don't forget to change the username and password in application.properties file. 