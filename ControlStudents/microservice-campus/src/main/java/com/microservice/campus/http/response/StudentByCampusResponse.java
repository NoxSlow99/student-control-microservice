package com.microservice.campus.http.response;

import com.microservice.campus.controller.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentByCampusResponse {
    private String name;
    private List<StudentDTO> studentDTOList;
}
