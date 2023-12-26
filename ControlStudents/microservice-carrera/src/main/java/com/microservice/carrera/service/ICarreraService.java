package com.microservice.carrera.service;

import com.microservice.carrera.entities.Carrera;
import com.microservice.carrera.http.response.StudentByCarreraResponse;

import java.util.List;

public interface ICarreraService {

    List<Carrera> findAll();

    Carrera findById(Long id);

    void save(Carrera carrera);

    // * Método que recibe la petición
    StudentByCarreraResponse findStudentsByIdCarrera(Long idCarrera);
}
