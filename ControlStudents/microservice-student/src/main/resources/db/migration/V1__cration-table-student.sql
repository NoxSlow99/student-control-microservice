USE student_db;

CREATE TABLE students (
    id bigint not null auto_increment,
    nombre varchar(100) not null,
    apellidos varchar(100) not null,
    edad int not null,
    carrera_id bigint not null,
    div_carrera_id bigint not null,
    campus_id bigint not null,

    primary key (id)
);