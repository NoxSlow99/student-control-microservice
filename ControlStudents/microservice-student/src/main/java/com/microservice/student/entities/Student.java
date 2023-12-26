package com.microservice.student.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "apellidos")
    private String surnames;

    private int edad;

    @Column(name = "carrera_id")
    private Long carreraId;

    @Column(name = "div_carrera_id")
    private Long divCarreraId;

    @Column(name = "campus_id")
    private Long campuId;
}
