Proyecto de Relaciones con JPA y Spring Boot 🚀
Este proyecto es una aplicación de demostración construida con Spring Boot que explora y ejemplifica los diferentes tipos de relaciones entre entidades usando JPA (Java Persistence API) y Hibernate. El objetivo es servir como una guía práctica sobre cómo mapear correctamente las asociaciones en una base de datos relacional.

Tecnologías Utilizadas 🛠️
Java 17

Spring Boot 3

Spring Data JPA

Hibernate

MySQL

Lombok

Maven

Relaciones JPA Implementadas ⛓️
El proyecto demuestra las siguientes asignaciones de cardinalidad, tanto de forma unidireccional como bidireccional.

1. One-to-One (Uno a Uno)
Una entidad se relaciona con una única instancia de otra entidad.

Bidireccional: Employee <-> ParkingSpot. Un empleado tiene un puesto de estacionamiento y un puesto de estacionamiento pertenece a un solo empleado.

Unidireccional: Un ejemplo donde una entidad conoce a la otra, pero no al revés.

2. One-to-Many / Many-to-One (Uno a Muchos / Muchos a Uno)
Una entidad se relaciona con múltiples instancias de otra. Es la relación más común.

Bidireccional: School <-> Student. Una escuela tiene muchos estudiantes, y cada estudiante pertenece a una sola escuela.

Unidireccional: Department -> Employee. Un departamento tiene una lista de empleados, pero la entidad Employee no necesita tener una referencia directa a su departamento.

3. Many-to-Many (Muchos a Muchos)
Una entidad puede relacionarse con múltiples instancias de otra entidad, y viceversa.

Bidireccional: Student <-> Course. Un estudiante puede inscribirse en muchos cursos, y un curso puede tener muchos estudiantes inscritos.

Unidireccional: Student -> Course. Un estudiante tiene una lista de los cursos que toma, pero la entidad Course no mantiene una lista de sus estudiantes.

Conceptos Clave de Mapeo ✅
Durante el desarrollo de este proyecto se aplicaron los siguientes conceptos fundamentales de JPA/Hibernate:

Lado Dueño vs. Lado Inverso: En las relaciones bidireccionales, solo una entidad es la "dueña" de la relación y contiene la llave foránea.

El lado dueño usa @JoinColumn para definir la columna de unión.

El lado inverso usa el atributo mappedBy para delegar el control al lado dueño. Nunca se deben usar @JoinColumn y mappedBy en la misma propiedad.

Colecciones para Relaciones "To-Many": Las relaciones @OneToMany y @ManyToMany obligatoriamente deben ser declaradas sobre un tipo de colección Java (ej: Set<Entity> o List<Entity>).

Tablas de Unión (@JoinTable): Las relaciones @ManyToMany requieren una tabla intermedia en la base de datos para funcionar. Esta tabla se define con la anotación @JoinTable.

Cómo Ejecutar el Proyecto 🏁
Clonar el repositorio:

Bash

git clone https://[URL-DE-TU-REPOSITORIO]
Configurar la base de datos:
Asegúrate de que los detalles de tu base de datos MySQL (URL, usuario y contraseña) estén correctamente configurados en el archivo src/main/resources/application.properties.

Properties

spring.datasource.url=jdbc:mysql://localhost:3306/jpa_relations_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
Ejecutar la aplicación:
Puedes ejecutar la clase principal RelationsApplication.java desde tu IDE o usar Maven:

Bash

mvn spring-boot:run
Esquema de la Base de Datos 📈
A continuación se muestra el diagrama de Entidad-Relación generado por Hibernate a partir de las entidades JPA:
