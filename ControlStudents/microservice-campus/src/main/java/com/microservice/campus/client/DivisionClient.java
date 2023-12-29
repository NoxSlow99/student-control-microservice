package com.microservice.campus.client;

import com.microservice.campus.controller.dto.DivisionDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-division", url = "localhost:8084/api/division")
public interface DivisionClient {
    @GetMapping("/search-name/{idCampus}")
    List<DivisionDTO> findAllDivisionByIdCampus(@PathVariable Long idCampus);
}
