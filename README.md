<em> <h1 align="center"> Microservicio de Gestión Académica </h1> </em>

<p align="center">

<img alt="GitHub last commit (by committer)" src="https://img.shields.io/github/last-commit/NoxSlow99/student-control-microservice?style=plastic&color=0757BD&labelColor=098507">

<img alt="GitHub repo size" src="https://img.shields.io/github/repo-size/NoxSlow99/student-control-microservice?style=plastic&label=Tama%C3%B1o&color=0757BD&labelColor=098507">

<img alt="GitHub contributors" src="https://img.shields.io/github/contributors/NoxSlow99/student-control-microservice?style=plastic&color=0757BD&labelColor=098507">

<img alt="GitHub Repo stars" src="https://img.shields.io/github/stars/NoxSlow99/student-control-microservice?style=social">

<img alt="GitHub watchers" src="https://img.shields.io/github/watchers/NoxSlow99/student-control-microservice?style=social">

<img alt="Maven Central" src="https://img.shields.io/maven-central/v/org.springframework.boot/spring-boot-starter-parent?style=social&logo=Spring%20Boot&label=Spring%20Boot">

<img alt="Maven Central" src="https://img.shields.io/maven-central/v/org.flywaydb/flyway-mysql?style=social&logo=Flyway&label=Flyway">

<img alt="Maven Central" src="https://img.shields.io/maven-central/v/com.mysql/mysql-connector-j?style=social&logo=MySQL&label=MySQL">

</p>

<h2 name="indice"> Índice </h2>

- [Índice](#indice)

- [Descripción](#descripcion)

- [Carateristicas](#Carateristicas)

- [Paths](#paths)

- [Tecnologías usadas](#tecnologias-usadas)

- [Autores](#autores)

<h2 name="descripcion"> Descripción </h2>
<p> Este proyecto es un microservicio construido con Spring Boot que proporciona una serie de APIs para gestionar diferentes aspectos de un sistema académico. 
    Las APIs incluyen "student", "carrera", "campus" y "division". Cada una de estas APIs ofrece métodos para crear, listar, buscar por ID y realizar búsquedas avanzadas 
    que requieren el consumo de otra API. <br><br>
    El proyecto utiliza la biblioteca OpenFeign para manejar las llamadas a otras APIs, lo que facilita la comunicación entre servicios. Además, se utiliza MySQL como 
    sistema de gestión de bases de datos, lo que garantiza un almacenamiento de datos eficiente y seguro. Para la creación de tablas y la inserción de datos de prueba, 
    se utiliza la biblioteca Flyway. <br><br>
    Además de estas APIs, el proyecto también incluye una API de Gateway, que actúa como un punto de entrada único para todas las solicitudes, una API de Config, 
    que aloja las configuraciones de las demás APIs, y una API de Eureka, que proporciona capacidades de descubrimiento de servicios. <br><br>
    Este proyecto ha sido probado exhaustivamente utilizando la aplicación Insomnia, asegurando así su correcto funcionamiento y fiabilidad. </p>

<h2 name="Carateristicas"> :hammer:Carateristicas </h2>

- `APIs de Gestión`: Las APIs de "student", "carrera", "campus" y "division" permiten una gestión eficiente de los datos académicos.
- `OpenFeign`: Esta biblioteca facilita el consumo de otras APIs, permitiendo búsquedas avanzadas y una mayor flexibilidad.
- `MySQL`: Se utiliza MySQL como sistema de gestión de bases de datos, garantizando un almacenamiento de datos eficiente y seguro.
- `Flyway`: Esta biblioteca se utiliza para la creación de tablas y la inserción de datos de prueba, lo que facilita la configuración inicial de la base de datos.
- `API de Gateway`: Proporciona un punto de entrada único para todas las solicitudes, simplificando la interacción con el microservicio.
- `API de Config`: Aloja las configuraciones de todas las demás APIs, permitiendo una gestión centralizada de la configuración.
- `API de Eureka`: Ofrece capacidades de descubrimiento de servicios, facilitando la comunicación entre diferentes partes del sistema.
- `Insomnia`: Se utilizó la aplicación Insomnia para probar a fondo el proyecto, asegurando su correcto funcionamiento y fiabilidad.

<h2 name="paths"> Paths </h2>
    Para iniciar la aplicación, es necesario pasar primero por la API de Gateway. Esto es esencial ya que, sin este paso, no se podrán realizar consultas. 
    En un entorno local, la ruta de inicio sería localhost:808. Por lo tanto, asegúrate de acceder a esta dirección al iniciar la aplicación para garantizar su correcto 
    funcionamiento. <br><br>

- /api/student
  -	/create
  -	/all
  -	/search/{id}
- /api/carrera
  -	/create
  -	/all
  -	/search/{id}
  -	/search-students/{idCarrera}
- /api/campus
  -	/create
  -	/all
  -	/search/{id}
  -	/search-student/{idCampus}
  -	/search-carreras/{idCampus
  -	/search-division/{idCampus}
- /api/division
  -	/create
  -	/all
  -	/search/{id}
  -	/search-carreras/{idDivision}
  -	/search-students/{idDivision}

<h2 name="tecnologias-usadas"> :ballot_box_with_check: Tecnologías usadas </h2>

- Java 21
- Spring Boot 3
- MySQL
- Flyway
- OpenFeign

<h4> Autores </h4>

<a href="https://github.com/NoxSlow99" target="_blank" name="autores"> Angel Colli </a>
