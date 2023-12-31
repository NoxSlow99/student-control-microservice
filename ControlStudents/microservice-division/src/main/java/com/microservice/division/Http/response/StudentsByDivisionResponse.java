package com.microservice.division.Http.response;

import com.microservice.division.controller.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentsByDivisionResponse {
    private String name;
    private List<StudentDTO> students;
}
