package com.microservice.division.Http.response;

import com.microservice.division.controller.dto.CarreraDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarrerasByDivisionResponse {
    private String name;
    private List<CarreraDTO> carreras;
}
