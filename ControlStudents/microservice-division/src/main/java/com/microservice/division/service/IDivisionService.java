package com.microservice.division.service;

import com.microservice.division.Http.response.CarrerasByDivisionResponse;
import com.microservice.division.Http.response.StudentsByDivisionResponse;
import com.microservice.division.entities.Division;

import java.util.List;

public interface IDivisionService {

    List<Division> findAll();
    Division findById(Long id);
    void save(Division division);

    // * API -> Division
    List<String> findNameByCampus(Long idCampus);

    // * Division -> API
    CarrerasByDivisionResponse findCarrerasByDivision(Long idDiv);
    StudentsByDivisionResponse findStudentsByDivision(Long idDiv);
}
