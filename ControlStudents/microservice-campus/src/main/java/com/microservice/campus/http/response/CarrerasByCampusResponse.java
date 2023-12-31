package com.microservice.campus.http.response;

import com.microservice.campus.controller.dto.CarrerasDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarrerasByCampusResponse {
    private String name;
    private List<CarrerasDTO> carrerasDTOList;
}
