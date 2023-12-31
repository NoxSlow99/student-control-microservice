package com.microservice.carrera.service;

import com.microservice.carrera.entities.Carrera;
import com.microservice.carrera.http.response.StudentByCarreraResponse;

import java.util.List;

public interface ICarreraService {

    List<Carrera> findAll();
    Carrera findById(Long id);
    void save(Carrera carrera);

    // * Métodos para que otras API'S puedan consumir el microservicio
    List<String> findAllByIdCampus(Long idCampus);
    List<String> findNameByDivision(Long idDiv);


    // * Métodos que recibe la petición (hacer peticion a otras API'S)
    StudentByCarreraResponse findStudentsByIdCarrera(Long idCarrera);

}
