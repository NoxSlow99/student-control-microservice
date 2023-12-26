package com.microservice.carrera.client;

import com.microservice.carrera.controller.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-student", url = "localhost:8081/api/student")
public interface StudentClient {

    @GetMapping("/search-by-carrera/{idCarrera}")
    List<StudentDTO> findAllStudentsByCarrera(@PathVariable Long idCarrera);
}
