package com.microservice.campus.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDTO {
    private String name;
    private String surnames;
    private int edad;
    private Long carreraId;
    private Long divCarreraId;
    private Long campuId;
}
