package com.microservice.campus.service;

import com.microservice.campus.entities.Campus;
import com.microservice.campus.http.response.CarrerasByCampusResponse;
import com.microservice.campus.http.response.DivisionByCampusResponse;
import com.microservice.campus.http.response.StudentByCampusResponse;

import java.util.List;

public interface ICampusService {

    List<Campus> findAll();

    Campus findById(Long idCampus);

    void save(Campus campus);

    // * Campus -> APIS
    StudentByCampusResponse findStudentsByIdCampus(Long idCampus);
    CarrerasByCampusResponse findCarrerasByIdCampus(Long idCampus);
    DivisionByCampusResponse findDivisionByIdCampus (Long idCampus);
}
