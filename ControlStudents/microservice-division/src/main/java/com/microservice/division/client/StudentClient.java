package com.microservice.division.client;


import com.microservice.division.controller.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-student", url = "localhost:8081/api/student")
public interface StudentClient {
    @GetMapping("/search-by-division/{idDiv}")
    List<StudentDTO> findStudentsByDivision(@PathVariable Long idDiv);
}
