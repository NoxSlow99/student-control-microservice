package com.microservice.carrera.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "carreras")
public class Carrera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "div_carrera_id")
    private Long divCarreraId;

    //@Column(name = "campus_id")
    //private Long campusId;

    @Column(name = "chet_id")
    private Long chetId;
    @Column(name = "can_id")
    private Long canId;
    @Column(name = "pdc_id")
    private Long pdcId;
    @Column(name = "coz_id")
    private Long cozId;
    @Column(name = "fcp_id")
    private Long fcpId;
}
