package com.microservice.campus.client;

import com.microservice.campus.controller.dto.CarrerasDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-carrera", url = "localhost:8082/api/carrera")
public interface CarreraClient {
    @GetMapping("/search-by-campus/{idCampus}")
    List<CarrerasDTO> findAllCarrerasByIdCampus(@PathVariable Long idCampus);
}
