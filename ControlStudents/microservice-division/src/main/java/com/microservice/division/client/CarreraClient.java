package com.microservice.division.client;

import com.microservice.division.controller.dto.CarreraDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-carrera", url = "localhost:8082/api/carrera")
public interface CarreraClient {

    @GetMapping("/search-division/{idDiv}")
    List<CarreraDTO> findAllCarrerasByDivision(@PathVariable Long idDiv);
}
