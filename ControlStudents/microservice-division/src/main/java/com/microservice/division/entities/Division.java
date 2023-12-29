package com.microservice.division.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "divisiones")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", unique = true)
    private String name;

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
