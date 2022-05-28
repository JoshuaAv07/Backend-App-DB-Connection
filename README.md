<h1>I.3. Backend application development, with access to database</h1>

<h2>Universidad tecnológica de Chihuahua BIS</h2>

<h5><i>Joshua Alexis Avilés - TIDBIS51M - IoT Applications - 27/05/2022</i></h5>

<p>The present repository owns contains a backend application developed in Java, using PostgreSQL as database manager and also usning Maven and Spring Boot.</p>

<h4>Setup</h4>

<p>It is important to go to the Spring Initializr site (link below)</p>

<a href="https://start.spring.io/">Spring Initializr</a>

<p>And the selected specifications were to work with Maven, using Java 11 and using Spring Web, PostgreSQL Driver and Spring Data JPA as deppendencies.</p>

<img src="https://github.com/JoshuaAv07/Backend-App-DB-Connection/blob/master/images/0.PNG?raw=true"/>
<img src="https://github.com/JoshuaAv07/Backend-App-DB-Connection/blob/master/images/1.1.PNG?raw=true"/>
<img src="https://github.com/JoshuaAv07/Backend-App-DB-Connection/blob/master/images/1.2.PNG?raw=true"/>
<img src="https://github.com/JoshuaAv07/Backend-App-DB-Connection/blob/master/images/1.9.PNG?raw=true"/>

<p>As it was explained it works by using maven, so it is important to download it from Maven's oficial site</p>

<a href="https://maven.apache.org/">Maven Site</a>

<h4>Description</h4>

<p>This application has four elementary elements that work together to effectively create elements(tables) within a database.</p>
<p><b>Entitites: </b>create the columns that the table is going to have and how are those columns are going to receive data(if they are going to be string, integer, etc.). They follow a getters and setters structure.</p>
<p><b>Repositories: </b>created as interfaces to extend the entities.</p>
<p><b>Rest Controllers: </b>obtain the lists and return them for the usage of the entities.</p>
<p><b>Services: </b>connect to the repositories and obtain the lists from entities to get the data that is going to be transfered through the rest controller.</p>

<h4>Database Connection</h4>

<p>The database test was created by using the next commands.</p>

```bash
create database test;
create user admin with password 'admin';
alter database test owner to admin;
```

<p>Database connection within the application: 
<a href="https://github.com/JoshuaAv07/Backend-App-DB-Connection/blob/master/src/main/resources/application.properties">application.properties</a></p>

<p>It is important to initialize the database.</p>
<img src="https://github.com/JoshuaAv07/Backend-App-DB-Connection/blob/master/images/1.PNG?raw=true"/>

<p>Enter to the database that is going to be used</p>
<img src="https://github.com/JoshuaAv07/Backend-App-DB-Connection/blob/master/images/2.PNG?raw=true"/>

<p>Within IntelliJ Terminal, run the command: </p>

```bash
mvn spring-boot:run
```

<p>After having initialized maven, enter to the database, it will be possible to see the entities that were created.</p>
<img src="https://github.com/JoshuaAv07/Backend-App-DB-Connection/blob/master/images/3.PNG?raw=true"/>

<p>Then it will be possible to start to make queries within the database.</p>
<img src="https://github.com/JoshuaAv07/Backend-App-DB-Connection/blob/master/images/4.PNG?raw=true"/>

<p>Make an insert into costumer_entity:</p>
<img src="https://github.com/JoshuaAv07/Backend-App-DB-Connection/blob/master/images/5.PNG?raw=true"/>

<p>Updating costumer_entity:</p>
<img src="https://github.com/JoshuaAv07/Backend-App-DB-Connection/blob/master/images/6.PNG?raw=true"/>

<p>Inserting into supplier_entity:</p>
<img src="https://github.com/JoshuaAv07/Backend-App-DB-Connection/blob/master/images/7.PNG?raw=true"/>

<p>Inserting into product_entity:</p>
<img src="https://github.com/JoshuaAv07/Backend-App-DB-Connection/blob/master/images/9.PNG?raw=true"/>
