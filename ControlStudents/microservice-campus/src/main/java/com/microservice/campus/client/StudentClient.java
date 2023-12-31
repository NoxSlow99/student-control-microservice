package com.microservice.campus.client;

import com.microservice.campus.controller.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/*
 * Esta clase consume el API de Student
 */
@FeignClient(name = "msvc-student", url = "localhost:8081/api/student")
public interface StudentClient {
    @GetMapping("/search-by-campus/{idCampus}")
    List<StudentDTO> findAllStudentsByCampus (@PathVariable Long idCampus);
}
