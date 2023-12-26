package com.microservice.carrera.http.response;

import com.microservice.carrera.controller.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/*
 * Esta clase sirve para tratar la respuesta que proviene del microservicio Student
 * Información devolvida al cliente (Respuesta personalizada)
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentByCarreraResponse {
    private String name;
    private List<StudentDTO> studentDTOList;
}
